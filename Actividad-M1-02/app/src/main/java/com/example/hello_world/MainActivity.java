package com.example.hello_world;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    // Definimos un TAG para filtrar nuestro mensaje en la consola
    private static final String TAG = "MiPrimerApp";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        // Esto enlaza mi código con la interfaz gráfica XML
        setContentView(R.layout.activity_main);

        // Lanzamos el mensaje al Logcat
        // Usamos Log.d ('d' es Debug)
        Log.d(TAG, "¡Hello World! Mi primer log funcina.");
        }
    }
