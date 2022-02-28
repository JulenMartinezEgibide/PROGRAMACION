package com.company;

import Modelo.Cliente;
import Modelo.Cuenta;
import Modelo.Movimiento;
import Vista.*;

import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    private static ArrayList<Cliente>listaClientes;
    private static Cliente cliente;
    private static Cuenta cuenta;

    private static JFrame Vp;
    public static void main(String[] args) {

       generaDatos();
       mostrarVentanaPrincipal();

    }

    public static void generaDatos(){
        listaClientes = new ArrayList();
        Cliente c = new Cliente("11111111A", "Iker Gonzalez", "12345");
        Cliente d = new Cliente("22222222B","Julen Martinez", "54321");

        Cuenta c0 = new Cuenta("1234567890");
        Cuenta c1 = new Cuenta("0987654321");
        Cuenta d0 = new Cuenta("1234509876");
        Cuenta d1 = new Cuenta("0987612345");

        Movimiento m1 = new Movimiento(LocalDate.now(), "Primer moviento para ingresar dinero", 100);
        Movimiento m2 = new Movimiento(LocalDate.now(),"Segundo movimiento para retirar",-200);
        Movimiento b1 = new Movimiento(LocalDate.now(),"Gane la loteria", 10000);


    }
    public static void mostrarVentanaPrincipal() {
        Vp = new JFrame("VentanaPrincipal");
        Vp.setContentPane(new Vp().getpPrincipal());
        Vp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Vp.setLocationRelativeTo(null);
        Vp.pack();
        Vp.setVisible(true);
    }

    public static void mostrarAcceso(){
        V12 dialog = new V12();
        dialog.pack();
        dialog.setVisible(true);
    }

    public static void validarNIFClave(){}

    public static void mostrarMovimiento(){

    }



}
