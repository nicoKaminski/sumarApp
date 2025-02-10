package com.murek.sumarapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private TextView tvResult;
    private Button btSum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.etNumero1);
        et2 = findViewById(R.id.etNumero2);
        tvResult = findViewById(R.id.tvResultado);

    }

    public void sumar(View view) {
        String num1 = et1.getText().toString();
        String num2 = et2.getText().toString();

        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        int res = n1 + n2;
        tvResult.setText("El resultado es: " + res);
    }
}