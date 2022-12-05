package com.upc.puppiesvetapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MenuReportesActivity extends AppCompatActivity {

    Button btn_ReporteResidenciaClientes, btn_ReporteSolicitudesServicios, btn_ReporteEstadoCliente,btn_ReporteVentasRealizadas, btn_ReporteEstadoCompras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_reportes);

        btn_ReporteResidenciaClientes=(Button)findViewById(R.id.btn_ReporteResidenciaClientes);
        btn_ReporteSolicitudesServicios=(Button)findViewById(R.id.btn_ReporteSolicitudesServicios);
        btn_ReporteEstadoCliente=(Button)findViewById(R.id.btn_ReporteEstadoCliente);
        btn_ReporteVentasRealizadas=(Button)findViewById(R.id.btn_ReporteVentasRealizadas);
        btn_ReporteEstadoCompras=(Button)findViewById(R.id.btn_ReporteEstadoCompras);

        btn_ReporteResidenciaClientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Intent intent = new Intent(MenuReportesActivity.this, ReporteResidenciaClientesActivity.class);
                startActivity(intent);*/
                Uri uri = Uri.parse( "https://app.powerbi.com/view?r=eyJrIjoiMTE0NmU5NDYtYTFkMS00ODMxLTkzMjctOGFmZjhmODYxNDk5IiwidCI6IjBlMGNiMDYwLTA5YWQtNDlmNS1hMDA1LTY4YjliNDlhYTFmNiIsImMiOjR9" );
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                v.getContext().startActivity(intent);
            }
        });


    }
}