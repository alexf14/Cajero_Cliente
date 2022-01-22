package codigo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Tarjeta {
    Cuenta c = new Cuenta ();
    
    public boolean validar(String num, String cvs, String pin, String fCad){
        Conector conector = new Conector();

        boolean validado = false;
        String validacion = "select count(numero) from tarjeta where numero = '"+ num +"' and fecha_caducidad = '"+ fCad +"' and cvs = '"+ cvs +"' and pin = '"+ pin +"'";
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conector.conectar();
        
        
        try{
            ps = con.prepareStatement(validacion);
            rs = ps.executeQuery();
            
            if(rs.next()){
                int a=rs.getInt(1);
                if(a==1){
                    validado = true;
                }
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return validado;
    }
    
    public float consultarSaldo (String tarjeta){    
        return c.getSaldo(tarjeta);
    }
    
    public void ingreso (float importe){
        c.actualizarSaldo(importe, true);
    }
    
    public void reintegro (float importe){
        c.actualizarSaldo(importe, false);
    }
}
