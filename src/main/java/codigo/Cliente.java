package codigo;

public class Cliente {   
    private String nif;
    private String nombre;
    private String apellido;
    private String email;
    private String cuentas;
    private String tarjetas;

    public String getNif(String nif) {
        return nif;
    }

    public String getNombre(String nombre) {
        return nombre;
    }

    public String getApellido(String apellido) {
        return apellido;
    }

    public String getEmail(String email) {
        return email;
    }

    public String getCuentas() {
        return cuentas;
    }

    public String getTarjetas() {
        return tarjetas;
    } 
}