package com.example.dariopc.restauranteapp.Tradiconal;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.dariopc.restauranteapp.Compra.FacturaAlmuerzoTra;
import com.example.dariopc.restauranteapp.Compra.FacturaDesayunoTra;
import com.example.dariopc.restauranteapp.R;

public class AlmuerzoTradicional extends AppCompatActivity {

    private EditText txtPedir1=null;
    private Button button5=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almuerzo_tradicional);

        txtPedir1=(EditText) findViewById(R.id.txtPedir1);
        button5=(Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Snackbar.make(v,"Click en pedido", Snackbar.LENGTH_SHORT).show();
                Intent intent=new Intent(AlmuerzoTradicional.this,FacturaAlmuerzoTra.class);
                intent.putExtra("pedido",txtPedir1.getText().toString());
                startActivity(intent);
            }
        });
    }
}
