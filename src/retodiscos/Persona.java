package retodiscos;

/**
 * Clase que representa a una persona dentro del sistema.
 * 
 * Sirve como clase base para otros tipos de personas
 * como clientes o empleados.
 */
public class Persona {
    /** Nombre de la persona */
    private String nombre;
    /** Apellido de la persona */
    private String apellido;
    /** DNI de la persona */
    private String dni;
    
    /**
     * Constructor completo de la persona.
     *
     * @param nombre nombre de la persona
     * @param apellido apellido de la persona
     * @param dni DNI de la persona
     */
    public Persona(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }
    /**
     * Constructor que inicializa solo el nombre.
     *
     * @param nombre nombre de la persona
     */
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Devuelve el nombre de la persona.
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Devuelve el apellido de la persona.
     *
     * @return apellido
     */
    public String getApellido() {
        return apellido;
    }
    /**
     * Devuelve el DNI de la persona.
     *
     * @return DNI
     */
    public String getDni() {
        return dni;
    }
        /**
     * Devuelve información relacionada con el estado actual del sistema.
     * 
     * En este caso, muestra el número total de discos creados.
     *
     * @return información sobre los discos
     */
    public String consultar() {
        return "Actualmente hay " + Disco.getContador();
    }
}
