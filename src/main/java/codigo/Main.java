package codigo;

import vista.Log_in;

public class Main {
    
    public static void main(String [] arg){
        Log_in l = new Log_in();
        Conector c = new Conector();
                
        c.conectar();
        l.setVisible (true);
    }
}