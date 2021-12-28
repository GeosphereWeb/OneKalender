package com.example.onekalender;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textJahr = findViewById(R.id.textViewJahr);
        textJahr.setText("Jahr");




        TextView textMonat = findViewById(R.id.textViewMonat);
        textMonat.setText("Monat");

        Button pfeilLinks= findViewById(R.id.buttonPfeilLinks);
        pfeilLinks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textJahr.setText("Jahr-1");
            }
        });

        Button pfeilRechts= findViewById(R.id.buttonPfeilRechts);
        pfeilRechts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textJahr.setText("Jahr+1");
            }
        });


    }




}