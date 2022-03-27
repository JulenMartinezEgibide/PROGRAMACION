package Modelo.BD;

import Modelo.UML.Persona;

import java.sql.*;
import java.util.ArrayList;

public class PersonasDAO {
    private Connection con;

    public PersonasDAO(Connection con)
    {
        this.con = con;
    }

    public void registrarPersona(Persona p) throws Exception
    {
        // Preparar y ejecutar la sentencia sql.

        String plantilla = "INSERT INTO personas VALUES (?,?,?,?);";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1, p.getNombreP());
        ps.setInt(2,p.getEdad());
        ps.setString(3, p.getProfesionP());
        ps.setString(4,p.getTelefonoP());
        int n = ps.executeUpdate();
        //ps.close();
        if (n != 1)
            throw new Exception("El número de filas actualizadas no es uno");
    }

    public Persona consultarPersona(String nombre) throws Exception
    {
        Persona persona=null;

        PreparedStatement consulta = con.prepareStatement("SELECT * FROM personas where nombre = ? ");
        consulta.setString(1, nombre);
        ResultSet res = consulta.executeQuery();
        // 0 o 1 fila seleccionada
        if(res.next())
        {
            persona= new Persona();
            persona.setNombreP(res.getString("nombre"));
            persona.setEdad(res.getInt("edad"));
            persona.setProfesionP(res.getString("profesion"));
            persona.setTelefonoP(res.getString("telefono"));
        }
        else
            throw new Exception ("Persona no encontrada");


        res.close();
        consulta.close();

        return persona;
    }

    public ArrayList<Persona> listaDePersonas() throws Exception
    {
        ArrayList< Persona> listaPersonas = new ArrayList();

        Statement consulta = con.createStatement();
        ResultSet res = consulta.executeQuery("Select * from personas;");
        // n filas seleccionadas
        while(res.next())
        {
            Persona persona= new Persona();
            persona.setNombreP(res.getString("nombre"));
            persona.setEdad(res.getInt("edad"));
            persona.setProfesionP(res.getString("profesion"));
            persona.setTelefonoP(res.getString("telefono"));
            listaPersonas.add(persona);
        }
        res.close();
        consulta.close();

        return listaPersonas;
    }

}
