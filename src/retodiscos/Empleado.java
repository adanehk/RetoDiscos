package retodiscos;

public class Empleado extends Persona {

    private double sueldo;

    public Empleado(String nombre, String apellido, String dni, double sueldo) {
        super(nombre, apellido, dni);
        this.sueldo = sueldo;

    }

}
