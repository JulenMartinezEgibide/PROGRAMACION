package Modelo.BD;

import Modelo.UML.Acontecimiento;

import java.sql.*;
import java.time.LocalDate;

public class AcontecimientosDAO {

    /* Clase que contiene los métodos necesarios para trabajar
       con la tabla acontecimientos */

    private  static Acontecimiento acontecimiento;

    private  static PreparedStatement sentenciaPre;
    private  static String plantilla;
    private  static Statement sentencia;
    private  static ResultSet resultado;

    public  static void alta(Acontecimiento ac) throws Exception
    {
        /* Método que inserta una fila en la tabla de los acontecimientos a partir de un objeto de tipo acontecimiento.
        Este método también se suele llamar save.*/

        // Abrir la conexión
        BaseDatos.abrirBD();

        // Preparar la sentencia que se quiere ejecutar
        plantilla = "INSERT INTO acontecimientos (nombre, lugar, fecha,hora_i, hora_f, aforo) VALUES (?,?,?,?,?,?)";
        sentenciaPre = BaseDatos.getCon().prepareStatement(plantilla);
        sentenciaPre.setString(1,ac.getNombre());
        sentenciaPre.setString(2,ac.getLugar());
        sentenciaPre.setDate(3, conversionDate(ac.getFecha()));
        sentenciaPre.setTime(4, conversionTime(ac.getHoraI()));
        sentenciaPre.setTime(5, conversionTime(ac.getHoraF()));
        sentenciaPre.setInt(6,ac.getAforo());

        // Ejecutar sentencia
        int n = sentenciaPre.executeUpdate();
        System.out.println( n + "filas insertadas");

        // Cerrar la conexión
        BaseDatos.cerrarBD();
    }

    public static Date conversionDate(LocalDate fecha)
    {
        // Conversión LocalDate en java.sql.Date
        return Date.valueOf(fecha);
    }

    public static Time conversionTime(java.time.LocalTime hora)
    {
        // Conversion java.time.LocalTime en java.sql.Time
        return Time.valueOf(hora);
    }
}
