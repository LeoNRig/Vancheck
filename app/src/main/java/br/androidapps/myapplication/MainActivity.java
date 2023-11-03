package br.androidapps.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView btnMotorista;
    AppCompatButton btnEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMotorista = findViewById(R.id.btnMotorista);

        btnMotorista.setOnClickListener(view -> {
            startActivity(new Intent(this,loginMotorista.class));
        });

        btnEntrar = findViewById(R.id.btnEntrar);

    }
}