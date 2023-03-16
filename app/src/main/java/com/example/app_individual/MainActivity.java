package com.example.app_individual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Base64;

public class MainActivity extends AppCompatActivity {

    Button Siguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Siguiente= (Button) findViewById(R.id.ventana2);

        Siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity (new Intent ( createPackageContext MainActivity.this, MainActivity2.class)));

            }
        });
    }



}