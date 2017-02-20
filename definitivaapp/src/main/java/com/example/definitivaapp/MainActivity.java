package com.example.definitivaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText ePractica, eAvance1, eAvance2, eAvance3, eAppfinal, eDef;

    Button bCalcular, bBorrar;

    Double n1, n2, n3, n4, n5, ndef,ndef2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ePractica = (EditText) findViewById(R.id.ePractica);
        eAvance1 = (EditText) findViewById(R.id.eAvance1);
        eAvance2 = (EditText) findViewById(R.id.eAvance2);
        eAvance3 = (EditText) findViewById(R.id.eAvance3);
        eAppfinal = (EditText) findViewById(R.id.eAppfinal);
        eDef = (EditText) findViewById(R.id.eDef);
        bCalcular = (Button) findViewById(R.id.bCalcular);
        bBorrar = (Button) findViewById(R.id.bBorrar);

        bCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (!ePractica.getText().toString().equals("") && !eAvance1.getText().toString().equals("") && !eAvance2.getText().toString().equals("") && !eAvance3.getText().toString().equals("") && !eAppfinal.getText().toString().equals("")) {

                    n1 = Double.parseDouble(ePractica.getText().toString());
                    n2 = Double.parseDouble(eAvance1.getText().toString());
                    n3 = Double.parseDouble(eAvance2.getText().toString());
                    n4 = Double.parseDouble(eAvance3.getText().toString());
                    n5 = Double.parseDouble(eAppfinal.getText().toString());

                    if (n1>5.0 || n2>5.0 || n3>5.0 || n4>5.0 || n5>5.0){

                        Toast.makeText(getApplicationContext(), "El rango de la calificación debe estar entre 0.0 y 5.0", Toast.LENGTH_SHORT).show();

                        n1=0.0;
                        n2=0.0;
                        n3=0.0;
                        n4=0.0;
                        n5=0.0;
                        ndef=0.0;
                        ePractica.setText("");
                        eAvance1.setText("");
                        eAvance2.setText("");
                        eAvance3.setText("");
                        eAppfinal.setText("");
                        eDef.setText("");

                    }

                        ndef = (n1 * 0.6) + (n2 * 0.05) + (n3 * 0.07) + (n4 * 0.08) + (n5 * 0.2);
                        eDef.setText(String.format("%.2f",ndef));


                }


                if (ndef <= 1) {

                    Toast.makeText(getApplicationContext(), "Estás en el lugar equivoado", Toast.LENGTH_SHORT).show();
                }
                if (ndef > 1 && ndef <= 2) {

                    Toast.makeText(getApplicationContext(), "Remal", Toast.LENGTH_SHORT).show();
                }

                if (ndef > 2 && ndef <= 3) {

                    Toast.makeText(getApplicationContext(), "Es posible recuperarse", Toast.LENGTH_SHORT).show();
                }

                if (ndef > 3 && ndef <= 4) {

                    Toast.makeText(getApplicationContext(), "Normalito", Toast.LENGTH_SHORT).show();
                }

                if (ndef > 4 && ndef <= 4.5) {

                    Toast.makeText(getApplicationContext(), "Muy bien", Toast.LENGTH_SHORT).show();
                }

                if (ndef > 4.5 && ndef <= 5) {

                    Toast.makeText(getApplicationContext(), "Excelente estudiante", Toast.LENGTH_SHORT).show();
                }

            }
        });

        bBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ndef=0.0;
                ePractica.setText("");
                eAvance1.setText("");
                eAvance2.setText("");
                eAvance3.setText("");
                eAppfinal.setText("");
                eDef.setText("");


            }

        });
    }
}
