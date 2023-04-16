package com.example.ejercicio11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public EditText txtn1,txtn2;
    public Button btns,btnr,btnm,btnd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtn1=(EditText) findViewById(R.id.txtnum1);
        txtn2=(EditText) findViewById(R.id.txtnum2);
        btns=(Button) findViewById(R.id.btnsuma);
        btnr=(Button) findViewById(R.id.btnresta);
        btnm=(Button) findViewById(R.id.btnmult);
        btnd=(Button) findViewById(R.id.btndiv);

    }
    //Metodo que ejutara el boton
    public void Suma(View view){
        float n1,n2,res;
        n1=Float.parseFloat(txtn1.getText().toString());
        n2=Float.parseFloat(txtn2.getText().toString());
        res=n1+n2;
        //Enviar a la segunda actividad junto con datos
        Intent i= new Intent(this,SecondActivity.class);
        i.putExtra("resul",res);
        startActivity(i);
    }
    public void Resta(View view){
        float n1,n2,res;
        n1=Float.parseFloat(txtn1.getText().toString());
        n2=Float.parseFloat(txtn2.getText().toString());
        res=n1-n2;

        Intent i= new Intent(this,SecondActivity.class);
        i.putExtra("resul",res);
        startActivity(i);
    }
    public void Mult(View view){
        float n1,n2,res;
        n1=Float.parseFloat(txtn1.getText().toString());
        n2=Float.parseFloat(txtn2.getText().toString());
        res=n1*n2;

        Intent i= new Intent(this,SecondActivity.class);
        i.putExtra("resul",res);
        startActivity(i);
    }
    public void Div(View view){
        float n1,n2,res;
        n1=Float.parseFloat(txtn1.getText().toString());
        n2=Float.parseFloat(txtn2.getText().toString());
        res=n1/n2;

        Intent i= new Intent(this,SecondActivity.class);
        i.putExtra("resul",res);
        startActivity(i);
    }

}
