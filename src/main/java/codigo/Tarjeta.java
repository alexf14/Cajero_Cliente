package codigo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Tarjeta {
    Cuenta c = new Cuenta ();
    Conector conector = new Conector();
    GuardarDatos g = new GuardarDatos ();
    
    String limiteDiario;
    String limiteMensual;
    
    public float getLimiteDiario (){
        String diario = "select valor_limite from limite_tarjeta where tipo_limite = 'DIARIO' and numero_tarjeta = '"+g.getnTarjeta()+"'";
        int limite = 0;
        
         PreparedStatement ps = null;
         ResultSet rs = null;
         Connection con = conector.conectar();
        
        try {
            ps = con.prepareStatement(diario);
            rs = ps.executeQuery();
            if (rs.next()) {
                limite = rs.getInt(1);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return limite;
    }
    
    public float getLimiteMensual (){
        String mensual = "select valor_limite from limite_tarjeta where tipo_limite = 'MENSUAL' and numero_tarjeta = '"+g.getnTarjeta()+"'";
        int limite = 0;
        
         PreparedStatement ps = null;
         ResultSet rs = null;
         Connection con = conector.conectar();
        
        try {
            ps = con.prepareStatement(mensual);
            rs = ps.executeQuery();
            if (rs.next()) {
                limite = rs.getInt(1);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return limite;
    }
    
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
