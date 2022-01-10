package com.company;

import Alumno.Alumno;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    private static Alumno Alumnos = new Alumno();

    public static void main(String[] args) {

        ArrayList<Alumno> listaAlumnos = new ArrayList();
        pedirDatos(listaAlumnos);
        recibirDatos(listaAlumnos);
    }

    public static void pedirDatos(ArrayList listaAlumnos) {
        int continuar;
        do {
            Alumnos.setCodigo(JOptionPane.showInputDialog(null, "Introduce codigo alumno:"));
            Alumnos.setNombre(JOptionPane.showInputDialog(null, "Introduce nombre alumno:"));
            Alumnos.setDomicilio(JOptionPane.showInputDialog(null, "Introduce domicilio alumno:"));
            Alumnos.setTelefono(Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce Telef alumno:")));
            listaAlumnos.add(new Alumno(Alumnos.getCodigo(), Alumnos.getNombre(), Alumnos.getDomicilio(), Alumnos.getTelefono()));
            continuar = JOptionPane.showConfirmDialog(null, "¿Hay algun alumno mas?");
        } while (continuar == 0);
    }
    public static void recibirDatos(ArrayList<Alumno> listaAlumnos){
        String codigoBus = JOptionPane.showInputDialog(null,"Introduce codigo a buscar:");
        for (int x = 0; x<listaAlumnos.size();x++){
            if (codigoBus){

            }
        }
    }
}
