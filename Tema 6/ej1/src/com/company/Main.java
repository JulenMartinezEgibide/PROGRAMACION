package com.company;

import Clases.Circunferencia;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        try {
            Circunferencia circulo = new Circunferencia();
            circulo.setRadio(Float.parseFloat(JOptionPane.showInputDialog(null, "Introduce el radio:")));

            float longitud = (float) (2 * Math.PI * circulo.getRadio());
            float area = (float) (Math.PI * Math.pow(circulo.getRadio(), 2));
            float volumen = (float) (4 * Math.PI * Math.pow(circulo.getRadio(), 3) / 3);

            JOptionPane.showMessageDialog(null, "la longitud: " + longitud + "\n"
                    + "el area: " + area + "\n"
                    + "el volumen: " + volumen);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error tipo:" + e.getClass());
        }

    }
}
