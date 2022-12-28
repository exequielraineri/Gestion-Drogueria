package Conexion;

import java.sql.*;

public class Conexion {

    Connection con;
    //String url = "jdbc:mysql://192.168.0.13:3306/farmacia?autoReconnect=true&useSSL=false";
    String url="jdbc:mysql://192.168.0.17:3306/farmacia?autoReconnect=true&useSSL=false";
    String username="Prueba";
    String password="root";

    public Conexion(String user, String pass) {
//        username=user;
//        password=pass;



        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);
            if (con != null) {
                System.out.println("Conexion exitosa");
            } else {
                System.out.println("Conexion erronea");
            }

        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error->: " + e);
        }
    }

    //este metodo nos retorna la conexion
    public Connection getConnection() {
        return con;
    }

    //este metodo nos desconectamos de la base de datos
    public void desconectar() {
        con = null;
        if (con == null) {
            System.out.println("Conexion terminada");
        }
    }

}
