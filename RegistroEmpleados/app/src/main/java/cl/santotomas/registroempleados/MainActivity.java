package cl.santotomas.registroempleados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final EditText nombreEdit = (EditText) findViewById(R.id.Nombre_Empleado);
        final EditText apellidoEdit = (EditText)findViewById(R.id.Apellido_Empleado);
        final EditText edadEdit = (EditText)findViewById(R.id.Edad_Empleado);
        final EditText sexoEdit = (EditText)findViewById(R.id.Sexo_Empleado);

        Button btn_registro = (Button) findViewById(R.id.btnRegistro);
        btn_registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent detalleIntent = new Intent(MainActivity.this, DetalleActivity.class);
                final Empleado empleado = new Empleado(
                    nombreEdit.getText().toString(),
                    apellidoEdit.getText().toString(),
                    edadEdit.getText().toString(),
                    sexoEdit.getText().toString()
                ); //INSTANCIA DE LA CLASE EMPLEADO

                detalleIntent.putExtra("name", empleado.getNombre() );
                detalleIntent.putExtra("lastname", empleado.getApellido() );
                detalleIntent.putExtra("age", empleado.getEdad() );
                detalleIntent.putExtra("sex", empleado.getSexo() );

                startActivity(detalleIntent);
            }
        });

    }
}
