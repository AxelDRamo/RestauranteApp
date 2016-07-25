package com.example.dariopc.restauranteapp.Compra;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.dariopc.restauranteapp.R;

public class FacturCenaExc extends AppCompatActivity {

    private TextView txtPedir=null;
    private TextView txtTotal5=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factur_cena_exc);

        txtPedir=(TextView )findViewById(R.id.txtPedir);
        txtTotal5=(TextView )findViewById(R.id.txtTotal5);

        Bundle bundle=getIntent().getExtras();
        txtTotal5.setText(""+bundle.getString("pedido"));
        Double total=Double.parseDouble(bundle.getString("pedido"))*200;
        txtTotal5.setText(""+total);
    }
}
