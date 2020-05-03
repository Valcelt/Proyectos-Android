package cl.santotomas.mascotas;

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




        Button sesion = (Button) findViewById(R.id.btn_sesion);
            sesion.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent registro = new Intent(MainActivity.this, RegistroMascota.class);
//                    RegistroMascota _registro = new RegistroMascota(
//
//                    );
                    startActivity(registro);
                }
            });


    }


}
