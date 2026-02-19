package retodiscos;

public class Cliente extends Persona {

    private String correo;
    
    public Cliente(String nombre, String apellido, String dni, String correo) {
        super(nombre, apellido, dni);
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }

    public void comprar(Disco discoX) {
        discoX.setPropietario(this);
    }

    public void vender(Disco discoX) {
        discoX.setPropietario(tienda);
    }
}
