package com.example.aplicacionscrollin.Datos;

import com.example.aplicacionscrollin.Modelo.Lugar;

public interface RepositorioLugares {

        Lugar elemento(int id); //Devuelve el elemento dado su id
        void aniade(Lugar lugar); //Añade el elemento indicado
        int nuevo(); //Añade un elemento en blanco y devuelve su id
        void borrar(int id); //Elimina el elemento con el id indicado
        int tamanio(); //Devuelve el número de elementos
        void actualiza(int id, Lugar lugar); //Reemplaza un elemento

}

