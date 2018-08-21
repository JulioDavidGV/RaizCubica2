package com.example.julio.clase01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvresultado;
    private EditText txtnumero;
    private Button btncalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvresultado = (TextView) findViewById(R.id.tv3);
        txtnumero = (EditText) findViewById(R.id.edtn1);
        btncalcular = (Button) findViewById(R.id.btnc);
    }

    public void raiz(View view) {
        double x = Double.parseDouble(txtnumero.getText().toString());
        double y = 1.0 / 3.0;
        tvresultado.setText("" + Math.pow(x, y));
    }
}