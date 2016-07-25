package com.example.dariopc.restauranteapp.Exclusivo;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.dariopc.restauranteapp.Compra.FacturaDesayunoExc;
import com.example.dariopc.restauranteapp.Compra.FacturaDesayunoTra;
import com.example.dariopc.restauranteapp.R;

public class DesayunoExclusivo extends AppCompatActivity {

    private EditText txtPedir3=null;
    private Button button4=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desayuno_exclusivo);

        txtPedir3=(EditText) findViewById(R.id.txtPedir3);
        button4=(Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Snackbar.make(v,"Click en pedido", Snackbar.LENGTH_SHORT).show();
                Intent intent=new Intent(DesayunoExclusivo.this,FacturaDesayunoExc.class);
                intent.putExtra("pedido",txtPedir3.getText().toString());
                startActivity(intent);
            }
        });
    }
}
