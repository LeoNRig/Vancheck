package br.androidapps.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView btnMotorista, btnPais;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMotorista = findViewById(R.id.btnMotorista);
        btnPais = findViewById(R.id.btnPais);

        btnMotorista.setOnClickListener(view -> {
            startActivity(new Intent(this,loginMotorista.class));
        });

        btnPais.setOnClickListener(view -> {
            startActivity(new Intent(this,loginPais.class));
        });
    }
}