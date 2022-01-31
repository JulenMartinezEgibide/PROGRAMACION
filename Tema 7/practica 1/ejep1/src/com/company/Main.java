package com.company;

import Modelo.datos;
import Vista.VentanaSalida;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static void pasarDatos(){

    }
    public static void tenerDatos(String gettFApellido, String gettFDni, String gettFNombre) {
        ArrayList<datos> d = new ArrayList<datos>();

        d.add(new datos(gettFApellido,gettFDni,gettFNombre));
    }

    VentanaSalida.dameDatos(String datos)
}
