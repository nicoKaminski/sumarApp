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

import com.murek.sumarapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sumar(view);
            }
        });
        }


    public void sumar(View view) {
        String num1 = binding.etNumero1.getText().toString();
        String num2 = binding.etNumero2.getText().toString();

        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        int res = n1 + n2;
        binding.tvResultado.setText("El resultado es: " + res);
    }
}