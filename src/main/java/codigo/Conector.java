package codigo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class Conector {

    private Connection conexion;
    
    public Connection conectar() {
        try {
            String url, usuario, contra;
            try (InputStream is = new FileInputStream("..\\Cajero_Cliente\\base.properties")) {
                Properties propiedad = new Properties();
                propiedad.load(is);
                url = propiedad.getProperty("base.url");
                usuario = propiedad.getProperty("base.usuario");
                contra = propiedad.getProperty("base.contra");
            }
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, contra);
        } catch (IOException | ClassNotFoundException | SQLException e) {
            System.err.println("Error en la conexión debido a " + e.getMessage());       
        }
         return conexion;
    }
}