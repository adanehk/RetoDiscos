package retodiscos;

public class Persona {

    private String nombre;
    private String apellido;
    private String dni;

    public Persona(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }
    public Persona(String nombre) {
        this.nombre = nombre;
        
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public String consultar() {

        return "Actualmente hay " + Disco.getContador();
    }
}
