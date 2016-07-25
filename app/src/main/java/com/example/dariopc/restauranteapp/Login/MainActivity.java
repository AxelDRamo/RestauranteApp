package com.example.dariopc.restauranteapp.Login;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.dariopc.restauranteapp.Adapter.SalonActivity;
import com.example.dariopc.restauranteapp.Categoria.AlmuerzoActivity;
import com.example.dariopc.restauranteapp.Categoria.CenaActivity;
import com.example.dariopc.restauranteapp.Categoria.DesayunoActivity;

import com.example.dariopc.restauranteapp.Categoria.EventoActivity;
import com.example.dariopc.restauranteapp.Categoria.LocalizacionActivity;

import com.example.dariopc.restauranteapp.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private TextView txtCliente=null;
    private EditText txtNombre=null;
    private Button button=null;
    private Button button2=null;
    private Button button3=null;
    private Button button14=null;
    private Button button15=null;
    private Button button16=null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);
        findViewById(R.id.button3).setOnClickListener(this);
        findViewById(R.id.button14).setOnClickListener(this);
        findViewById(R.id.button15).setOnClickListener(this);
        findViewById(R.id.button16).setOnClickListener(this);

        txtCliente=(TextView)findViewById(R.id.txtCliente);
        Bundle bundle=getIntent().getExtras();
        txtCliente.setText(""+bundle.getString("pedido"));

    }


        @Override
        public void onClick(View v) {

            Snackbar.make(v,"Toque en la categoria a desear", Snackbar.LENGTH_SHORT).show();
            View contenedor = v.getRootView();

            switch (v.getId()) {
                case R.id.button:
                    Intent intent=new Intent(MainActivity.this,DesayunoActivity.class);
                    intent.putExtra("pedido",txtCliente.getText().toString());
                    startActivity(intent);
                    break;
                case R.id.button2:
                    Intent intent1=new Intent(MainActivity.this, AlmuerzoActivity.class);
                    intent1.putExtra("pedido",txtCliente.getText().toString());
                    startActivity(intent1);
                    break;
                case R.id.button3:
                    Intent intent3=new Intent(MainActivity.this, CenaActivity.class);
                    intent3.putExtra("pedido",txtCliente.getText().toString());
                    startActivity(intent3);
                    break;
                case R.id.button14:
                    Intent intent4=new Intent(MainActivity.this, EventoActivity.class);
                    intent4.putExtra("pedido",txtCliente.getText().toString());
                    startActivity(intent4);
                    break;
                case R.id.button15:
                    Intent intent5=new Intent(MainActivity.this, LocalizacionActivity.class);
                    intent5.putExtra("pedido", txtCliente.getText().toString());
                    startActivity(intent5);
                    break;
                case R.id.button16:
                    Intent intent6=new Intent(MainActivity.this, SalonActivity.class);
                    intent6.putExtra("pedido", txtCliente.getText().toString());
                    startActivity(intent6);
                    break;
                default:

            }

        }
    }


