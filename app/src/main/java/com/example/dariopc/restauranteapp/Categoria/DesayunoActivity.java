package com.example.dariopc.restauranteapp.Categoria;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.dariopc.restauranteapp.Exclusivo.DesayunoExclusivo;
import com.example.dariopc.restauranteapp.Tradiconal.DesayunoTradicional;
import com.example.dariopc.restauranteapp.R;

public class DesayunoActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView txtCliente1=null;
    private Button buttonTra=null;
    private Button buttonExclu=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desayuno);

        findViewById(R.id.buttonTra).setOnClickListener(this);
        findViewById(R.id.buttonExclu).setOnClickListener(this);


        txtCliente1=(TextView)findViewById(R.id.txtCliente1);
        Bundle bundle=getIntent().getExtras();
        txtCliente1.setText(""+bundle.getString("pedido"));

    }

    @Override
    public void onClick(View v) {

        Snackbar.make(v,"Toque el desayuno a desear", Snackbar.LENGTH_SHORT).show();
        View contenedor = v.getRootView();

        switch (v.getId()) {
            case R.id.buttonTra:
                Intent intent=new Intent(DesayunoActivity.this,DesayunoTradicional.class);
                startActivity(intent);
                break;
            case R.id.buttonExclu:
                Intent intent1=new Intent(DesayunoActivity.this, DesayunoExclusivo.class);
                startActivity(intent1);
                break;
            default:

        }

    }
}
