package com.example.app_individual;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Base64;

public class MainActivity3 extends AppCompatActivity {

    TextView tvnombre, tvedad, tvtelefono, tvcorreo;

    Button btnsalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        tvnombre = (TextView) findViewById(R.id.tvNombre);
        tvedad = (TextView) findViewById(R.id.tvEdad);
        tvtelefono = (TextView) findViewById(R.id.tvTelefono);
        tvcorreo = (TextView) findViewById(R.id.tvCorreo);

        btnsalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity (new Intent (createPackageContext(MainActivity3.this, MainActivity.class)));

            }
        });

                mostrarDatosDigitados();
    }



    private void mostrarDatosDigitados() {
        Bundle datos = this.getIntent().getExtras();
        String nombre = datos.getString( "name");
        String edad = datos.getString( "age");
        String telefono = datos.getString("phone");
        String correo = datos.getString("email");

        tvnombre.setText(nombre);
        tvedad.setText(edad);
        tvtelefono.setText(telefono);
        tvcorreo.setText(correo);

    }
}