package cl.santotomas.registroempleados;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetalleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        Bundle extras = getIntent().getExtras();
        String _nombre = extras.getString("name");
        String _apellido = extras.getString("lastname");
        String _edad = extras.getString("age");
        String _sexo = extras.getString("sex");

        TextView resumen = (TextView) findViewById(R.id.nombre_Resumen);
        resumen.setText("El nombre del empleado es: "+_nombre+" "+_apellido+ " y su edad es de "+_edad+" años y de sexo "+_sexo);

    }
}
