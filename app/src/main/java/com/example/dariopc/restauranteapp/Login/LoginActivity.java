package com.example.dariopc.restauranteapp.Login;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.dariopc.restauranteapp.R;

public class LoginActivity extends AppCompatActivity  {


    private EditText txtNombre=null;
    private Button idIngreso=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        txtNombre=(EditText ) findViewById(R.id.txtNombre);
        idIngreso=(Button) findViewById(R.id.idIngreso);
        idIngreso.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Snackbar.make(v,"Ingrese su nombre", Snackbar.LENGTH_SHORT).show();
                Intent intent=new Intent(LoginActivity.this,MainActivity.class);
                intent.putExtra("pedido",txtNombre.getText().toString());
                startActivity(intent);
            }
        });


    }


}
