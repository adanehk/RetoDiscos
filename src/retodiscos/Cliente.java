package retodiscos;

public class Cliente extends Persona {

    private Tienda tienda;
    private String correo;
    private boolean nuevo;
    

    public Cliente(String nombre, String apellido, String dni, String correo) {
        super(nombre, apellido, dni);
        this.correo = correo;
    }

    

    public String getCorreo() {
        return correo;
    }

    public void comprar(Disco discoX) {
        if (nuevo == true) {
            nuevo = false;
        }
        //discoX.setPropietario(this);
    }

    public void vender(Disco discoX) {
        discoX.setPropietario(null);
        discoX.setAntiguoPropietario(this);
    }
}
