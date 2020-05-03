package com.santotomas.creditcard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button guardar = (Button) findViewById(R.id.btnGuardar);
        final EditText nombre = (EditText) findViewById(R.id.txtNombre);
        final EditText Apellido = (EditText) findViewById(R.id.txtApellido);
        final EditText numero_tarjeta = (EditText) findViewById(R.id.txtNumero_tarjeta);
        final EditText mes =(EditText) findViewById(R.id.txtMes);
        final EditText year =(EditText) findViewById(R.id.txtAño);
        final EditText codigo =(EditText) findViewById(R.id.txtCodigo);
        final EditText direccion =(EditText) findViewById(R.id.txtDireccion);
        final EditText ciudad =(EditText) findViewById(R.id.txtCiudad);
        final EditText estado =(EditText) findViewById(R.id.txtEstado);
        final EditText codigo_postal =(EditText) findViewById(R.id.txtCodigo_postal);

        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (nombre.getText().toString().length() == 0){

                    nombre.setError("El campo esta vacio ");

                }else if(Apellido.getText().toString().length() == 0){

                    Apellido.setError("E campo esta vacio");

                }else if(numero_tarjeta.getText().toString().length() == 0){

                numero_tarjeta.setError("El campo esta vacio");

                }else if(mes.getText().toString().length() == 0){

                    mes.setError("El campo esta vacio");

                }else if(year.getText().toString().length() == 0){

                    year.setError("El campo esta vacio");

                }else if(codigo.getText().toString().length() == 0){

                    codigo.setError("El campo esta vacio");

                }else if(direccion.getText().toString().length() == 0){

                    direccion.setError("El campo esta vacio");

                }else if(ciudad.getText().toString().length() == 0){

                    ciudad.setError("El campo esta vacio");

                }else if(estado.getText().toString().length() == 0){

                    estado.setError("El campo esta vacio");

                }else if(codigo_postal.getText().toString().length() == 0){

                    codigo_postal.setError("El campo esta vacio");

                }


                else{

                    Intent guardar = new Intent(MainActivity.this, com.santotomas.creditcard.Detalle.class);
                    startActivity(guardar);
                    Toast.makeText(MainActivity.this, "Se ha guardado tu tarjeta de credito ", Toast.LENGTH_SHORT).show();

                };




            }
        });



    }
}
