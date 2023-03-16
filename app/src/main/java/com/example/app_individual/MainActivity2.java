package com.example.app_individual;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Base64;

public class MainActivity2 extends AppCompatActivity {

    EditText nombre, edad, telefono, correo;

    Button aceptar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nombre = (EditText) findViewById(R.id.editNombre);
        edad = (EditText) findViewById(R.id.editEdad);
        telefono = (EditText) findViewById(R.id.editTelefono);
        correo = (EditText) findViewById(R.id.editCorreo);


        aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = nombre.getText().toString();
                String age = edad.getText().toString();
                String phone = telefono.getText().toString();
                String email = correo.getText().toString();

                startActivity  (new Intent (createPackageContext MainActivity2.this, MainActivity3.class)));

                startActivity.putExtra("name", name);
                startActivity.putExtra("age", age);
                startActivity.putExtra("phone", phone);
                startActivity.putExtra("email", email);

            }
        });
    }
}