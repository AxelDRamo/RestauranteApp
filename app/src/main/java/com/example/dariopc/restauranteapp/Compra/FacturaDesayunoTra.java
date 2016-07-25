package com.example.dariopc.restauranteapp.Compra;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.dariopc.restauranteapp.R;

public class FacturaDesayunoTra extends AppCompatActivity {

    private TextView txtPedir=null;
    private TextView txtTotal=null;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factura_desayuno_tra);

        txtPedir=(TextView )findViewById(R.id.txtPedir);
        txtTotal=(TextView )findViewById(R.id.txtTotal);

        Bundle bundle=getIntent().getExtras();
        txtTotal.setText(""+bundle.getString("pedido"));
        Double total=Double.parseDouble(bundle.getString("pedido"))*100;
        txtTotal.setText(""+total);
    }
}
