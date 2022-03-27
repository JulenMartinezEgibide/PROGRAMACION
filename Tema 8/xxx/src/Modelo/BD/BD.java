package Modelo.BD;

import java.sql.*;
public class BD {

    private static Connection con;

    public static void abrirBD() throws Exception
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql :// localhost :3306/ julen";
        con = DriverManager.getConnection(url,"root","usbw");
    }

    public static void cerrarBD() throws Exception
    {
        con.close();
    }

    public static Connection getCon()
    {
        return con;
    }
}
