package com.company;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    private static int continua;
    private static int opcion;

    public static void main(String[] args) {
        ArrayList<Float> listaVal = new ArrayList();
        recibeDatos(listaVal);
    }

    public static void recibeDatos(ArrayList<Float> listaVal) {
        try {
            do {
                float valor = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduce un valor"));
                listaVal.add(valor);
                continua = JOptionPane.showConfirmDialog(null, "Quiere continuar?");
            } while (continua == 0);
            MostrarMenu(listaVal);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error tipo: " + e.getClass());
        }
    }

    public static void MostrarMenu(ArrayList<Float> listaVal) throws Exception {

        opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Introduce una opcion: " + "\n"
                        + "1)Visualizar el valor maximo y el minimo" + "\n"
                        + "2)Buscar numero" + "\n"
                        + "3)Buscar numero y borrar" + "\n"
                        + "4)Convertir en array" + "\n"
                        + "5)Cantidad de elementos" + "\n"
                        + "6)Insertar por el final" + "\n"
                        + "7)Insertar por posicion concreta" + "\n"
                        + "8)Borrar por posicion concreta" + "\n"
                        + "9)Sumar y media de los valores" + "\n"
                        + "10)Fin" + "\n"));

        switch (opcion) {
            case 1:
                MaxMin(listaVal);
                MostrarMenu(listaVal);
                break;
            case 2:
                BuscaNum(listaVal);
                MostrarMenu(listaVal);
                break;
            case 3:
                BuscaNumB(listaVal);
                MostrarMenu(listaVal);
                break;
            case 4:
                Convertir(listaVal);
                MostrarMenu(listaVal);
                break;
            case 5:
                CantidadE(listaVal);
                MostrarMenu(listaVal);
                break;
            case 6:
                InsertaF(listaVal);
                MostrarMenu(listaVal);
                break;
            case 7:
                InsertaP(listaVal);
                MostrarMenu(listaVal);
                break;
            case 8:
                BorrarP(listaVal);
                MostrarMenu(listaVal);
                break;
            case 9:
                SumaMedia(listaVal);
                MostrarMenu(listaVal);
                break;
            case 10:
                JOptionPane.showMessageDialog(null, "Fin");
                break;
            default:
                JOptionPane.showMessageDialog(null, "VALOR ERRONEO");
                MostrarMenu(listaVal);
        }
    }

    public static void MaxMin(ArrayList<Float> listaVal) {

    }

    public static void BuscaNum(ArrayList<Float> listaVal) {
        float numero = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduce numero ha buscar:"));
        boolean encontrado = false;
        for (Float num : listaVal) {
            if (num == numero) {
                encontrado = true;
            }
        }
        if (encontrado == true) {
            JOptionPane.showMessageDialog(null, "Numero encontrado");
        } else {
            JOptionPane.showMessageDialog(null, "Numero NO encontrado");
        }
    }

    public static void BuscaNumB(ArrayList<Float> listaVal){
        float numero = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduce numero ha buscar:"));
        boolean encontrado = false;
        for (Float num : listaVal) {
            if (num == numero) {
                encontrado = true;
                listaVal.remove(num);
            }
        }
        if (encontrado == true) {
            JOptionPane.showMessageDialog(null, "Numero encontrado y borrado");
        } else {
            JOptionPane.showMessageDialog(null, "Numero NO encontrado");
        }
    }

    public static void Convertir(ArrayList<Float> listaVal){}

    public static void CantidadE(ArrayList<Float> listaVal) {
        JOptionPane.showMessageDialog(null, "El numero de elementos que hay son: " + listaVal.size());
    }

    public static void InsertaF(ArrayList<Float> listaVal) {
        float valor2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduce valor por el final:"));
        listaVal.add(valor2);
    }

    public static void InsertaP(ArrayList<Float> listaVal) {
        float valor3 = Float.parseFloat(JOptionPane.showInputDialog(null, "Introduce valor:"));
        int posicion = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce posicion añadido:"));
        listaVal.add(posicion, valor3);
    }

    public static void BorrarP(ArrayList<Float> listaVal) {
        int posicion = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce posicion borrado:"));
        listaVal.remove(posicion);
    }

    public static void SumaMedia(ArrayList<Float> listaVal){}

}
