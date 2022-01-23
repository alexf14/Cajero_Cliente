package codigo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Cuenta {

    Conector conector = new Conector();
    GuardarDatos g = new GuardarDatos();
   

    public Cuenta() {
    }

    public String getNum(String tarjeta) {
        String nCuenta = "";
        String num = "select cuenta.numero from cuenta inner join tarjeta on cuenta.numero = tarjeta.numero_cuenta "
                + "where tarjeta.numero = '" + tarjeta + "'";

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conector.conectar();

        try {
            ps = con.prepareStatement(num);
            rs = ps.executeQuery();
            if (rs.next()) {
                nCuenta = rs.getString(1);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return nCuenta;
    }

    public float getSaldo(String tarjeta) {
        float saldo = 0;

        String conocerSaldo = "select cuenta.saldo from cuenta inner join tarjeta on cuenta.numero = tarjeta.numero_cuenta "
                + "where tarjeta.numero = '" + tarjeta + "'";

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conector.conectar();

        try {
            ps = con.prepareStatement(conocerSaldo);
            rs = ps.executeQuery();
            if (rs.next()) {
                saldo = rs.getFloat(1);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return saldo;
    }

    public void actualizarSaldo(float incremento, boolean operacion) {
         Tarjeta tarjeta = new Tarjeta ();
         
        String tipo;
        boolean reintegro = false;
        String cuenta = "update cuenta set saldo = saldo + 0 where cuenta.numero = '" + this.getNum(g.getnTarjeta()) + "'";

        PreparedStatement ps = null;
        Connection con = conector.conectar();

        if (operacion) {
            cuenta = "update cuenta set saldo = saldo + '" + incremento + "' where cuenta.numero = '" + this.getNum(g.getnTarjeta()) + "'";
        } else {
            if(tarjeta.getLimiteDiario() > this.gastos(true) + incremento && tarjeta.getLimiteMensual() > this.gastos(false) + incremento){
                if (this.getSaldo(g.getnTarjeta()) - incremento > 0) {
                    reintegro = false;
                    cuenta = "update cuenta set saldo = saldo - '" + incremento + "' where cuenta.numero = '" + this.getNum(g.getnTarjeta()) + "'";
                }
            }else{
                reintegro = true;
            }
        }

        try {
            ps = con.prepareStatement(cuenta);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        if (operacion) {
            tipo = "INGRESO";
        } else if (!reintegro) {
            tipo = "REINTEGRO";
        } else {
            tipo = "REINTEGRO FALLIDO";
        }

        this.operacion(tipo, incremento);
    }
    
    private float gastos (boolean tipoGasto){
        String gasto;
        float intGastos = 0;
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = conector.conectar();
        
        if(tipoGasto){
            gasto = "SELECT SUM(operacion.cantidad) from operacion where operacion.numero_cuenta = '" + this.getNum(g.getnTarjeta()) + "' "
                + "and operacion.tipo like 'REINTEGRO' and year(time_stamp) = year(time_stamp) and month(time_stamp) = month(time_stamp) "
                + "and day(time_stamp) = day(time_stamp)";
        }else{
            gasto = "SELECT SUM(operacion.cantidad) from operacion where operacion.numero_cuenta = '" + this.getNum(g.getnTarjeta()) + "' "
                + "and operacion.tipo like 'REINTEGRO' and year(time_stamp) = year(time_stamp) and month(time_stamp) = month(time_stamp) ";
        }
        
        try {
            ps = con.prepareStatement(gasto);
            rs = ps.executeQuery();
            if (rs.next()) {
                intGastos = rs.getFloat(1);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return intGastos;
    }

    private void operacion(String tipo, float cantidad) {
        Operacion op = new Operacion(tipo, cantidad);
        op.guardar();
    }

}
