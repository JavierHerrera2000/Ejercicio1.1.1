package com.example.ejercicio11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView tvr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvr=(TextView) findViewById(R.id.tv2);
        Float resultado=getIntent().getExtras().getFloat("resul");
        tvr.setText(resultado.toString());
    }
    public void Volver(View view){
        Intent i= new Intent(this,MainActivity.class);
        startActivity(i);
    }
}
