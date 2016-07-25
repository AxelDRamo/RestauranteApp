package com.example.dariopc.restauranteapp.Compra;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.dariopc.restauranteapp.R;

public class FacturaDesayunoExc extends AppCompatActivity {

    private TextView txtPedir=null;
    private TextView txtTotal1=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factura_desayuno_exc);

        txtPedir=(TextView )findViewById(R.id.txtPedir);
        txtTotal1=(TextView )findViewById(R.id.txtTotal1);

        Bundle bundle=getIntent().getExtras();
        txtTotal1.setText(""+bundle.getString("pedido"));
        Double total=Double.parseDouble(bundle.getString("pedido"))*150;
        txtTotal1.setText(""+total);
    }
}
