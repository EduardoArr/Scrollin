package com.example.aplicacionscrollin;

import android.app.Application;

import com.example.aplicacionscrollin.Datos.LugaresLista;
import com.example.aplicacionscrollin.Datos.RepositorioLugares;

public class Aplicacion extends Application {
    public RepositorioLugares lugares = new LugaresLista();
    @Override public void onCreate() {

        super.onCreate();
    }
}
