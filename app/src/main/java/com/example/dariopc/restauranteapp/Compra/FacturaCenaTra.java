package com.example.dariopc.restauranteapp.Compra;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.dariopc.restauranteapp.R;

public class FacturaCenaTra extends AppCompatActivity {

    private TextView txtPedir=null;
    private TextView txtTotal4=null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factura_cena_tra);

        txtPedir=(TextView )findViewById(R.id.txtPedir);
        txtTotal4=(TextView )findViewById(R.id.txtTotal4);

        Bundle bundle=getIntent().getExtras();
        txtTotal4.setText(""+bundle.getString("pedido"));
        Double total=Double.parseDouble(bundle.getString("pedido"))*275;
        txtTotal4.setText(""+total);
    }
}
