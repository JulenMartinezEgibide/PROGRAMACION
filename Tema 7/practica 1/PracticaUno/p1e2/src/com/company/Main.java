package com.company;

import Vista.*;
import Modelo.*;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    private static JFrame v;

    private static Curso[] listaCursos;
    private static ArrayList<Alumno> listaAlumnos;

    private static Curso c;
    private static Alumno a;

    public static void main(String[] args) {
        // Preparo la "base de datos"
        generarCursos();
        listaAlumnos = new ArrayList<Alumno>();

        // Ceder el control a la ventana
        mostrarVentana();
    }

    public static void mostrarVentana(){
        v = new JFrame("Ventana");
        v.setContentPane(new Ventana().getPanelPrincipal());
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        v.setLocationRelativeTo(null);
        v.setSize(800,800);
        v.pack();
        v.setVisible(true);
    }

    public static void generarCursos(){
        listaCursos= new Curso[16];
        c = new Curso("1A","Primero de la ESO A");
        listaCursos[0]= c;
        c = new Curso("1B","Primero de la ESO B");
        listaCursos[1]= c;
        c = new Curso("1C","Primero de la ESO C");
        listaCursos[2]= c;
        c = new Curso("1D","Primero de la ESO D");
        listaCursos[3]= c;
        c = new Curso("2A","Segundo de la ESO A");
        listaCursos[4]= c;
        c = new Curso("2B","Segundo de la ESO B");
        listaCursos[5]= c;
        c = new Curso("2C","Segundo de la ESO C");
        listaCursos[6]= c;
        c= new Curso("2D","Segundo de la ESO D");
        listaCursos[7]= c;
        c = new Curso("3A","Tercero de la ESO A");
        listaCursos[8]= c;
        c = new Curso("3B","Tercero de la ESO B");
        listaCursos[9]= c;
        c = new Curso("3C","Tercero de la ESO C");
        listaCursos[10]= c;
        c = new Curso("3D","Tercero de la ESO D");
        listaCursos[11]= c;
        c= new Curso("4A","Cuarto de la ESO A");
        listaCursos[12]= c;
        c = new Curso("4B","Cuarto de la ESO B");
        listaCursos[13]= c;
        c = new Curso("4C","Cuarto de la ESO C");
        listaCursos[14]= c;
        //cu = new Curso("4D");
        listaCursos[15]=new Curso("4D","Cuarto de la ESO D");
    }

    public static boolean buscarAlumno(String dni){
        int x;
        for(x = 0;x < listaAlumnos.size() && listaAlumnos.get(x).getDni().compareTo(dni)!= 0;x++){}
        if (x == listaAlumnos.size())
            // dni no encontrado
            return false;

        // dni encontrado
        // Variable global a
        a = listaAlumnos.get(x);
        return true;
    }

    public static String getNombre() {
        return a.getNombre();
    }

    public static String getApellidos() {
        return a.getDni();
    }

    public static String getCurso() {
        return a.getC().getCodigo();
    }

    public static boolean validarCurso(String curso){
        int x;
        for(x = 0;x < listaCursos.length && listaCursos[x].getCodigo().compareToIgnoreCase(curso)!= 0;x++){}
        if (x == listaCursos.length)
            return false;

        c = listaCursos[x];
        return true;
    }

    public static void altaAlumno(String d, String n, String a){
        listaAlumnos.add(new Alumno (d,n,a,c));
    }


    public static void borrarAlumno(){
        // Quitarla del curso
        a.getC().borrarAlumno(a);

        listaAlumnos.remove(a);
    }

    public static void modificarAlumno(){
        // Quitarla del curso
        a.getC().borrarAlumno(a);

        // Añadir al nuevo curso
        a.setC(c);
    }

    public static void terminar(){
        v.dispose();
        // No debería estar aquí. Es una comprobación
        System.out.println(generarDatos());
        System.exit(0);
    }

    public static String generarDatos(){
        String datos="";
        int x;

        // Personas
        for(x = 0; x < listaAlumnos.size();x++)
        {
            datos += listaAlumnos.get(x).getDni() + "  " + listaAlumnos.get(x).getNombre() + listaAlumnos.get(x).getApellidos();
            datos += "  " + listaAlumnos.get(x).getC().getCodigo() + " \n";
        }

        // Cursos
        datos += "\n Listado de alumnos por curso \n";
        for(x = 0; x < listaCursos.length;x++)
        {
            datos += "\n Curso: " + listaCursos[x].getCodigo() + " \n";
            for(int y=0; y < listaCursos[x].getListaAlumnos().size(); y++)
                datos += listaCursos[x].getListaAlumnos().get(y).getNombre() + " \n";

        }

        if (datos.isEmpty())
            datos = "No hay datos";
        return datos;
    }
}

