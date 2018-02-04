package com.example.irmayantisyam.irma_1202154347_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText menu1, porsi1;
    Button eatbus, abnormal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menu1 = findViewById(R.id.menu);
        porsi1 = findViewById(R.id.porsi);
        eatbus = findViewById(R.id.btEatbus);
        abnormal = findViewById(R.id.btAbnormal);

        eatbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent move = new Intent(MainActivity.this, SecActivity.class);
                move.putExtra("cafe", "Eatbus");
                move.putExtra("menu", menu1.getText().toString());
                move.putExtra("porsi", porsi1.getText().toString());
                move.putExtra("harga", "50000");
                startActivity(move);
            }
        });

        abnormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent move = new Intent(MainActivity.this,SecActivity.class);
                move.putExtra("cafe", "Abnormal");
                move.putExtra("menu", menu1.getText().toString());
                move.putExtra("porsi", porsi1.getText().toString());
                move.putExtra("harga", "30000");
                startActivity(move);
            }
        });
    }
}
