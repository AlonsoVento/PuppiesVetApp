package com.upc.puppiesvetapp;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class ReporteResidenciaClientesActivity extends AppCompatActivity {

    TextView tv_FechaInicio_ReporteResidenciaClientes, tv_FechaFin_ReporteResidenciaClientes;
    EditText et_FechaInicio_ReporteResidenciaClientes, et_FechaFin_ReporteResidenciaClientes;
    DatePickerDialog.OnDateSetListener setListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reporte_residencia_clientes);

        tv_FechaInicio_ReporteResidenciaClientes=(TextView)findViewById(R.id.tv_FechaInicio_ReporteResidenciaClientes);
        tv_FechaFin_ReporteResidenciaClientes=(TextView)findViewById(R.id.tv_FechaFin_ReporteResidenciaClientes);
        et_FechaInicio_ReporteResidenciaClientes=(EditText)findViewById(R.id.et_FechaInicio_ReporteResidenciaClientes);
        et_FechaFin_ReporteResidenciaClientes=(EditText)findViewById(R.id.et_FechaFin_ReporteResidenciaClientes);

        Calendar calendar = Calendar.getInstance();
        final int year = calendar.get(Calendar.YEAR);
        final int month = calendar.get(Calendar.MONTH);
        final int day = calendar.get(Calendar.DAY_OF_MONTH);

        et_FechaInicio_ReporteResidenciaClientes.setOnClickListener(v -> {
            DatePickerDialog datePickerDialog = new DatePickerDialog(
                    ReporteResidenciaClientesActivity.this, (view, year1, month1, dayOfMonth) -> {
                month1 = month1 + 1;
                String date = dayOfMonth + "/" + month1 + "/" + year1;
                et_FechaInicio_ReporteResidenciaClientes.setText(date);
            }, year, month, day);
            datePickerDialog.show();
        });

        et_FechaFin_ReporteResidenciaClientes.setOnClickListener(v -> {
            DatePickerDialog datePickerDialog = new DatePickerDialog(
                    ReporteResidenciaClientesActivity.this, (view, year12, month12, dayOfMonth) -> {
                month12 = month12 + 1;
                String date = dayOfMonth + "/" + month12 + "/" + year12;
                et_FechaFin_ReporteResidenciaClientes.setText(date);
            }, year, month, day);
            datePickerDialog.show();
        });

    }
}