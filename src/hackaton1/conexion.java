/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackaton1;

import java.sql.*;
import java.util.logging.Level;

/**
 *
 * @author l
 */
public class conexion {

    Connection cn;

    public Connection conectar() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=hackatonDB", "sa", "123");
            System.out.println("conexion exitosa");
        } catch (Exception e) {
            System.out.println("Error al conectar");
            java.util.logging.Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, e);
        }
        return cn;
    }

    Statement createStatemen() {
        throw new UnsupportedOperationException("no soportado");
    }
    
    public void desconectar(){
        cn = null;
        System.out.println("Desconexion exitosa");
    }
}
