package com.example.dariopc.restauranteapp.Compra;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.dariopc.restauranteapp.R;

public class FacturaAlmuerzoTra extends AppCompatActivity {


    private TextView txtPedir=null;
    private TextView txtTotal3=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factura_almuerzo_tra);

        txtPedir=(TextView )findViewById(R.id.txtPedir);
        txtTotal3=(TextView )findViewById(R.id.txtTotal3);

        Bundle bundle=getIntent().getExtras();
        txtTotal3.setText(""+bundle.getString("pedido"));
        Double total=Double.parseDouble(bundle.getString("pedido"))*150;
        txtTotal3.setText(""+total);
    }
}
