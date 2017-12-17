package com.overne.petagram;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Contacto extends AppCompatActivity {

    private Button buttonEnviar;
    ImageView imagenDerecha;
    TextInputEditText nombre;
    TextInputEditText emaill;
    TextInputEditText descripcion;
    TextInputEditText passwor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);

        Toolbar miActionBar= (Toolbar)findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ((TextView) findViewById(R.id.toolbar_title)).setText("Contacto");
        imagenDerecha=((ImageView)findViewById(R.id.imagenDerecha));
        imagenDerecha.setVisibility(View.INVISIBLE);

        buttonEnviar= (Button) findViewById(R.id.buttonEnviar);

        buttonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                nombre = (TextInputEditText) findViewById(R.id.nombre2);
                emaill = (TextInputEditText) findViewById(R.id.emaill2);
                descripcion = (TextInputEditText) findViewById(R.id.descripcion2);
                passwor = (TextInputEditText) findViewById(R.id.passwor);

                EmailSender emailSender = new EmailSender();
                emailSender.execute(emaill.getText().toString(),passwor.getText().toString(),"sherry09@gmail.com",
                        "desde Android",descripcion.getText().toString(),"/home/overne/Descargas/Wolf-48.png");

                Intent i = new Intent(Contacto.this, MainActivity.class);
                startActivity(i);
            }
        });

    }

}
