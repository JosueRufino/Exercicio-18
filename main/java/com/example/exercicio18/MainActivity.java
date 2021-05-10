package com.example.exercicio18;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    EditText numero;
    TextView r;
    public  void button (View view){

        numero = findViewById(R.id.valor);
        r = findViewById(R.id.resultado);
        int num = Integer.parseInt(numero.getText().toString());


        int i , resultado = 0;
        for(i = 2; i <= num / 2; i++){
            if( num % i == 0) {
                resultado++;
                break;
            }
        }
        if(resultado == 0){
            r.setText("O número é primo");
        }else {
            r.setText("O número não é primo");
        }

    }
}