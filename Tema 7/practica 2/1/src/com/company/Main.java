package com.company;

import Modelo.*;
import Vista.*;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    private static ArrayList<Producto> listaProductos;
    private static Producto pro;
    private static JFrame ventPrin;

    public static void main(String[] args) {
        creaLista();
        mostrarVentanaPrincipal();
    }


    public static void creaLista() {

        listaProductos = new ArrayList<>();
        pro = new Producto("Manzanas", 1, 100);
        listaProductos.add(pro);
        pro = new Producto("Naranjas", 2, 50);
        listaProductos.add(pro);
        pro = new Producto("Patatas", 3, 1000);
        listaProductos.add(pro);
        listaProductos.add(new Producto("Pimientos", 1, 10));
        listaProductos.add(new Producto("Fresas", 4, 76));
        listaProductos.add(new Producto("Nueces", 10, 25));

    }

    public static void mostrarVentanaPrincipal() {
        ventPrin = new JFrame("VentanaPrincipal");
        ventPrin.setContentPane(new VentanaPrinci().getpPrincipal());
        ventPrin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventPrin.setLocationRelativeTo(null);
        ventPrin.pack();
        ventPrin.setVisible(true);
    }


}

