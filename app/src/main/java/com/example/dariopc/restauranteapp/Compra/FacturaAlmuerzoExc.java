package com.example.dariopc.restauranteapp.Compra;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.dariopc.restauranteapp.R;

public class FacturaAlmuerzoExc extends AppCompatActivity {

    private TextView txtPedir=null;
    private TextView txtTotal2=null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factura_almuerzo_exc);

        txtPedir=(TextView )findViewById(R.id.txtPedir);
        txtTotal2=(TextView )findViewById(R.id.txtTotal2);

        Bundle bundle=getIntent().getExtras();
        txtTotal2.setText(""+bundle.getString("pedido"));
        Double total=Double.parseDouble(bundle.getString("pedido"))*200;
        txtTotal2.setText(""+total);
    }
}
