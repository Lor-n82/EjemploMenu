package com.example.in2dm3_03.ejemplomenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Recibir extends AppCompatActivity {

    private TextView recoger;
    private String texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recibir);

        recoger=(TextView)findViewById(R.id.textViewRecoger);

        texto=getIntent().getStringExtra("texto");

        recoger.setText(texto);


    }
}
