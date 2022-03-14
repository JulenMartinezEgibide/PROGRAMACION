package Modelo.BD;

import java.sql.*;
public class BD {

    public static void generarBD(){
        private Connection con;

        // 1. Cargar el controlador de acceso a datos
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");


        // 2. Conectarse a la base de datos
        String url = "jdbc:mysql :// localhost :3306/ julen";
        String user = "root";
        String passwd = "usbw";
        con = DriverManager . getConnection (url , user ,
                passwd);

        // 3. Construir comandos SQL
        PersonasDAO.generarDatosBD();


        // 4. Cerrar
        con.close();

        } catch (Exception e) {
            System.out.println(" Problemas con la base de datos " + e. getMessage ());
        }

        public Connection getConnection(){
            return connection;
        }

        public void desconecta() throws Exception{
            // 4. Cerrar
            con.close();
        }
    }


}
