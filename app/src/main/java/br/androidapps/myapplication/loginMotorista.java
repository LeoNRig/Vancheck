package br.androidapps.myapplication;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import java.util.Calendar;

public class loginMotorista extends AppCompatActivity {

    EditText Name, email, rg, cpf, dataNasci, cep, telefone;
    AppCompatButton btnCancelarInfo, btnSalvarInfo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_motorista);

        Name = findViewById(R.id.Name);
        email = findViewById(R.id.email);
        telefone = findViewById(R.id.celular);
        rg = findViewById(R.id.rg);
        cpf = findViewById(R.id.cpf);
        cep = findViewById(R.id.cep);
        dataNasci = findViewById(R.id.dataNasci);


        dataNasci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrarData();
            }
        });

        btnSalvarInfo = findViewById(R.id.btnSalvarInfo);

        btnSalvarInfo.setOnClickListener(view -> {
            startActivity(new Intent(this,menuMotorista.class));
        });

    }

    private void mostrarData() {
        Calendar calendario = Calendar.getInstance();
        int dia = calendario.get(Calendar.DAY_OF_MONTH);
        int mes = calendario.get(Calendar.MONTH);
        int ano = calendario.get(Calendar.YEAR);

        DatePickerDialog data = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int dia, int mes, int ano) {
                String dataSelecionada = dia + "/" + (mes + 1) + "/" + ano;
                dataNasci.setText(dataSelecionada);
            }
        }, dia, mes, ano);
        data.show();
    }
}
