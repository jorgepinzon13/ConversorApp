package com.example.calculadoraapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText eResultado;
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bSum,bRes,bPor,bDiv,bPun,bC,bIgu;

    String resultado,total;

    Double acum;

    int x;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eResultado= (EditText) findViewById(R.id.eResultado);

        total="";

        b0= (Button) findViewById(R.id.b0);
        b1= (Button) findViewById(R.id.b1);
        b2= (Button) findViewById(R.id.b2);
        b3= (Button) findViewById(R.id.b3);
        b4= (Button) findViewById(R.id.b4);
        b5= (Button) findViewById(R.id.b5);
        b6= (Button) findViewById(R.id.b6);
        b7= (Button) findViewById(R.id.b7);
        b8= (Button) findViewById(R.id.b8);
        b9= (Button) findViewById(R.id.b9);
        bSum= (Button) findViewById(R.id.bSum);
        bRes= (Button) findViewById(R.id.bRes);
        bPor= (Button) findViewById(R.id.bPor);
        bDiv= (Button) findViewById(R.id.bDiv);
        bIgu= (Button) findViewById(R.id.bIgu);
        bPun= (Button) findViewById(R.id.bPun);
        bC= (Button) findViewById(R.id.bC);




    }

    public void click (View view){

        int id = view.getId();

        switch (id){
            case R.id.b0:
                resultado= "0";
                eResultado.setText(resultado.toString());
                break;

            case R.id.b1:
                resultado= "1";
                eResultado.setText(resultado.toString());
                break;

            case R.id.b2:
                resultado= "2";
                eResultado.setText(resultado.toString());
                break;

            case R.id.b3:
                resultado= "3";
                eResultado.setText(resultado.toString());
                break;

            case R.id.b4:
                resultado= "4";
                eResultado.setText(resultado.toString());
                break;

            case R.id.b5:
                resultado= "5";
                eResultado.setText(resultado.toString());
            break;

            case R.id.b6:
                resultado= "6";
                eResultado.setText(resultado.toString());
            break;

            case R.id.b7:
                resultado= "7";
                eResultado.setText(resultado.toString());
            break;

            case R.id.b8:
                resultado= "8";
                eResultado.setText(resultado.toString());
            break;

            case R.id.b9:
                resultado= "9";
                eResultado.setText(resultado.toString());
            break;


            case R.id.bSum:
                acum=Double.parseDouble(total);
                x=1;
                resultado= "+";
                eResultado.setText(resultado.toString());

                break;

            case R.id.bRes:
                acum=Double.parseDouble(total);
                x=2;
                resultado= "-";
                eResultado.setText(resultado.toString());
                break;

            case R.id.bPor:
                acum=Double.parseDouble(total);
                x=3;
                resultado= "*";
                eResultado.setText(resultado.toString());
                break;

            case R.id.bDiv:
                acum=Double.parseDouble(total);
                x=4;
                resultado= "/";
                eResultado.setText(resultado.toString());
                break;

            case R.id.bPun:
                resultado= ".";
                eResultado.setText(resultado.toString());
                break;

            case R.id.bC:
                resultado= "";
                total="";
                eResultado.setText(resultado.toString());
                break;

            case R.id.bIgu:
                acum=Double.parseDouble(total);
                total="";
                resultado="";
                total=acum.toString();
                break;


        }

        total=total+resultado;
        eResultado.setText(total);

    }
}
