package com.example.autonoma.practica4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    Button buBoton2;
    ListView lvListado;
    EditText etNombre;

    ArrayList profesores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        buBoton2=findViewById(R.id.buBoton2);
        lvListado=findViewById(R.id.lvListado);
        etNombre=findViewById(R.id.etNombre);

        //innicializamos variables de arrys

        profesores=new ArrayList<String>();

            //adaptador
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,profesores);

            lvListado.setAdapter(adapter);

            buBoton2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    profesores.add(etNombre.getText().toString());
                    lvListado.deferNotifyDataSetChanged();
                }
            });
    }
}
