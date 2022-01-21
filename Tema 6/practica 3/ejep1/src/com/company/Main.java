package com.company;

import Clases.*;
import Excepciones.DatoNoValido;

import javax.swing.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    private static ArrayList<Veterinario> listaVeterinarios;

    public static void main(String[] args) {
        try {
            guardarDato();
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "El programa termina");
        } catch (Exception e) {
            System.out.println("Problemas: " + e.getClass());
        }
    }

    public static void guardarDato() throws Exception {

        guardarVeterinario();

    }

    public static void guardarVeterinario() throws Exception {
        boolean seguir = true;
        listaVeterinarios = new ArrayList<>();
        while (seguir) {
            listaVeterinarios.add(new Veterinario(
                    pedirDato("Nombre", "Teclea el nombre del veterinario", "^[A-Z][a-z]+([ ][A-Z][a-z]+)*$"),
                    pedirDato("Dirección", "Teclea la dirección", "^C/ [A-Z][a-z]+([ ][A-Z][a-z]+)* [0-9]{1,3} [0-9][a-zA-Z]$"),
                    pedirDato("Teléfono", "Teclea el teléfono", "^[6789][0-9]{8}$"),
                    pedirDato("DNI", "Teclea el DNI", "^[0-9]{8}[A-Za-z]$"),
                    pedirDato("Número de la seguridad social", "Teclea el número de la seguridad social", "^01 [0-9]{8} [0-9]{2}$")));

            int respuesta = JOptionPane.showConfirmDialog(null, "¿Hay más veterinarios?");
            if (respuesta != 0)
                seguir = false;
        }


    }

    public static String pedirDato(String dato, String mensaje, String exp) throws Exception {
        String variable = "";
        boolean error = true;
        while (error) {
            try {
                variable = JOptionPane.showInputDialog(mensaje);
                if (variable.isEmpty())
                    throw new DatoNoValido(dato + " es un campo obligatorio");
                Pattern pat = Pattern.compile(exp);
                Matcher mat = pat.matcher(variable);
                if (!mat.matches())
                    throw new DatoNoValido(dato + " no tiene un formato adecuado");
                error = false;
            } catch (DatoNoValido e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        return variable;
    }
}
