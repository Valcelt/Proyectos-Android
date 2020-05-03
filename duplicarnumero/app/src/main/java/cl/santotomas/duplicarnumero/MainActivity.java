package cl.santotomas.duplicarnumero;

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

        final EditText numero_ = (EditText) findViewById(R.id.numero);
        Button boton_ = (Button) findViewById(R.id.btn_Calculo);

       boton_.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               try{
                   Integer numero = Integer.parseInt(numero_.getText().toString());
                   Toast.makeText(MainActivity.this, "El Doble del Número es: " +(numero*2), Toast.LENGTH_LONG).show();

               }catch (NumberFormatException e){
                   Toast mensaje = Toast.makeText(MainActivity.this, "El Valor ingresado no es Valido", Toast.LENGTH_LONG);
                   mensaje.show();

               }

           }
           
       });





   }
}
