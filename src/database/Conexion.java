/*
 * To change this license header, choose License Headers in Project Properties. To change this template file, choose Tools |
 * Templates and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Ingeniero Alexander Gonzalez
 */
public class Conexion {

    /** Metodo que realiza la conexion a la Base de datos return Connection. */

    private Driver driver = null;

    /**
     * Metodo que realiza la conexion a la Base de datos return Connection
     * 
     * @return La conexion
     * @throws SQLException
     */
    @SuppressWarnings("rawtypes")
    public synchronized Connection conexionBd() throws SQLException {

        if (driver == null) {
            try {
                Class jdbcDriverClass = Class.forName(Constants.JDBC_DRIVER);
                driver = (Driver) jdbcDriverClass.newInstance();
                DriverManager.registerDriver(driver);
            }
            catch (Exception e) {
                System.out.println("Fallo en cargar el driver JDBC");
                e.printStackTrace();
            }
        }

        return DriverManager.getConnection(Constants.JDBC_URL, Constants.JDBC_USER, Constants.JDBC_PASS);
    }

    /**
     * Cierre del ResultSet
     * 
     * @param rs
     */
    public static void close(ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
        }
        catch (Exception sqle) {
            sqle.printStackTrace();
        }
    }

    // Cierre del prepareStatement
    /**
     * @param stmt
     */
    public static void close(PreparedStatement stmt) {
        try {
            if (stmt != null) {
                stmt.close();
            }
        }
        catch (Exception sqle) {
            sqle.printStackTrace();
        }
    }

    
    // Cierre de la Connexion
    /**
     * @param conn
     */
    public static void close(Connection conn) {
        try {
            if (conn != null) {
                conn.close();
            }
        }
        catch (Exception sqle) {
            sqle.printStackTrace();
        }
    }

    /**
     * Constantes de la clase.
     */
    public interface Constants {

        /** Identificador de driver de conexin.*/
        String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        /** Identificador de la URL de conexión a la BD.*/
        String JDBC_URL    = "jdbc:mysql://localhost:3306/bartender";
        /** Usuario de conexión a la base de datos.*/
        String JDBC_USER   = "root";
        /** Password de conexión a la base de datos.*/
        String JDBC_PASS   = "";
    }

}
