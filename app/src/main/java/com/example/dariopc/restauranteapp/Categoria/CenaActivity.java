package com.example.dariopc.restauranteapp.Categoria;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.dariopc.restauranteapp.Exclusivo.CenaExclusivo;
import com.example.dariopc.restauranteapp.Exclusivo.DesayunoExclusivo;
import com.example.dariopc.restauranteapp.R;
import com.example.dariopc.restauranteapp.Tradiconal.CenaTradicional;
import com.example.dariopc.restauranteapp.Tradiconal.DesayunoTradicional;

public class CenaActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView txtCliente3=null;
    private Button button6=null;
    private Button button7=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cena);


        findViewById(R.id.button6).setOnClickListener(this);
        findViewById(R.id.button7).setOnClickListener(this);

        txtCliente3=(TextView)findViewById(R.id.txtCliente3);
        Bundle bundle=getIntent().getExtras();
        txtCliente3.setText(""+bundle.getString("pedido"));
    }

    @Override
    public void onClick(View v) {

        Snackbar.make(v,"Toque la cena a desear", Snackbar.LENGTH_SHORT).show();
        View contenedor = v.getRootView();

        switch (v.getId()) {
            case R.id.button6:
                Intent intent=new Intent(CenaActivity.this,CenaTradicional.class);
                startActivity(intent);
                break;
            case R.id.button7:
                Intent intent1=new Intent(CenaActivity.this, CenaExclusivo.class);
                startActivity(intent1);
                break;
            default:

        }

    }
}
