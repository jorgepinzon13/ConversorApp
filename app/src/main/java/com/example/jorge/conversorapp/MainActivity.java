package com.example.jorge.conversorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ePesos,eDolares;
    Button bConvertir,bBorrar;

    Double pesos, dolares;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ePesos = (EditText) findViewById(R.id.pesos);
        eDolares = (EditText) findViewById(R.id.dolares);
        bConvertir = (Button) findViewById(R.id.boton);
        bBorrar = (Button) findViewById(R.id.bBorrar);


        bBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pesos=0.0;
                dolares=0.0;
                ePesos.setText("");
                eDolares.setText("");


            }
        });

        bConvertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if ( !eDolares.getText().toString().equals("") && !ePesos.getText().toString().equals("") ) {
                    Toast.makeText(getApplicationContext(),"Por favor digite un valor en sólo uno de los dos campos",Toast.LENGTH_SHORT).show();
                }


                if (ePesos.getText().toString().equals("")&& !eDolares.getText().toString().equals("")){
                   dolares = Double.parseDouble(eDolares.getText().toString());
                   pesos = dolares * 3000;
                   ePesos.setText(String.format("%.2f",pesos)+" COP");
                   eDolares.setText(String.format("%.2f",dolares)+" USD");
                }


                if (eDolares.getText().toString().equals("")&& !ePesos.getText().toString().equals("")){
                    pesos = Double.parseDouble(ePesos.getText().toString());
                    dolares = pesos / 3000;
                    eDolares.setText(String.format("%.2f",dolares)+" USD");
                    ePesos.setText(String.format("%.2f",pesos)+" COP");

                }

                if ( eDolares.getText().toString().equals("") && ePesos.getText().toString().equals("") ) {
                    Toast.makeText(getApplicationContext(),"Por favor digite un valor a convertir en alguno de los dos campos",Toast.LENGTH_SHORT).show();
                }


            }

        });


    }
}
