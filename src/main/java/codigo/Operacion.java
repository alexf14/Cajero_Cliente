package codigo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Operacion {
    Cuenta c = new Cuenta();
    GuardarDatos g = new GuardarDatos ();
    Conector conector = new Conector();
    
    private String tipo;
    private float cantidad;
    
    String nTarjeta = g.getnTarjeta();
    String nCuenta = c.getNum(nTarjeta);

    public Operacion(String tipo, float cantidad) {
        this.tipo = tipo;
        this.cantidad = cantidad;
    }
    
    public void guardar(){
        String operacion = "insert into operacion (cantidad, fecha_validacion, numero_cuenta, numero_tarjeta, tipo) values ('"+cantidad +"', current_timestamp(), '"+nCuenta+"', '"+nTarjeta+"', '"+tipo+"')";
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conector.conectar();
        
        try{
            ps = con.prepareStatement(operacion);
            ps.executeUpdate();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
