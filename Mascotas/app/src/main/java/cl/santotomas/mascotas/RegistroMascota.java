package cl.santotomas.mascotas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegistroMascota extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_mascota);

        final EditText nombreDueño = (EditText) findViewById(R.id.nombreDueño);
        final EditText apellidoDueño = (EditText) findViewById(R.id.apellidoDueño);
        final EditText nombreMascota = (EditText) findViewById(R.id.nombreMascota);
        final EditText edadMascota = (EditText) findViewById(R.id.edadMascota);

        Button btn_Registro = (Button) findViewById(R.id.btnRegistro);
        btn_Registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(nombreDueño.getText().toString().length() == 0){
                    nombreDueño.setError("Campo vacio");
                }else if(apellidoDueño.getText().toString().length() == 0){
                    apellidoDueño.setError("Campo Vacio");
                }else if( nombreMascota.getText().toString().length() == 0){
                    nombreMascota.setError("Campo Vacio");
                }else if(edadMascota.getText().toString().length() == 0){
                    edadMascota.setError("Campo Vacio");
                }else{
                    Intent resultado = new Intent(RegistroMascota.this, detalleR egistro.class);
                    final Dueño dueño = new Dueño(
                            nombreDueño.getText().toString(),
                            apellidoDueño.getText().toString(),
                            nombreMascota.getText().toString(),
                            edadMascota.getText().toString()
                    );
                    resultado.putExtra("nDueño", dueño.getNombreD());
                    resultado.putExtra("apDueño", dueño.getApellidoD());
                    resultado.putExtra("nMascota", dueño.getNombreM());
                    resultado.putExtra("eMascota", dueño.getEdadM());

                    startActivity(resultado);
                }
            }
        });
    }
}
