package com.company;

import Modelo.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static void tenerDatos(String gettFApellidos, String gettFDni, String gettFNombre ,String gettFCurso) {
        ArrayList<Persona> p = new ArrayList<Persona>();
        ArrayList<Curso> c= new ArrayList<Curso>();

        p.add(new Persona(gettFDni,gettFNombre,gettFApellidos));
        c.add(new Curso(gettFCurso));
    }
}
