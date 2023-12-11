
package config;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ARISTA
 */
public class conexion {
    Connection  con;
    
    String url = "jdbc:mysql://localhost:3306/demo1?characterEncoding=UTF-8";
    String usuario = "root";
    String contraseña = "";
    public conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, usuario, contraseña);
        } catch(Exception e){
            System.out.println("Error conexion"+e);
        }
    }
    public Connection getConection(){
        return con;
    }
}
