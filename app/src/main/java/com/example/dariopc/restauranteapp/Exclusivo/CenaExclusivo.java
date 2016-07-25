package com.example.dariopc.restauranteapp.Exclusivo;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.dariopc.restauranteapp.Compra.FacturCenaExc;
import com.example.dariopc.restauranteapp.Compra.FacturaDesayunoExc;
import com.example.dariopc.restauranteapp.R;

public class CenaExclusivo extends AppCompatActivity {

    private EditText txtPedir5=null;
    private Button button12=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cena_exclusivo);

        txtPedir5=(EditText) findViewById(R.id.txtPedir5);
        button12=(Button) findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Snackbar.make(v,"Click en pedido", Snackbar.LENGTH_SHORT).show();
                Intent intent=new Intent(CenaExclusivo.this,FacturCenaExc.class);
                intent.putExtra("pedido",txtPedir5.getText().toString());
                startActivity(intent);
            }
        });
    }
}
