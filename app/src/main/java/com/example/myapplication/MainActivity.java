package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button voiti, otd, val;
    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        voiti = findViewById(R.id.voiti);
        otd = findViewById(R.id.otd);
        val = findViewById(R.id.valut);
        voiti.setOnClickListener(this::Login);
        otd.setOnClickListener(this::Otd);
        val.setOnClickListener(this::Vality);
    }

    private void Login(View v)
    {
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);


        LayoutInflater inflater = LayoutInflater.from(this);
        View sign = inflater.inflate(R.layout.dialog, null);
        dialog.setView(sign);


        final EditText login = sign.findViewById(R.id.login);
        final EditText password = sign.findViewById(R.id.password);



        dialog.setPositiveButton("Войти", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                if (login.getText().toString().equals("admin") &&
                        password.getText().toString().equals("admin")) {
                    Toast.makeText(getApplicationContext(), "Вход выполнен!",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), "Неправильные данные!",Toast.LENGTH_SHORT).show();
                }

            }
        });
        dialog.setNegativeButton("Отменить", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        AlertDialog alertDialog = dialog.create();
        alertDialog.show();

    }

    private void Vality(View v)
    {
        Intent intent = new Intent(this, ListItemActivity.class);
        startActivity(intent);
    }

    private void Otd(View v)
    {
        Intent intent = new Intent(this, OtdItemActivity.class);
        startActivity(intent);
    }
}