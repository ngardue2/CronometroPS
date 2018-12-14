package com.example.usuario.cronometrops;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView TiempoTotal, TiempoEjecucion, TiempoParado;
    Button botonIniciar, botonParado, botonFinalizado, butonReiniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TiempoTotal = (TextView)findViewById(R.id.verTotal);
        TiempoEjecucion = (TextView)findViewById(R.id.verEjecutado);
        TiempoParado = (TextView)findViewById(R.id.verParado);
        botonIniciar = (Button) findViewById(R.id.butonIniciar);
        botonParado = (Button) findViewById(R.id.butonParar);
        botonFinalizado = (Button) findViewById(R.id.butonFinalizar);
        butonReiniciar = (Button) findViewById(R.id.butonReiniciar);

        botonParado.setEnabled(false);
       botonParado.setTextColor(getResources().getColor(R.color.gris));
        botonFinalizado.setEnabled(false);

        botonIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "HOLA", Toast.LENGTH_SHORT).show();

                botonParado.setEnabled(true);
                botonParado.setTextColor(getResources().getColor(R.color.colorAccent));
            }
        });
        botonParado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "HOLA", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
