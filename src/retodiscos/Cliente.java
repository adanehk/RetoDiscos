package retodiscos;

public class Cliente extends Persona {
    
    private String correo;
    private boolean nuevo;

    public Cliente(String correo, boolean nuevo, String nombre, String apellido, String dni) {
        super(nombre, apellido, dni);
        this.correo = correo;
        this.nuevo = nuevo;
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
        // discoX.setPropietario(null);
        discoX.setAntiguoPropietario(this);
    }
}
