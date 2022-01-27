package com.example.hazi1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void hozaad(View v){
        EditText et1=(EditText) findViewById(R.id.editTextNumber);
        EditText et2=(EditText) findViewById(R.id.editTextNumber2);
        EditText et3=(EditText) findViewById(R.id.editTextNumber3);

        int szam1 = Integer.parseInt(et1.getText().toString());
        int szam2 = Integer.parseInt(et2.getText().toString());
        int eredmeny = szam1+szam2;

        et3.setText("Eredmeny= " + eredmeny);
    }

    public  void kivon(View v){
        EditText et1=(EditText) findViewById(R.id.editTextNumber);
        EditText et2=(EditText) findViewById(R.id.editTextNumber2);
        EditText et3=(EditText) findViewById(R.id.editTextNumber3);

        int szam1 = Integer.parseInt(et1.getText().toString());
        int szam2 = Integer.parseInt(et2.getText().toString());
        int eredmeny = szam1-szam2;

        et3.setText("Eredmeny= " + eredmeny);
    }

    public  void szorzas(View v){
        EditText et1=(EditText) findViewById(R.id.editTextNumber);
        EditText et2=(EditText) findViewById(R.id.editTextNumber2);
        EditText et3=(EditText) findViewById(R.id.editTextNumber3);

        int szam1 = Integer.parseInt(et1.getText().toString());
        int szam2 = Integer.parseInt(et2.getText().toString());
        int eredmeny = szam1*szam2;

        et3.setText("Eredmeny= " + eredmeny);
    }

    public  void osztas(View v){
        EditText et1=(EditText) findViewById(R.id.editTextNumber);
        EditText et2=(EditText) findViewById(R.id.editTextNumber2);
        EditText et3=(EditText) findViewById(R.id.editTextNumber3);

        int szam1 = Integer.parseInt(et1.getText().toString());
        int szam2 = Integer.parseInt(et2.getText().toString());
        int eredmeny = szam1/szam2;

        et3.setText("Eredmeny= " + eredmeny);
    }

}