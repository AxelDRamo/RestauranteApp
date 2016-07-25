package com.example.dariopc.restauranteapp.Tradiconal;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.dariopc.restauranteapp.Compra.FacturaCenaTra;
import com.example.dariopc.restauranteapp.Compra.FacturaDesayunoTra;
import com.example.dariopc.restauranteapp.R;

public class CenaTradicional extends AppCompatActivity {

    private EditText txtPedir2=null;
    private Button button13=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cena_tradicional);

        txtPedir2=(EditText) findViewById(R.id.txtPedir2);
        button13=(Button) findViewById(R.id.button13);
        button13.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Snackbar.make(v,"Click en pedido", Snackbar.LENGTH_SHORT).show();
                Intent intent=new Intent(CenaTradicional.this,FacturaCenaTra.class);
                intent.putExtra("pedido",txtPedir2.getText().toString());
                startActivity(intent);
            }
        });
    }
}
