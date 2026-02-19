
package retodiscos;


public class Proveedor extends Persona {
    private String tipo;
    
    public Proveedor(String nombre, String apellido, String dni,String tipo){
        super(nombre,apellido,dni);
        this.tipo=tipo;
    }
    public Proveedor(String nombre,String tipo){
        super(nombre);
        this.tipo=tipo;
    }
}
