package com.company;

// El controlador tiene que tener acceso al modelo y a la vista.
import Modelo.*;
import Vista.*;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    // "base de datos"
    private static ArrayList<Persona> listaPersonas;
    // Referencias a las ventanas
    private static JFrame v1,v2;

    public static void main(String[] args)
    {
        // "Base de datos"
	    listaPersonas = new ArrayList();

        // Creación  y visualización de la primera ventana.
        // Copia y adaptación del main de la propia ventana.
        v1 = new JFrame("V1");
        v1.setContentPane(new V1().getPanel());
        v1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        v1.setLocationRelativeTo(null); // centrada y no en la esquina superior izquierda
        v1.pack();
        v1.setVisible(true);

    }

    public static void crearPersona(String n,String a,String dni )
    {
        listaPersonas.add(new Persona(n,a,dni));
    }

    public static void getDatos()
    {
        // Obtener datos
        String datos="";
        for(Persona p: listaPersonas)
            datos+=p.toString();

        // Ceder el control a la segunda ventana.
        //.setVisible(false);
        v1.dispose();
        v2 = new JFrame("V2");
        // He modificado el constructor para que admita datos.
        v2.setContentPane(new V2(datos).getPanel());
        v2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        v2.setExtendedState(JFrame.MAXIMIZED_BOTH); // sale maximizada
        v2.pack();
        v2.setVisible(true);



    }
}
