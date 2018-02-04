package com.example.irmayantisyam.irma_1202154347_modul1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by IRMAYANTI SYAM on 2/4/2018.
 */

public class SecActivity extends AppCompatActivity {
    TextView cafe1;
    TextView menu1;
    TextView porsi1;
    TextView harga;
    private int uang = 65500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sec_activity);

        cafe1 = findViewById(R.id.cafe);
        menu1 = findViewById(R.id.menu);
        porsi1 = findViewById(R.id.porsi);
        harga = findViewById(R.id.harga);

        Intent akumulasi = getIntent();

        String cafe = akumulasi.getStringExtra("cafe");
        String menu = akumulasi.getStringExtra("menu");
        String porsi = akumulasi.getStringExtra("porsi");
        String harga2 = akumulasi.getStringExtra("harga");

        int totalseluruhnya = Integer.valueOf(porsi) * Integer.valueOf(harga2);

        cafe1.setText(cafe);
        menu1.setText(menu);
        porsi1.setText(porsi);
        harga.setText(String.valueOf(totalseluruhnya));

        if (totalseluruhnya <= uang) {
            Toast.makeText(this, "MAKAN MALAM DISINI AJA, BRE!!!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "JANGAN MAKAN DISINI. UANGMU TIDAK CUKUP!!! HEHEHE", Toast.LENGTH_SHORT).show();
        }
    }
}