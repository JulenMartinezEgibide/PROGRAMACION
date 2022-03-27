package com.company;

import Modelo.BD.AcontecimientosDAO;
import Modelo.UML.Acontecimiento;
import Vista.DInsertar;
import Vista.VentanaPrincipal;

import javax.swing.*;
import java.time.LocalDate;
import java.time.LocalTime;

public class Main {

    private static JFrame vp;
    private static Acontecimiento a;

    private static AcontecimientosDAO adao;

    public static void main(String[] args) {
	   mostrarVentanaPrincipal();
       // Que la aplicación empieze por el main de la ventana
    }

    public static void mostrarVentanaPrincipal()
    {
        vp = new JFrame("VentanaPrincipal");
        vp.setContentPane(new VentanaPrincipal().getpPrincipal());
        vp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vp.setExtendedState(JFrame.MAXIMIZED_BOTH);
        vp.pack();
        vp.setVisible(true);
    }

    public static void mostrarInsertar()
    {
        // Mostrar el JDialog que permite introducir los datos de un evento
        DInsertar dialog = new DInsertar();
        dialog.setLocationRelativeTo(null);
        dialog.pack();
        dialog.setVisible(true);
    }

   public static void getDatosAcontecimiento(String n, String l, LocalDate f, LocalTime hi, LocalTime hf, int af) throws Exception
   {
       // Crear objeto y mandarlo a la base de datos
       a = new Acontecimiento(n,l,f,hi,hf,af);

       // Abrir, ejecutar y cerrar
       AcontecimientosDAO.alta(a);
   }
}
