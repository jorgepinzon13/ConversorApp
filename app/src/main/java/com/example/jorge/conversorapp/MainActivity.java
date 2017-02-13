package com.example.jorge.conversorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText ePesos,eEuros;
    Button bConvertir;

    Double pesos, euros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ePesos = (EditText) findViewById(R.id.pesos);
        eEuros = (EditText) findViewById(R.id.euros);
        bConvertir = (Button) findViewById(R.id.boton);



        bConvertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (ePesos.getText().toString().equals("")&& !eEuros.getText().toString().equals("")){
                   // pesos = Double.parseDouble(ePesos.getText().toString());
                    euros = Double.parseDouble(eEuros.getText().toString());
                    pesos = euros * 3500;
                    ePesos.setText(pesos.toString());
                }


                if (eEuros.getText().toString().equals("")&& !ePesos.getText().toString().equals("")){
                    pesos = Double.parseDouble(ePesos.getText().toString());
                    //euros = Double.parseDouble(eEuros.getText().toString());
                    euros = pesos / 3500;
                    eEuros.setText(euros.toString());
                }


            }

        });


    }
}
