package codigo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Cuenta {
    Conector conector = new Conector();
    GuardarDatos g = new GuardarDatos ();

    public Cuenta() {
    }
    
    public String getNum(String tarjeta) {
        String nCuenta ="";
        String num = "select cuenta.numero from cuenta inner join tarjeta on cuenta.numero = tarjeta.numero_cuenta "
                + "where tarjeta.numero = '"+ tarjeta +"'";
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conector.conectar();
        
        try{
            ps = con.prepareStatement(num);
            rs = ps.executeQuery();
            if(rs.next()){
                nCuenta = rs.getString(1);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return nCuenta;
    }

    
    public float getSaldo(String tarjeta) {      
        float saldo=0;
        
        String conocerSaldo = "select cuenta.saldo from tarjeta inner join cuenta on cuenta.numero = tarjeta.numero_cuenta "
                + "where tarjeta.numero = '"+ tarjeta +"'";
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conector.conectar();
        
        try{
            ps = con.prepareStatement(conocerSaldo);
            rs = ps.executeQuery();
            if(rs.next()){
                saldo=rs.getFloat(1);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return saldo;
    }
    
    public void actualizarSaldo(float incremento, boolean operacion){
        String cuenta;
        if(operacion){
            cuenta = "update cuenta set saldo = saldo + '"+ incremento +"' where cuenta.numero = '"+ this.getNum(g.getnTarjeta()) +"'";
        }else{
            cuenta = "update cuenta set saldo = saldo - '"+ incremento +"' where cuenta.numero = '"+ this.getNum(g.getnTarjeta()) +"'";
        }
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conector.conectar();
        
        try{
            ps = con.prepareStatement(cuenta);
            ps.executeUpdate();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
