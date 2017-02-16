package com.example.definitivaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText ePractica, eAvance1, eAvance2, eAvance3, eAppfinal,eDef;

    Button bCalcular;

    Double n1,n2,n3,n4,n5,ndef;




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

        bCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!ePractica.getText().toString().equals("") && !eAvance1.getText().toString().equals("") &&!eAvance2.getText().toString().equals("") &&!eAvance3.getText().toString().equals("") &&!eAppfinal.getText().toString().equals("") ) {

                    n1 = Double.parseDouble(ePractica.getText().toString());
                    n2 = Double.parseDouble(eAvance1.getText().toString());
                    n3 = Double.parseDouble(eAvance2.getText().toString());
                    n4 = Double.parseDouble(eAvance3.getText().toString());
                    n5 = Double.parseDouble(eAppfinal.getText().toString());

                    ndef= (n1*0.6)+(n2*0.05)+(n3*0.07)+(n4*0.08)+(n5*0.2);
                    eDef.setText(ndef.toString());
                }


                if (ndef<=1){

                    Toast.makeText(getApplicationContext(),"Estás en el lugar equivoado",Toast.LENGTH_SHORT).show();
                }
                if (ndef>1 && ndef<=2){

                    Toast.makeText(getApplicationContext(),"Remal",Toast.LENGTH_SHORT).show();
                }

                if (ndef>2 && ndef<=3){

                    Toast.makeText(getApplicationContext(),"Es posible recuperarse",Toast.LENGTH_SHORT).show();
                }

                if (ndef>3 && ndef<=4){

                    Toast.makeText(getApplicationContext(),"Normalito",Toast.LENGTH_SHORT).show();
                }

                if (ndef>4 && ndef<=4.5){

                    Toast.makeText(getApplicationContext(),"Muy bien",Toast.LENGTH_SHORT).show();
                }

                if (ndef>4.5 && ndef<=5){

                    Toast.makeText(getApplicationContext(),"Excelente estudiante",Toast.LENGTH_SHORT).show();
                }

            }
        });



    }
}
