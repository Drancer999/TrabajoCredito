package com.example.probando10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

   /* public void onClickImg(View v)
    {
        Toast.makeText(this, "Aqui estoy yo", Toast.LENGTH_SHORT).show();
    }*/

    public void onClick(View v) {

        if (v.getId() == R.id.ibMensaje) {
            Toast.makeText(this, "Boton de la imagen", Toast.LENGTH_SHORT).show();
        }
        else
            {
            Intent intent = new Intent(getBaseContext(), ActividadTercera.class);
            startActivity(intent);
            }
           // Toast.makeText(this, "Te la Creiste XD XD XD", Toast.LENGTH_SHORT).show();
    }
}
