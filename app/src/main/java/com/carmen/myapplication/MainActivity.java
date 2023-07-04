package com.carmen.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtNumero1;
    EditText txtNumero2;
    EditText txtNumero3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNumero1 = findViewById(R.id.txtNumero1);
        txtNumero2 = findViewById(R.id.txtNumero2);
        txtNumero3 = findViewById(R.id.txtNumero3);

    }
    public void imc(View vista){
        String numero1Texto = txtNumero1.getText().toString();
        String numero2Texto = txtNumero2.getText().toString();
        String numero3Texto = txtNumero3.getText().toString();
        String mensajeResultado = "";
        if (numero1Texto.equals("") || numero2Texto.equals("") || numero3Texto.equals("")) {
            Toast.makeText(getApplicationContext(), "Por favor llene los datos", Toast.LENGTH_LONG).show();
        }else{
            int numero1 = Integer.parseInt(numero1Texto);
            float numero2 = Float.parseFloat(numero2Texto);
            float numero3 = Float.parseFloat(numero3Texto);
            numero3= numero3/100;
            //Proceso de calcular el indice de masa corporal
            float imc=numero2/(float)Math.pow(numero3,2);
            //Convirtiendo el resultado a texto
            String imcTexto = String.format("%.1f", imc);
            if (imc < 18.5f)
                mensajeResultado  = getString(R.string.mes1) +" " + imcTexto + " " + getString(R.string.mes1_1);
            if (imc >= 18.5f && imc < 25)
                mensajeResultado  = getString(R.string.mes1) +" " + imcTexto + " " + getString(R.string.mes1_2);
            if (imc >= 25 && imc < 30)
                mensajeResultado  = getString(R.string.mes1) +" " + imcTexto + " " + getString(R.string.mes1_3);
            if (imc >= 30 && imc < 35)
                mensajeResultado  = getString(R.string.mes1) +" " + imcTexto + " " + getString(R.string.mes1_4);
            if (imc >= 35 && imc < 40)
                mensajeResultado  = getString(R.string.mes1) +" " + imcTexto + " " + getString(R.string.mes1_5);
            if (imc >= 40)
                mensajeResultado  = getString(R.string.mes1) +" " + imcTexto + " " + getString(R.string.mes1_6);

            Toast.makeText(getApplicationContext(), mensajeResultado, Toast.LENGTH_LONG).show();

        }
    }


}