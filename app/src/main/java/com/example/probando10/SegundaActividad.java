package com.example.probando10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class SegundaActividad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_actividad);

        Button button =  findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = findViewById(R.id.editText);
                TextView textView = findViewById(R.id.textView);
                String texto = editText.getText().toString();
                textView.setText(texto);
                CheckBox checkBox = findViewById(R.id.checkBox);
                Spinner spinner = findViewById(R.id.spinner);

                if (checkBox.isChecked()){
                    //if (spinner.getSelectedItem().equals("Miercoles")){
                    if(spinner.getSelectedItemPosition() != 2){
                        editText.setError("Error en Dia");
                    }
                }
            }
        });

    }
}

