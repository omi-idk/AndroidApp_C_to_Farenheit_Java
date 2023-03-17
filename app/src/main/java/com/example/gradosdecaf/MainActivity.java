package com.example.gradosdecaf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText escribeGradosCentigrados = findViewById(R.id.grados_centigrados);
        TextView txtCentigrados = findViewById(R.id.txt_gradosConvertidos);
        Button botonConvertir = findViewById(R.id.btn_convertir);

        botonConvertir.setOnClickListener(v->{
            String centigrados = escribeGradosCentigrados.getText().toString();
            if(!centigrados.isEmpty()){
                Double convertirADouble = Double.parseDouble(centigrados);
                Double resultado = (convertirADouble*1.8)+32;
                String mensaje = "El resultado de convertir " + centigrados + "C° " + "es: " + resultado + "F°";
                txtCentigrados.setText(mensaje);
            }
            else{
                txtCentigrados.setText("");
                Toast.makeText(this,"Escribe algo por favor",
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
}