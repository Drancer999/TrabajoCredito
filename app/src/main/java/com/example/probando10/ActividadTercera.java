package com.example.probando10;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActividadTercera extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_tercera);

        Button button =  findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                EditText editTextName = findViewById(R.id.editText3);
                EditText editTextApe = findViewById(R.id.editText4);
                EditText editTextTel = findViewById(R.id.editText2);
                EditText editTextDire = findViewById(R.id.editText7);
                EditText editTextCed = findViewById(R.id.editText5);
                String name = editTextName.getText().toString();
                String apellido = editTextApe.getText().toString();
                String telefono = editTextTel.getText().toString();
                String direccion = editTextDire.getText().toString();
                String cedula = editTextCed.getText().toString();

                if (name.length() !=0 & apellido.length() !=0 & telefono.length() !=0 & direccion.length() != 0 & cedula.length() !=0){
                    Intent intent2 = new Intent(getBaseContext(), ActividadCuarta.class);
                    startActivity(intent2);

                }
                else{
                    if (cedula.length() == 0 ){
                        editTextCed.setError("Campo Obloigatorio");
                    }
                    if (apellido.length() ==0 ) {
                        editTextApe.setError("Campo Obloigatorio");
                    }
                    if (direccion.length()==0 ) {
                        editTextDire.setError("Campo Obloigatorio");
                    }
                    if (name.length() ==0 ) {
                        editTextName.setError("Campo Obloigatorio");
                    }
                    if (telefono.length() ==0 ) {
                        editTextTel.setError("Campo Obloigatorio");
                    }
                }
            }

        });

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        //FloatingActionButton fab = findViewById(R.id.fab);
        //fab.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //    public void onClick(View view) {
        //        Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
        //                .setAction("Action", null).show();
        //   }
        //});
    }

}
