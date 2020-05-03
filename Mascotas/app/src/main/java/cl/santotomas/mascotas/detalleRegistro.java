package cl.santotomas.mascotas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class detalleRegistro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_registro);

        Bundle extras = getIntent().getExtras();
        String _nombreD = extras.getString("nDueño");
        String _apellidoD = extras.getString("apDueño");
        String _nombreM = extras.getString("nMascota");
        String _edadM = extras.getString("eMascota");

        TextView resumen = (TextView)findViewById(R.id.resultado) ;
        resumen.setText("Nombre dueño: "+_nombreD+ " "+_apellidoD+'\n'+"Mascota: "+_nombreM+ '\n'+ "Edad: " +_edadM+ " años");
    }
}
