package com.example.probando10;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class ActividadCuarta extends AppCompatActivity {
    EditText editMonto1;
    EditText editPlazo1;

    EditText editFecha1;
    EditText editFecha2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_cuarta);
        editMonto1 = (EditText)findViewById(R.id.editText15);
        editPlazo1 = (EditText)findViewById(R.id.editText16);
        editFecha1 = (EditText)findViewById(R.id.editText13);
        editFecha2 = (EditText)findViewById(R.id.editText14);
        Date fecha = new Date();
        SimpleDateFormat hoy = new SimpleDateFormat("dd-mm-yyyy", Locale.getDefault());
        editFecha1.setText(hoy.format(fecha));

        editMonto1.addTextChangedListener(new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
            //EditText editMonto = findViewById(R.id.editText15);
            // EditText editPlazo = findViewById(R.id.editText16);
            TextView textPagar = findViewById(R.id.textView19);
            TextView textCuota = findViewById(R.id.textView20);
            Spinner spinnerInteres = findViewById(R.id.spinner3);
            String Monto = editMonto1.getText().toString();
            String Plazo = editPlazo1.getText().toString();
            int mon = 0;
            int pla = 0;
            if (!TextUtils.isEmpty(editMonto1.getText().toString()) && !TextUtils.isEmpty(editPlazo1.getText().toString())) {
                mon = Integer.parseInt(Monto);
                pla = Integer.parseInt(Plazo);
            double totalpagar = 0;
            double totalcuota = 0;
                if (spinnerInteres.getSelectedItem().equals("15")) {
                    totalpagar = (mon * 0.15) + mon;
                    totalcuota = totalpagar / pla;
                }
                if (spinnerInteres.getSelectedItem().equals("20")) {
                    totalpagar = (mon * 0.20) + mon;
                    totalcuota = totalpagar / pla;
                }
                if (spinnerInteres.getSelectedItem().equals("25")) {
                    totalpagar = (mon * 0.25) + mon;
                    totalcuota = totalpagar / pla;
                }
                textCuota.setText(String.valueOf(totalcuota));
                textPagar.setText(String.valueOf(totalpagar));
            }
        }
    });

     editPlazo1.addTextChangedListener(new TextWatcher() {
         @Override
         public void beforeTextChanged(CharSequence s, int start, int count, int after) {

         }

         @Override
         public void onTextChanged(CharSequence s, int start, int before, int count) {

         }

         @Override
         public void afterTextChanged(Editable s) {
             //EditText editMonto = findViewById(R.id.editText15);
             // EditText editPlazo = findViewById(R.id.editText16);
             TextView textPagar = findViewById(R.id.textView19);
             TextView textCuota = findViewById(R.id.textView20);
             Spinner spinnerInteres = findViewById(R.id.spinner3);
             String Monto = editMonto1.getText().toString();
             String Plazo = editPlazo1.getText().toString();
             int mon = 0;
             int pla = 0;
             if (!TextUtils.isEmpty(editMonto1.getText().toString()) && !TextUtils.isEmpty(editPlazo1.getText().toString())) {
                 mon = Integer.parseInt(Monto);
                 pla = Integer.parseInt(Plazo);
             double totalpagar = 0;
             double totalcuota = 0;
                 if (spinnerInteres.getSelectedItem().equals("15")) {
                     totalpagar = (mon * 0.15) + mon;
                     totalcuota = totalpagar / pla;
                 }
                 if (spinnerInteres.getSelectedItem().equals("20")) {
                     totalpagar = (mon * 0.20) + mon;
                     totalcuota = totalpagar / pla;
                 }
                 if (spinnerInteres.getSelectedItem().equals("25")) {
                     totalpagar = (mon * 0.25) + mon;
                     totalcuota = totalpagar / pla;
                 }
                 textCuota.setText(String.valueOf(totalcuota));
                 textPagar.setText(String.valueOf(totalpagar));
             }
         }
     });
    }

   public void onChange (View v){
    EditText editMonto = findViewById(R.id.editText15);
    EditText editPlazo = findViewById(R.id.editText16);
    TextView textPagar = findViewById(R.id.textView19);
    TextView textCuota = findViewById(R.id.textView20);
    Spinner spinnerInteres = findViewById(R.id.spinner3);
    String Monto = editMonto.getText().toString();
    String Plazo = editPlazo.getText().toString();
    int mon = Integer.parseInt(Monto);
    int pla = Integer.parseInt(Plazo);
    double totalpagar = 0;
    double totalcuota = 0;
       if (spinnerInteres.getSelectedItem().equals("15")){
           totalpagar = (mon * 0.15) + mon;
           totalcuota = totalpagar / pla;
       }
       if (spinnerInteres.getSelectedItem().equals("20")){
           totalpagar = (mon * 0.20) + mon;
           totalcuota = totalpagar / pla;
       }
       if (spinnerInteres.getSelectedItem().equals("25")){
           totalpagar = (mon * 0.25) + mon;
           totalcuota = totalpagar / pla;
       }
       textCuota.setText(String.valueOf(totalcuota));
       textPagar.setText(String.valueOf(totalpagar));
    }
}

