package com.mycompany.cajero_cliente;

public class Main {
    
    public static void main(String [] arg){
        vista.Log_in f = new vista.Log_in();
        Conector c = new Conector();
                
        c.conectar();
        f.setVisible (true);
    }
}
