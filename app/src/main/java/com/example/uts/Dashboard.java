package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        Button btnMlbb = findViewById(R.id.buttonmlbb);

        btnMlbb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),MLBB.class);
                startActivity(i);
            }
        });

        Button btnPubgm = findViewById(R.id.buttonpubg);

        btnPubgm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),PUBGM.class);
                startActivity(i);
            }
        });

        Button btnCodm = findViewById(R.id.buttoncod);

        btnCodm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), CODM.class);
                startActivity(i);
            }
        });

        Button btnCoc = findViewById(R.id.buttoncoc);

        btnCoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), COC.class);
                startActivity(i);
            }
        });

        Button btnAov = findViewById(R.id.buttonaov);

        btnAov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),AOV.class);
                startActivity(i);
            }
        });

        Button btnLsi = findViewById(R.id.buttonlsi);

        btnLsi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),LSI.class);
                startActivity(i);
            }
        });
    }
}
