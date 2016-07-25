package com.example.dariopc.restauranteapp.Exclusivo;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.dariopc.restauranteapp.Compra.FacturaAlmuerzoExc;
import com.example.dariopc.restauranteapp.Compra.FacturaDesayunoExc;
import com.example.dariopc.restauranteapp.R;

public class AlmuerzoExclusivo extends AppCompatActivity {

    private EditText txtPedir4=null;
    private Button button10=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almuerzo_exclusivo);

        txtPedir4=(EditText) findViewById(R.id.txtPedir4);
        button10=(Button) findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Snackbar.make(v,"Click en pedido", Snackbar.LENGTH_SHORT).show();
                Intent intent=new Intent(AlmuerzoExclusivo.this,FacturaAlmuerzoExc.class);
                intent.putExtra("pedido",txtPedir4.getText().toString());
                startActivity(intent);
            }
        });
    }
}
