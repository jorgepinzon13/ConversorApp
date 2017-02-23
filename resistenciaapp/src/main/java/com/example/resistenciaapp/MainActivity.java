package com.example.resistenciaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    EditText eRes,eTol;

    Button bCalc, bBorr;

    RadioButton rb11,rb12,rb13,rb14,rb15,rb16,rb17,rb18,rb19,rb110,rb21,rb22,rb23,rb24,rb25,rb26,rb27,rb28,rb29,rb210,rb31,rb32,rb33,rb34,rb35,rb36,rb37,rb38,rb39,rb310,rb41,rb42,rb43;

    Double  a,b,c,d,res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eRes= (EditText)findViewById(R.id.eRes);
        eTol= (EditText)findViewById(R.id.eTol);


        bCalc= (Button)findViewById(R.id.bCalc);
        bBorr=(Button)findViewById(R.id.bBorr);

        rb11=(RadioButton)findViewById(R.id.rb11);
        rb12=(RadioButton)findViewById(R.id.rb12);
        rb13=(RadioButton)findViewById(R.id.rb13);
        rb14=(RadioButton)findViewById(R.id.rb14);
        rb15=(RadioButton)findViewById(R.id.rb15);
        rb16=(RadioButton)findViewById(R.id.rb16);
        rb17=(RadioButton)findViewById(R.id.rb17);
        rb18=(RadioButton)findViewById(R.id.rb18);
        rb19=(RadioButton)findViewById(R.id.rb19);
        rb110=(RadioButton)findViewById(R.id.rb110);

        rb21=(RadioButton)findViewById(R.id.rb21);
        rb22=(RadioButton)findViewById(R.id.rb22);
        rb23=(RadioButton)findViewById(R.id.rb23);
        rb24=(RadioButton)findViewById(R.id.rb24);
        rb25=(RadioButton)findViewById(R.id.rb25);
        rb26=(RadioButton)findViewById(R.id.rb26);
        rb27=(RadioButton)findViewById(R.id.rb27);
        rb28=(RadioButton)findViewById(R.id.rb28);
        rb29=(RadioButton)findViewById(R.id.rb29);
        rb210=(RadioButton)findViewById(R.id.rb210);

        rb31=(RadioButton)findViewById(R.id.rb31);
        rb32=(RadioButton)findViewById(R.id.rb32);
        rb33=(RadioButton)findViewById(R.id.rb33);
        rb34=(RadioButton)findViewById(R.id.rb34);
        rb35=(RadioButton)findViewById(R.id.rb35);
        rb36=(RadioButton)findViewById(R.id.rb36);
        rb37=(RadioButton)findViewById(R.id.rb37);
        rb38=(RadioButton)findViewById(R.id.rb38);
        rb39=(RadioButton)findViewById(R.id.rb39);
        rb310=(RadioButton)findViewById(R.id.rb310);

        rb41=(RadioButton)findViewById(R.id.rb41);
        rb42=(RadioButton)findViewById(R.id.rb42);
        rb43=(RadioButton)findViewById(R.id.rb43);

        bCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                res= (a+b)*c;
                eRes.setText(String.format("%.2f",res));
                eTol.setText(String.format("%.2f",d));


            }
        });

    }

    public void Clicked (View view){
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()){

            case R.id.rb11:
                a=0.0;
            break;

            case R.id.rb12:
                a=1.0;
                break;

            case R.id.rb13:
                a=20.0;
                break;

            case R.id.rb14:
                a=30.0;
                break;

            case R.id.rb15:
                a=40.0;
                break;

            case R.id.rb16:
                a=50.0;
                break;

            case R.id.rb17:
                a=60.0;
                break;

            case R.id.rb18:
                a=70.0;
                break;

            case R.id.rb19:
                a=80.0;
                break;

            case R.id.rb110:
                a=90.0;
                break;

            case R.id.rb21:
                b=0.0;
                break;

            case R.id.rb22:
                b=1.0;
                break;

            case R.id.rb23:
                b=2.0;
                break;

            case R.id.rb24:
                b=3.0;
                break;

            case R.id.rb25:
                b=4.0;
                break;

            case R.id.rb26:
                b=5.0;
                break;

            case R.id.rb27:
                b=6.0;
                break;

            case R.id.rb28:
                b=7.0;
                break;

            case R.id.rb29:
                b=8.0;
                break;

            case R.id.rb210:
                b=9.0;
                break;

            case R.id.rb31:
                c=(Math.pow(10,1));
                break;

            case R.id.rb32:
                c=(Math.pow(10,2));
                break;

            case R.id.rb33:
                c=(Math.pow(10,3));
                break;

            case R.id.rb34:
                c=(Math.pow(10,4));
                break;

            case R.id.rb35:
                c=(Math.pow(10,5));
                break;

            case R.id.rb36:
                c=(Math.pow(10,6));
                break;

            case R.id.rb37:
                c=(Math.pow(10,7));
                break;

            case R.id.rb38:
                c=(Math.pow(10,8));
                break;

            case R.id.rb39:
                c=(Math.pow(10,9));
                break;

            case R.id.rb310:
                c=(Math.pow(10,10));
                break;

            case R.id.rb41:
                d=2.0;
                break;

            case R.id.rb42:
                d=5.0;
                break;

            case R.id.rb43:
                d=10.0;
                break;

        }


    }

}
