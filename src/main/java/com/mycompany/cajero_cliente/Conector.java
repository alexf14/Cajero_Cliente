package com.mycompany.cajero_cliente;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class Conector {

    private Connection conexion;
    
    public Connection Conectar() {
        try {
            String url, usuario, contra;
            try (InputStream is = new FileInputStream("..\\src\\main\\java\\com\\mycompany\\cajero_cliente\\base.properties")) {
                Properties propiedad = new Properties();
                propiedad.load(is);
                url = propiedad.getProperty("base.url") + "?autoReconnect=truesusesSL=false";
                usuario = propiedad.getProperty("base.usuario");
                contra = propiedad.getProperty("base.contra");
            }
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Conectando...");
            conexion = DriverManager.getConnection(url, usuario, contra);
            System.out.println("Conexión establecida...");
        } catch (IOException | ClassNotFoundException | SQLException e) {
            System.err.println("Error en la conexión debido a " + e.getMessage());       
        }
         return conexion;
    }
}