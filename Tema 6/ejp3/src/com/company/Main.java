package com.company;

import Clases.Persona;


import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    private static int continuar;
    private static ArrayList<Persona> listaPersona;

    public static void main(String[] args) {
        try {
            listaPersona = new ArrayList();
            pedirDatos();
            sacarDatos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error tipo: " + e.getClass());
        }

    }

    public static void pedirDatos() {

        do {
            String nombre = JOptionPane.showInputDialog(null, "Introduce nombre");
            int dNacimiento = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce dia Cuple:"));
            int mNacimiento = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce mes Cuple:"));
            int aNacimiento = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce año Cuple:"));
            LocalDate FechaCumple = LocalDate.of(aNacimiento, mNacimiento, dNacimiento);
            String direccion = JOptionPane.showInputDialog(null, "Introduce dir:");
            int codPostal = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce codigo postal:"));
            String ciudad = JOptionPane.showInputDialog(null, "Introduce la ciudad:");

            Persona a = new Persona(nombre, FechaCumple, direccion, codPostal, ciudad);

            listaPersona.add(a);
            continuar = JOptionPane.showConfirmDialog(null, "Aguna persona mas?");
        } while (continuar == 0);

    }

    public static void sacarDatos() {
        personaMVieja();
        personaElche();
        personaMEdad();
    }

    public static void personaMVieja() {
        LocalDate mayor = LocalDate.now();
        String nombreMayor = "";
        int x;
        for (x = 0; x < listaPersona.size(); x++) {
            if (listaPersona.get(x).getFechaCumple().isBefore(mayor)) {
                mayor = listaPersona.get(x).getFechaCumple();
                nombreMayor = listaPersona.get(x).getNombre();
            }
        }
        JOptionPane.showMessageDialog(null,
                "La persona mas mayor es " + mayor + " llamado " + nombreMayor);
    }

    public static void personaElche() {
        String perElche = "";
        String nombreElche;
        int x;
        for (x = 0; x < listaPersona.size(); x++) {
            if (listaPersona.get(x).getCiudad().equals("Elche")) {

                nombreElche = listaPersona.get(x).getNombre();
                perElche += nombreElche + " es de Elche \n";
            }

        }
        JOptionPane.showMessageDialog(null, perElche);
    }

    public static void personaMEdad() {
        LocalDate fecha2 = LocalDate.now().minusYears(18);
        int x;
        int contador = 0;
        for (x = 0; x < listaPersona.size(); x++) {
            if (listaPersona.get(x).getFechaCumple().isBefore(fecha2)) {
                contador++;
            }
        }
        JOptionPane.showMessageDialog(null, "Numero de persaonas +18: " + contador);
    }
}
