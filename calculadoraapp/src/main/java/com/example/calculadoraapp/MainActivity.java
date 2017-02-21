package com.example.calculadoraapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText eResultado,eResultadoPrevio;
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bSum,bRes,bPor,bDiv,bPun,bC,bIgu;

    String resultado,resultadoprevio,total,totalprevio;

    Double acum,res;

    int x,y;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eResultadoPrevio= (EditText) findViewById(R.id.eResultadoPrevio);
        eResultado= (EditText) findViewById(R.id.eResultado);

        total="";
        totalprevio="";
        resultadoprevio="";

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
                eResultadoPrevio.setText(resultado.toString());
                y=0;
                break;

            case R.id.b1:
                resultado= "1";
                eResultado.setText(resultado.toString());
                eResultadoPrevio.setText(resultado.toString());
                y=0;
                break;

            case R.id.b2:
                resultado= "2";
                eResultado.setText(resultado.toString());
                eResultadoPrevio.setText(resultado.toString());
                y=0;
                break;

            case R.id.b3:
                resultado= "3";
                eResultado.setText(resultado.toString());
                eResultadoPrevio.setText(resultado.toString());
                y=0;
                break;

            case R.id.b4:
                resultado= "4";
                eResultado.setText(resultado.toString());
                eResultadoPrevio.setText(resultado.toString());
                y=0;
                break;

            case R.id.b5:
                resultado= "5";
                eResultado.setText(resultado.toString());
                eResultadoPrevio.setText(resultado.toString());
                y=0;
                break;

            case R.id.b6:
                resultado= "6";
                eResultado.setText(resultado.toString());
                eResultadoPrevio.setText(resultado.toString());
                y=0;
                break;

            case R.id.b7:
                resultado= "7";
                eResultado.setText(resultado.toString());
                eResultadoPrevio.setText(resultado.toString());
                y=0;
                break;

            case R.id.b8:
                resultado= "8";
                eResultado.setText(resultado.toString());
                eResultadoPrevio.setText(resultado.toString());
                y=0;
                break;

            case R.id.b9:
                resultado= "9";
                eResultado.setText(resultado.toString());
                eResultadoPrevio.setText(resultado.toString());
                y=0;
                break;


            case R.id.bSum:
                if (x>0){
                    Toast.makeText(getApplicationContext(),"Por favor primero indique un número",Toast.LENGTH_SHORT).show();
                }

                if (eResultado.getText().toString().equals("0") && eResultadoPrevio.getText().toString().equals("")){
                    resultado= "0";
                    total="";
                    resultadoprevio="";
                    eResultado.setText(resultado.toString());
                    eResultadoPrevio.setText(resultado.toString());
                    Toast.makeText(getApplicationContext(),"Por favor primero indique un número",Toast.LENGTH_SHORT).show();

                }
                if (x==0){
                acum = Double.parseDouble(total);
                x = 1;
                resultadoprevio = total + "+";
                eResultadoPrevio.setText(resultadoprevio.toString());
                resultado = "";
                total = "";
                eResultado.setText(resultado.toString());
                }
                y=1;
                break;

            case R.id.bRes:
                if (x>0){
                    Toast.makeText(getApplicationContext(),"Por favor primero indique un número",Toast.LENGTH_SHORT).show();
                }
                if (eResultado.getText().toString().equals("0") && eResultadoPrevio.getText().toString().equals("")){
                    resultado= "0";
                    total="";
                    resultadoprevio="";
                    eResultado.setText(resultado.toString());
                    eResultadoPrevio.setText(resultado.toString());
                    Toast.makeText(getApplicationContext(),"Por favor primero indique un número",Toast.LENGTH_SHORT).show();

                }
                if (x==0){
                acum = Double.parseDouble(total);
                x = 2;
                resultadoprevio = total + "-";
                eResultadoPrevio.setText(resultadoprevio.toString());
                resultado = "";
                total = "";
                eResultado.setText(resultado.toString());
            }

                y=1;
                break;

            case R.id.bPor:
                if (x>0){
                    Toast.makeText(getApplicationContext(),"Por favor primero indique un número",Toast.LENGTH_SHORT).show();
                }
                if (eResultado.getText().toString().equals("0") && eResultadoPrevio.getText().toString().equals("")){
                    resultado= "0";
                    total="";
                    resultadoprevio="";
                    eResultado.setText(resultado.toString());
                    eResultadoPrevio.setText(resultado.toString());
                    Toast.makeText(getApplicationContext(),"Por favor primero indique un número",Toast.LENGTH_SHORT).show();

                }
                if (x==0){
                acum = Double.parseDouble(total);
                x = 3;
                resultadoprevio = total + "x";
                eResultadoPrevio.setText(resultadoprevio.toString());
                resultado = "";
                total = "";
                eResultado.setText(resultado.toString());
            }

                y=1;
            break;

            case R.id.bDiv:
                if (x>0){
                    Toast.makeText(getApplicationContext(),"Por favor primero indique un número",Toast.LENGTH_SHORT).show();
                }
                if (eResultado.getText().toString().equals("0") && eResultadoPrevio.getText().toString().equals("")){
                    resultado= "0";
                    total="";
                    resultadoprevio="";
                    eResultado.setText(resultado.toString());
                    eResultadoPrevio.setText(resultado.toString());
                    Toast.makeText(getApplicationContext(),"Por favor primero indique un número",Toast.LENGTH_SHORT).show();
                }
                if (x==0){
                acum = Double.parseDouble(total);
                x = 4;
                resultadoprevio = total + "÷";
                eResultadoPrevio.setText(resultadoprevio.toString());
                resultado = "";
                total = "";
                eResultado.setText(resultado.toString());
            }

                y=1;
                break;

            case R.id.bPun:
                resultado= ".";
                eResultado.setText(resultado.toString());
                eResultadoPrevio.setText(resultado.toString());
                y=0;
                break;

            case R.id.bC:
                resultado= "0";
                total="";
                resultadoprevio="";
                res=0.0;
                eResultado.setText(resultado.toString());
                eResultadoPrevio.setText(resultado.toString());
                y=0;
                break;

            case R.id.bIgu:
                if (y==1){
                    Toast.makeText(getApplicationContext(),"Por favor primero indique un número",Toast.LENGTH_SHORT).show();

                }
                if (y==0) {
                    resultado = "";
                    resultadoprevio = "";
                    switch (x) {

                        case 1:
                            res = Double.parseDouble(total);
                            res = acum + res;

                            break;


                        case 2:
                            res = Double.parseDouble(total);
                            res = acum - res;

                            break;

                        case 3:
                            res = Double.parseDouble(total);
                            res = acum * res;
                            break;

                        case 4:
                            res = Double.parseDouble(total);
                            res = acum / res;
                            break;

                    }

                    total = String.format("%.2f", res);
                    x = 0;
                }

                break;


        }



        total=total+resultado;
        totalprevio=resultadoprevio+total;
        eResultadoPrevio.setText(totalprevio);
        eResultado.setText(total);

    }
}
