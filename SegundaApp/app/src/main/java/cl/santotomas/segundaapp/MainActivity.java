package cl.santotomas.segundaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView texto = (TextView)findViewById(R.id.resTxt);
        texto.setText ("Hola Programadores");

        final EditText nombre = (EditText) findViewById(R.id.txt_nombre);


        ImageView imagen = (ImageView) findViewById(R.id.img_pricipal);
        imagen.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.image));

        Button mybtn = (Button) findViewById(R.id.btn_bienvenida);
         mybtn.setOnClickListener(new View.OnClickListener() {

             @Override
             public void onClick(View v) {
                String texto_str = nombre.getText().toString();
                texto.setText("Bienvenido " + texto_str);
             }
         });
    }
}
