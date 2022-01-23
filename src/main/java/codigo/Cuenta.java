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
        String tipo;
        String cuenta = "update cuenta set saldo = saldo + 0 where cuenta.numero = '" + this.getNum(g.getnTarjeta()) + "'";

        String diario = "SELECT SUM(operacion.cantidad) from operacion where operacion.numero_cuenta = '" + this.getNum(g.getnTarjeta()) + "' "
                + "and operacion.tipo = 'REINTEGRO' and year(time_stamp) = year(time_stamp) and month(time_stamp) = month(time_stamp) "
                + "and day(time_stamp) = day(time_stamp)";

        String mensual = "SELECT SUM(operacion.cantidad) from operacion where operacion.numero_cuenta = '" + this.getNum(g.getnTarjeta()) + "' "
                + "and operacion.tipo = 'REINTEGRO' and year(time_stamp) = year(time_stamp) and month(time_stamp) = month(time_stamp) ";

        PreparedStatement ps = null;
        PreparedStatement dr = null;
        PreparedStatement ms = null;
        Connection con = conector.conectar();

        boolean reintegro = false;

        if (operacion) {
            cuenta = "update cuenta set saldo = saldo + '" + incremento + "' where cuenta.numero = '" + this.getNum(g.getnTarjeta()) + "'";
        } else {
            try {
                dr = con.prepareStatement(diario);
                ms = con.prepareStatement(mensual);
                dr.executeQuery();
                ms.executeQuery();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            if (dr.next() && ms.next()) {
                saldo = dr.getFloat(1);
                if () {
                    if (this.getSaldo(g.getnTarjeta()) - incremento > 0) {
                        cuenta = "update cuenta set saldo = saldo - '" + incremento + "' where cuenta.numero = '" + this.getNum(g.getnTarjeta()) + "'";
                    } else {
                        reintegro = true;
                    }
                }
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

    private void operacion(String tipo, float cantidad) {
        Operacion op = new Operacion(tipo, cantidad);
        op.guardar();
    }

}
