package com.example.dariopc.restauranteapp.Tradiconal;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.dariopc.restauranteapp.Compra.FacturaDesayunoTra;
import com.example.dariopc.restauranteapp.R;

public class DesayunoTradicional extends AppCompatActivity {

    private EditText txtPedir=null;
    private Button button11=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desayuno_tradicional);

        txtPedir=(EditText) findViewById(R.id.txtPedir);
        button11=(Button) findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Snackbar.make(v,"Click en pedido", Snackbar.LENGTH_SHORT).show();
                Intent intent=new Intent(DesayunoTradicional.this,FacturaDesayunoTra.class);
                intent.putExtra("pedido",txtPedir.getText().toString());
                startActivity(intent);
            }
        });
    }
}
