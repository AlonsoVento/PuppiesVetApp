package com.upc.puppiesvetapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MenuReportesActivity extends AppCompatActivity {

    Button btn_ReporteResidenciaClientes, btn_ReporteEstadoServicios, btn_ReporteServiciosRealizados,btn_ReporteEstadoCompras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_reportes);

        btn_ReporteResidenciaClientes=(Button)findViewById(R.id.btn_ReporteResidenciaClientes);
        btn_ReporteEstadoServicios=(Button)findViewById(R.id.btn_ReporteEstadoServicios);
        btn_ReporteServiciosRealizados=(Button)findViewById(R.id.btn_ReporteServiciosRealizados);
        btn_ReporteEstadoCompras=(Button)findViewById(R.id.btn_ReporteEstadoCompras);

        btn_ReporteResidenciaClientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuReportesActivity.this, ReporteResidenciaClientesActivity.class);
                startActivity(intent);
            }
        });

    }
}