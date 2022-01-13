package codigo;

public class Cuenta {
    private String num;
    private String saldo;

    public Cuenta(String num) {
        this.num = num;
    }

    public String getNum() {
        num = "select numero where numero = '"+ num +"'";
        return num;
    }

    public String getSaldo() {
        saldo = "select saldo where numero = '"+ num +"'";
        return saldo;
    }
    
    public void actualizarSaldo(int incremento){
        //"update cuenta set saldo = saldo + '"+ incremento +"'";
    }
    
}
