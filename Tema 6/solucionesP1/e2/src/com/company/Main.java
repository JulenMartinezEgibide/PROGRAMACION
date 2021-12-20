package com.company;

import Excepciones.*;
import Modelo.Alumno;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {
    private static ArrayList<Alumno> listaClase;

    public static void main(String[] args) {
        try
        {
            listaClase = new ArrayList();
            obtenerDatosAlumnos();
            buscarPorCodigo();
        }
        catch(Exception e)
        {
            System.out.println("Problemas " + e.getMessage());
        }

        //new Main()
    }


    public static void buscarPorCodigo() throws Exception{
        String codigo = JOptionPane.showInputDialog("Teclea el código del alumno a buscar");
        // Validar
        validarCodigo(codigo);
        // Buscar por código
        int x;
        for(x = 0; x < listaClase.size() && !listaClase.get(x).getCodigo().equals(codigo); x++){}
        if( x == listaClase.size())
            JOptionPane.showMessageDialog(null,"Alumno no encontrado");
        else
            JOptionPane.showMessageDialog(null,"Objeto alumno: " + listaClase.get(x) + "\n" + listaClase.get(x).toString());

    }

    public static void obtenerDatosAlumnos()throws Exception{
        do
        {
            try
            {
                String codigo = JOptionPane.showInputDialog("Teclea el código del alumno");
                validarCodigo(codigo);
                String nombre = JOptionPane.showInputDialog("Teclea el nombre del alumno");
                validarNombre(nombre);
                String domicilio = JOptionPane.showInputDialog("Teclea el domicilio del alumno");
                validarDomicilio(domicilio);
                String telefono = JOptionPane.showInputDialog("Teclea el teléfono del alumno");
                validarTelefono(telefono);

                Alumno a = new Alumno(codigo,nombre,domicilio,telefono);

                listaClase.add(a);
            }
            catch(DatoNoValido e){
                JOptionPane.showMessageDialog(null,"El dato introducido no es correcto.");
            }
        }
        while(JOptionPane.showConfirmDialog(null,"¿ Quieres continuar con otro alumno?")==0);
    }

    public static void validarCodigo(String codigo)throws Exception{
        // Cinco dígitos numéricos
        boolean error=false;
        if (codigo.length()!= 5)
            error = true;
        else
            for (int x = 0; x < codigo.length() && !error;x++)
                if (Character.isAlphabetic(codigo.charAt(x)))
                    error = true;
        if (error)
            throw new DatoNoValido();

    }

    public static void validarNombre(String nombre)throws Exception{

        boolean error=false;
        if (nombre.length()<= 2)
            error = true;
        else
            // Todo letras
            for (int x = 0; x < nombre.length() && !error;x++)
                if (Character.isDigit(nombre.charAt(x)))
                    error = true;
        if (error)
            throw new DatoNoValido();

    }

    public static void validarDomicilio(String domicilio)throws Exception{
        if (domicilio.length()<= 10)
            throw new DatoNoValido();

    }

    public static void validarTelefono(String telefono) throws Exception{
        // 9 digitos numéricos empezando por 6, 7 , 8 o 9
        boolean error=false;
        if (telefono.length()!= 9)
            error = true;
        else
        if (telefono.charAt(0)!= '6' && telefono.charAt(0)!= '7' && telefono.charAt(0)!= '8' && telefono.charAt(0)!= '9' )
            error = true;
        else
            for (int x = 0; x < telefono.length() && !error;x++)
                if (Character.isAlphabetic(telefono.charAt(x)))
                    error = true;
        if (error)
            throw new DatoNoValido();
    }
}

// Podíamos reutilizar más el código con una función para validar numeros y otra para validar letras.