package com.example.actividad_m1_03;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.Random;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "TareaOrdenamiento";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Establece el diseño de la actividad
        setContentView(R.layout.activity_main);

        // Crea un arreglo de un millon de números aleatorios
        int tamanio = 1000000;
        int[] arreglo = new int[tamanio];
        Random random = new Random();


        Log.d(TAG, "Iniciando generacion de " + tamanio + " numeros aleatorios");
        for (int i = 0; i < tamanio; i++) {
            // Llenamos con numeros aleatorios entre 0 y 1000000
            arreglo[i] = random.nextInt();
        }

        Log.d(TAG, "Iniciando ordenamiento");
        // Medimos el tiempo de inicio
        long tiempoInicio = System.currentTimeMillis();

        // Ordenamos el arreglo de menor a mayor
        Arrays.sort(arreglo);

        // Medimos el tiempo de finalizacion
        long tiempoFinal = System.currentTimeMillis();

        // Calculamos el tiempo transcurrido
        long tiempoTranscurrido = tiempoFinal - tiempoInicio;

        Log.d(TAG, "Tiempo transcurrido: " + tiempoTranscurrido + " milisegundos");


    }
}