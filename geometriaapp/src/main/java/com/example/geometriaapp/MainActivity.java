package com.example.geometriaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText eT1,eT1a,eT2,eT2a,ePerimetro,eArea,eVolumen;
    RadioButton rb1,rb2,rb3,rb4;
    Button bCalc,bBorr;
    String a,b;

    Double d1,d2,per,area,vol;

    int x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eT1=(EditText)findViewById(R.id.eT1);
        eT1a=(EditText)findViewById(R.id.eT1a);
        eT2=(EditText)findViewById(R.id.eT2);
        eT2a=(EditText)findViewById(R.id.eT2a);
        ePerimetro=(EditText)findViewById(R.id.ePerimetro);
        eArea=(EditText)findViewById(R.id.eArea);
        eVolumen=(EditText)findViewById(R.id.eVolumen);

        rb1= (RadioButton)findViewById(R.id.rb1);
        rb2= (RadioButton)findViewById(R.id.rb2);
        rb3= (RadioButton)findViewById(R.id.rb3);
        rb4= (RadioButton)findViewById(R.id.rb4);

        bCalc=(Button)findViewById(R.id.bCalc);
        bBorr=(Button)findViewById(R.id.bBorr);


        a="";
        b="";

        bCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (x==1){

                    d1 = Double.parseDouble(eT1a.getText().toString());
                    d2 = Double.parseDouble(eT2a.getText().toString());
                    per=d1+d2+(Math.sqrt((Math.pow(d1,2))+(Math.pow(d2,2))));
                    area=(d1*d2)/2;
                    vol=0.0;
                }

                if (x==2){

                    d1 = Double.parseDouble(eT1a.getText().toString());
                    per=d1*4;
                    area=Math.pow(d1,2);
                    vol=0.0;
                }
                if (x==3){

                    d1 = Double.parseDouble(eT1a.getText().toString());
                    per=2*(Math.PI)*d1;
                    area=(Math.pow(d1,2))*(Math.PI);
                    vol=0.0;
                }
                if (x==4){

                    d1 = Double.parseDouble(eT1a.getText().toString());
                    per=12*d1;
                    area=6*(Math.pow(d1,2));
                    vol=Math.pow(d1,3);
                }


                ePerimetro.setText(String.format("%.2f",per));
                eArea.setText(String.format("%.2f",area));
                eVolumen.setText(String.format("%.2f",vol));


            }
        });


        bBorr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                rb1.setChecked(false);
                rb2.setChecked(false);
                rb3.setChecked(false);
                rb4.setChecked(false);

                eT1.setText("");
                eT1a.setText("");
                eT2.setText("");
                eT2a.setText("");
                ePerimetro.setText("");
                eArea.setText("");
                eVolumen.setText("");



            }
        });
    }

    public void Clicked (View view){

        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()){

            case R.id.rb1:

                a="La base";
                b="La altura";
                eT1.setText(a);
                eT2.setText(b);

                x=1;

                break;

            case R.id.rb2:

                a="El lado";
                eT1.setText(a);
                eT2.setBackgroundColor(000000);
                eT2.setFocusableInTouchMode(false);
                eT2a.setBackgroundColor(000000);
                eT2a.setFocusableInTouchMode(false);

                x=2;

                break;

            case R.id.rb3:

                a="El radio";
                eT1.setText(a);
                eT2.setBackgroundColor(000000);
                eT2.setFocusableInTouchMode(false);
                eT2a.setBackgroundColor(000000);
                eT2a.setFocusableInTouchMode(false);

                x=3;

                break;

            case R.id.rb4:

                a="El lado";
                eT1.setText(a);
                eT2.setBackgroundColor(000000);
                eT2.setFocusableInTouchMode(false);
                eT2a.setBackgroundColor(000000);
                eT2a.setFocusableInTouchMode(false);

                x=4;

                break;

        }
    }




}
