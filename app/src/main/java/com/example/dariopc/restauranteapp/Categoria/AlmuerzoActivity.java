package com.example.dariopc.restauranteapp.Categoria;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.dariopc.restauranteapp.Exclusivo.AlmuerzoExclusivo;
import com.example.dariopc.restauranteapp.Exclusivo.DesayunoExclusivo;
import com.example.dariopc.restauranteapp.R;
import com.example.dariopc.restauranteapp.Tradiconal.AlmuerzoTradicional;
import com.example.dariopc.restauranteapp.Tradiconal.DesayunoTradicional;

public class AlmuerzoActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView txtCliente2=null;
    private Button button8=null;
    private Button button9=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almuerzo);


        findViewById(R.id.button8).setOnClickListener(this);
        findViewById(R.id.button9).setOnClickListener(this);


        txtCliente2=(TextView)findViewById(R.id.txtCliente2);
        Bundle bundle=getIntent().getExtras();
        txtCliente2.setText(""+bundle.getString("pedido"));
    }


    @Override
    public void onClick(View v) {

        Snackbar.make(v,"Toque el almuerzo a desear", Snackbar.LENGTH_SHORT).show();
        View contenedor = v.getRootView();

        switch (v.getId()) {
            case R.id.button8:
                Intent intent=new Intent(AlmuerzoActivity.this,AlmuerzoTradicional.class);
                startActivity(intent);
                break;
            case R.id.button9:
                Intent intent1=new Intent(AlmuerzoActivity.this, AlmuerzoExclusivo.class);
                startActivity(intent1);
                break;
            default:

        }

    }
}
