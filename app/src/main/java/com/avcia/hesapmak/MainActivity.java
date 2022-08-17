package com.avcia.hesapmak;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText input1;
    EditText input2;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1 = findViewById(R.id.input1);
        input2 = findViewById(R.id.input2);
        resultText = findViewById(R.id.resultText);
    }

    public void addition(View view){
        if(input1.getText().toString().matches("")||
                input2.getText().toString().matches(""))
        {
       resultText.setText("Lütfen Bir Sayı Giriniz!");
        }
        else{
            double sayi1= Double.parseDouble(input1.getText().toString());
            double sayi2 =Double.parseDouble(input2.getText().toString());
            double sonuc = sayi1 + sayi2;
            resultText.setText("Sonuc: " + sonuc);}
    }
    public void subtraction(View view){
        if(input1.getText().toString().matches("")||
                input2.getText().toString().matches(""))
        {
            resultText.setText("Lütfen Bir Sayı Giriniz!");
        } else{
            double sayi1= Double.parseDouble(input1.getText().toString());
            double sayi2= Double.parseDouble(input2.getText().toString());
            double sonuc= sayi1 - sayi2;
            resultText.setText("Sonuc: "+ sonuc);
        }
    }
    public void divide(View view){
        if(input1.getText().toString().matches("")||
                input2.getText().toString().matches("")) {
            resultText.setText("Lütfen Bir Sayı Giriniz!");
        }
        else{
            double sayi1= Double.parseDouble(input1.getText().toString());
            double sayi2 =Double.parseDouble(input2.getText().toString());
            double sonuc = sayi1 / sayi2;
            resultText.setText("Sonuc: " + sonuc);}
    }

    public void multiply(View view){
        if (input1.getText().toString().matches("")||
                input2.getText().toString().matches("")){
            resultText.setText("lütfen Bir Sayı Giriniz!");
        }else{
            double sayi1= Double.parseDouble(input1.getText().toString());
            double sayi2= Double.parseDouble(input2.getText().toString());
            double sonuc= sayi1 * sayi2;
            resultText.setText("Sonuc: " + sonuc);

        }



    }
}