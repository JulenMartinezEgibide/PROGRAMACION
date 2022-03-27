package com.company;

import Modelo.BD.BD;
import Modelo.BD.PersonasDAO;
import Modelo.UML.Persona;
import Vista.*;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    private static int opcion;

    private static JFrame vm;
    private static V2 vo;

    private static BD bd;
    private static PersonasDAO pdao;

    private static ArrayList<Persona> listaPersonas;
    private static int posicion;

    public static void main(String[] args) {
        try {
            // Conexión a la base de datos
            bd = new BD();
            pdao = new PersonasDAO(bd.getCon());

            // Creación de la primera ventana
            crearVP();

        }
        catch(Exception e)
        {
            System.out.println(e.getClass());
        }

    }
    public static void crearVP()
    {
        vm = new JFrame("Ventana Principal");
        vm.setContentPane(new Vp().getpVp());
        vm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //vm.setLocationRelativeTo(null);
        vm.pack();
        vm.setVisible(true);
    }
    public static void crearV2()
    {
        vm.setVisible(false);

        /*vo = new JFrame("VentanaOperaciones");
        vo.setContentPane(new VentanaOperaciones().getpPrincipal());
        vo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vo.pack();
        vo.setVisible(true);*/

        // no me limito a copiar y adaptar el main. He utilizado el constructor para pasar la opción.
        //vo = new JFrame("VentanaOperaciones");
        vo = new V2(opcion);
        vo.setContentPane(vo.getPanelV2());
        //vo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //vo.setLocationRelativeTo(null);
        vo.pack();
        vo.setVisible(true);

    }

    public static void volverMenu()
    {
        vo.dispose();
        vm.setVisible(true);
    }

    public static void getOpcion(int op) throws Exception{
        // Si la opción es cuatro, se acaba el proyecto.
        // Guardar la opción en variable global y crear y mostrar la ventana operaciones.
        // En la ventana operaciones también hará falta saber la opción elegida.

        opcion = op;

        switch(opcion)
        {
            case 1: case 2:
            crearV2();
            break;
            case 3:
                listaPersonas = pdao.listaDePersonas();
                if (listaPersonas.size() > 0) {    // Paso ya los datos de la primera persona.
                    crearV2();
                    posicion = 0;
                    vo.setDatosPersona(listaPersonas.get(posicion).getNombreP(), listaPersonas.get(posicion).getEdad(), listaPersonas.get(posicion).getProfesionP(), listaPersonas.get(posicion).getTelefonoP());
                }
                else
                    throw new Exception("No hay personas");
                break;
            case 4:
                bd.cerrarBD();
                System.exit(0);
        }
    }
    public static void getSiguiente() throws Exception
    {
        if (posicion != listaPersonas.size() - 1) {
            posicion++;
            vo.setDatosPersona(listaPersonas.get(posicion).getNombreP(), listaPersonas.get(posicion).getEdad(), listaPersonas.get(posicion).getProfesionP(), listaPersonas.get(posicion).getTelefonoP());
        }
        else
            throw new Exception("No hay siguiente");
    }

    public static void getAnterior() throws Exception
    {
        if (posicion != 0) {
            posicion--;
            vo.setDatosPersona(listaPersonas.get(posicion).getNombreP(), listaPersonas.get(posicion).getEdad(), listaPersonas.get(posicion).getProfesionP(), listaPersonas.get(posicion).getTelefonoP());
        }
        else
            throw new Exception("No hay anteror");
    }

    public static void getDatos(String n,String e,String p, String t) throws Exception
    {
        // Tras recibir los datos validados de la ventana. Primero se crea el objeto y luego se manda a la bd
        Persona persona=new Persona(n,Integer.parseInt(e),p,t);
        pdao.registrarPersona(persona);
        volverMenu();

    }
    public static void getNombre(String n) throws Exception
    {
        Persona p = pdao.consultarPersona(n);
        // tras la consulta paso los datos a la ventana para que los muestre.
        vo.setDatosPersona(p.getEdad(),p.getProfesionP(),p.getTelefonoP());
    }



}
