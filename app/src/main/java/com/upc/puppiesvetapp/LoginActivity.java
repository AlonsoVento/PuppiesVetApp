package com.upc.puppiesvetapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    Button btn_Ingresar;
    TextView tv_Registrarse, tv_OlvidoPassword;
    EditText et_CorreoUsuario,et_Password;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tv_OlvidoPassword=(TextView)findViewById(R.id.tv_OlvidoPassword);
        tv_OlvidoPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(LoginActivity.this, RecuperarPasswordActivity.class);
                startActivity(intent);
            }
        });

        btn_Ingresar=(Button)findViewById(R.id.btn_Ingresar);
        btn_Ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, InicioActivity.class);
                startActivity(intent);
            }
        });

        tv_Registrarse=(TextView)findViewById(R.id.tv_Registrarse);
        tv_Registrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(LoginActivity.this, UsuarioActivity.class);
                startActivity(intent);
            }
        });

    }
}