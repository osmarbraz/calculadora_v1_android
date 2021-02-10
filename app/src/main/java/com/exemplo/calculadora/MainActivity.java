package com.exemplo.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.EditText;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editTextNumero1;
    private EditText editTextNumero2;
    private EditText editTextResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //Associa os componentes da interface aos componentes da classe
        editTextNumero1 = findViewById(R.id.editTextNumero1);
        editTextNumero2 = findViewById(R.id.editTextNumero2);
        editTextResultado = findViewById(R.id.editTextResultado);
    }

    public void onClickButtonSomar(View v) {
        if (!editTextNumero1.getText().toString().equals("")){
            if (!editTextNumero2.getText().toString().equals("")){
                double resultado =  Double.parseDouble(editTextNumero1.getText().toString()) + Double.parseDouble(editTextNumero2.getText().toString());
                editTextResultado.setText(""+resultado);
            } else {
                Toast.makeText(MainActivity.this, "Digite o número 2!", Toast.LENGTH_SHORT).show();
                //Coloca o foco na caixa de texto número1
                editTextNumero2.requestFocus();
            }
        } else {
            Toast.makeText(MainActivity.this, "Digite o número 1!", Toast.LENGTH_SHORT).show();
            //Coloca o foco na caixa de texto número1
            editTextNumero1.requestFocus();
        }
    }

    public void onClickButtonSubtrair(View v) {
        if (!editTextNumero1.getText().toString().equals("")){
            if (!editTextNumero2.getText().toString().equals("")){
                double resultado =  Double.parseDouble(editTextNumero1.getText().toString()) - Double.parseDouble(editTextNumero2.getText().toString());
                editTextResultado.setText(""+resultado);
            } else {
                Toast.makeText(MainActivity.this, "Digite o número 2!", Toast.LENGTH_SHORT).show();
                //Coloca o foco na caixa de texto número1
                editTextNumero2.requestFocus();
            }
        } else {
            Toast.makeText(MainActivity.this, "Digite o número 1!", Toast.LENGTH_SHORT).show();
            //Coloca o foco na caixa de texto número1
            editTextNumero1.requestFocus();
        }
    }

    public void onClickButtonMultiplicar(View v) {
        if (!editTextNumero1.getText().toString().equals("")){
            if (!editTextNumero2.getText().toString().equals("")){
                double resultado =  Double.parseDouble(editTextNumero1.getText().toString()) * Double.parseDouble(editTextNumero2.getText().toString());
                editTextResultado.setText(""+resultado);
            } else {
                Toast.makeText(MainActivity.this, "Digite o número 2!", Toast.LENGTH_SHORT).show();
                //Coloca o foco na caixa de texto número1
                editTextNumero2.requestFocus();
            }
        } else {
            Toast.makeText(MainActivity.this, "Digite o número 1!", Toast.LENGTH_SHORT).show();
            //Coloca o foco na caixa de texto número1
            editTextNumero1.requestFocus();
        }
    }

    public void onClickButtonDividir(View v) {
        if (!editTextNumero1.getText().toString().equals("")){
            if (!editTextNumero2.getText().toString().equals("")){
                double resultado =  Double.parseDouble(editTextNumero1.getText().toString()) / Double.parseDouble(editTextNumero2.getText().toString());
                editTextResultado.setText(""+resultado);
            } else {
                Toast.makeText(MainActivity.this, "Digite o número 2!", Toast.LENGTH_SHORT).show();
                //Coloca o foco na caixa de texto número1
                editTextNumero2.requestFocus();
            }
        } else {
            Toast.makeText(MainActivity.this, "Digite o número 1!", Toast.LENGTH_SHORT).show();
            //Coloca o foco na caixa de texto número1
            editTextNumero1.requestFocus();
        }
    }

    public void onClickButtonLimpar(View v) {
        editTextNumero1.setText("");
        editTextNumero2.setText("");
        editTextResultado.setText("");
    }

    public void onClickBotaoFechar(View v) {
        System.exit(0);
    }
}