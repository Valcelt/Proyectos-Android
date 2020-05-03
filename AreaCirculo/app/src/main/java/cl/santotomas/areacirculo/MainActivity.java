package cl.santotomas.areacirculo;

import androidx.appcompat.app.AppCompatActivity;

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

        final EditText area = (EditText) findViewById(R.id.areacir);
        Button calculo_ = (Button) findViewById(R.id.btn_Calculo);

        calculo_.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    Float area_r = Float.parseFloat(area.getText().toString());
                    Toast.makeText(MainActivity.this, "El Area del circulo es: " +Math.PI*((area_r*area_r)), Toast.LENGTH_LONG).show();
                }catch (NumberFormatException e){
                    Toast mensaje = Toast.makeText(MainActivity.this, "El Valor ingresado no es Valido", Toast.LENGTH_LONG);
                    mensaje.show();
                }
            }
        });




    }
}
