package com.company;

import Clases.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Creo empresas
        Empresa[] listaEmpresas = new Empresa[3];
        // La primera sólo con el nombre
        listaEmpresas[0] = new Empresa("Carrefour");
        listaEmpresas[0].setListaClientes(getListaClientes0());
        listaEmpresas[0].setListaEmpleados(getListaEmpleados0());
        // La segunda con nombre y clientes
        listaEmpresas[1] = new Empresa("Mercadona", getListaCliente());
        listaEmpresas[1].setListaEmpleados(getListaEmpleado());

        listaEmpresas[2] = new Empresa("Egibide", getListaClientes2());
        añadirEmpleados(listaEmpresas[2]); // De uno en uno

        DirMasSubordinados(listaEmpresas);
    }

    public static void añadirEmpleados(Empresa empresa) {
        Empleado e = new Empleado("Antonio", 27, 1000);
        empresa.setEmpleado(e);
        e = new Empleado("Marcos", 50, 1000);
        empresa.setEmpleado(e);

    }

    public static ArrayList<Cliente> getListaClientes0() {
        ArrayList<Cliente> lista = new ArrayList();
        // Clientes con nombre, edad y teléfono
        lista.add(new Cliente("c1", 32, "111"));
        lista.add(new Cliente("c2", 21, "411"));
        lista.add(new Cliente("c3", 41, "611"));
        return lista;
    }

    public static ArrayList<Cliente> getListaClientes2() {
        ArrayList<Cliente> lista = new ArrayList();
        // Clientes con nombre, edad y teléfono
        lista.add(new Cliente("a1", 61, "111"));
        lista.add(new Cliente("a2", 36, "411"));
        lista.add(new Cliente("a3", 44, "611"));
        return lista;
    }

    public static ArrayList<Empleado> getListaEmpleados0() {
        ArrayList<Empleado> lista = new ArrayList();
        // Empleados con nombre, edad y sueldoBruto
        lista.add(new Empleado("e1", 37, 15000));
        lista.add(new Empleado("e2", 42, 22000));
        lista.add(new Empleado("e3", 54, 31000));

        // Uno de los empleados será el jefe
        Directivo objD = new Directivo("Jefe1", 45, 50000, "Categoria uno");

        // Un directivo también es un empleado
        lista.add(objD);

        // El directivo todavía no está completo
        ArrayList<Empleado> listaSubordinados = new ArrayList();
        listaSubordinados.add(lista.get(0));
        objD.setSubordinados(listaSubordinados);


        objD = new Directivo("Jefe2", 45, 50100, "Categoria uno");
        listaSubordinados = new ArrayList();
        listaSubordinados.add(lista.get(1));
        listaSubordinados.add(lista.get(2));
        objD.setSubordinados(listaSubordinados);
        lista.add(objD);

        return lista;
    }

    public static ArrayList<Cliente> getListaCliente() {
        ArrayList<Cliente> lista = new ArrayList();
        lista.add(new Cliente("Raul", 27, "198"));
        lista.add(new Cliente("Luis", 37, "418"));
        lista.add(new Cliente("Imanol", 47, "547"));
        lista.add(new Cliente("Marta", 61, "321"));
        lista.add(new Cliente("Esther", 39, "412"));
        return lista;
    }

    public static ArrayList<Empleado> getListaEmpleado() {
        ArrayList<Empleado> lista = new ArrayList();
        lista.add(new Empleado("e11", 21, 11500));
        lista.add(new Empleado("e21", 31, 20500));
        lista.add(new Empleado("e31", 41, 38500));
        lista.add(new Empleado("e51", 21, 109500));
        lista.add(new Empleado("e61", 36, 40990));

        Directivo objD = new Directivo("Jefe 56", 45, 51700, "Categoria uno");
        ArrayList<Empleado> listaSubordinados = new ArrayList();
        listaSubordinados.add(lista.get(0));
        listaSubordinados.add(lista.get(1));
        listaSubordinados.add(lista.get(2));
        objD.setSubordinados(listaSubordinados);
        lista.add(objD);

        objD = new Directivo("Jefe 67", 45, 51400, "Categoria uno");
        listaSubordinados = new ArrayList();
        listaSubordinados.add(lista.get(3));
        listaSubordinados.add(lista.get(4));
        objD.setSubordinados(listaSubordinados);
        lista.add(objD);

        return lista;
    }

    public static void DirMasSubordinados(Empresa[] lista) {
        int max = 0;
        Directivo objetoMaximo = null;

        // En todas las empresas.
        for (int x = 0; x < lista.length; x++) {
            // empleados de una empresa
            for (int y = 0; y < lista[x].getListaEmpleados().size(); y++) {
                // Es o no es un directivo? En el ArrayList hay empleados y directivos.
                if (lista[x].getListaEmpleados().get(y) instanceof Directivo) {
                    // conversión
                    Directivo objeto = (Directivo) lista[x].getListaEmpleados().get(y);
                    if (objeto.getSubordinados().size() > max) {
                        objetoMaximo = objeto;
                        max = objeto.getSubordinados().size();
                    }
                }

            }
        }
        javax.swing.JOptionPane.showMessageDialog(null, " El directivo que más subordinados tiene es " + objetoMaximo.getNombre() + " y tiene " + max + " empleados a su cargo");
    }
}

