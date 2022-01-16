package codigo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import vista.Log_in;
import vista.Pantalla_Principal;

public class Cuenta {
    Conector conector = new Conector();
    vista.Log_in login = new vista.Log_in();
    
    private String actualizar;

    public Cuenta() {
    }
    
    public String getNum() {//Falta acabarlo
        final String num = "";
        System.out.println(num + " a");
        return num;
    }

    
    public float getSaldo() {   
        String tarjeta=this.getNum();    
        float saldo=0;
        String conocerSaldo = "select saldo from cuenta inner join tarjeta on cuenta.numero = tarjeta.numero_cuenta"
                + " where tarjeta.numero = '"+ tarjeta +"' and tarjeta.numero_cuenta = cuenta.numero";

        
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conector.conectar();
        
        try{
            ps = con.prepareStatement(conocerSaldo);
            rs = ps.executeQuery();
            
            if(rs.next()){
                System.out.println("a");
                saldo=rs.getFloat(1);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return saldo;
    }
    
    public void actualizarSaldo(int incremento){//hay que hacer inner join con tarjeta
        //actualizar = "update cuenta set saldo = saldo + '"+ incremento +"' where numero = '"+ login.getTxtNumeroTarjeta() +"'";
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conector.conectar();
        
        try{
            ps = con.prepareStatement(actualizar);
            rs = ps.executeQuery();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
