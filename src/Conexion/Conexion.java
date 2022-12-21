package Conexion;

import java.sql.*;

public class Conexion {

    Connection con;

    public Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/farmacia", "root", "root");
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
