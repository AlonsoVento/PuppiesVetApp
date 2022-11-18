package com.upc.puppiesvetapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_Bienvenida;
    //FirebaseDatabase database;
    //DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_Bienvenida=(Button)findViewById(R.id.btn_Bienvenida);
        /*btn_Bienvenida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
        */


        /* Para obtener el token de la aplicación ::: Abrir el logcat y poner el símbolo indicado en el TAG
        FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new OnCompleteListener<String>() {
            @Override
            public void onComplete(@NonNull Task<String> task) {
                String token = task.getResult();
                Log.d("===>",token);
            }
        });
        */
    }
    /*
    private void inicializarFirebase() {
        FirebaseApp.initializeApp(this);
        database= FirebaseDatabase.getInstance();
        reference =database.getReference();
    }
    */

}