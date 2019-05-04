package com.example.autonoma.practica4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText etUsuario,etClave;
    Button buBoton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsuario=findViewById(R.id.etUsuario);
        etClave=findViewById(R.id.etClave);

        buBoton=findViewById(R.id.buBoton);

        buBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(etUsuario.getText().toString().equals("elvis") && etClave.getText().toString().equals("123")) {

                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);

                    startActivity(intent);
                }

            }
        });

    }
}
