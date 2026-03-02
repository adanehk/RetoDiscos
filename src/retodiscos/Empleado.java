package retodiscos;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase que representa a un empleado, heredando de Persona.
 * Permite gestionar empleados, su sueldo y operaciones básicas como agregar o eliminar empleados.
 */
public class Empleado extends Persona {
    /** Sueldo del empleado */
    private double sueldo;
    /** Lista de empleados gestionados por esta instancia */
    private ArrayList<Empleado> empleados= new ArrayList<>();
    /**
     * Constructor de la clase Empleado con todos los datos.
     *
     * @param nombre nombre del empleado
     * @param apellido apellido del empleado
     * @param dni DNI del empleado
     * @param sueldo sueldo del empleado
     */
    public Empleado(String nombre, String apellido, String dni, double sueldo) {
        super(nombre, apellido, dni);
        this.sueldo = sueldo;

    }
    /**
     * Constructor de la clase Empleado sin sueldo.
     *
     * @param nombre nombre del empleado
     * @param apellido apellido del empleado
     * @param dni DNI del empleado
     */
    public Empleado(String nombre, String apellido, String dni) {
        super(nombre, apellido, dni);
    }
    /**
     * Crea un nuevo empleado solicitando sus datos por consola
     * y lo agrega a la lista de empleados.
     *
     * @param input Scanner para la entrada de datos
     */
    public void crearEmpleado (Scanner input) {
        System.out.println("Nombre: ");
        String nombre = input.next();
        
        System.out.println("Apellido: ");
        String apellido = input.next();
        
        System.out.println("DNI del empleado: ");
        String dniEmpleado = input.next();
        
        System.out.println("Sueldo: ");
        int sueldo = input.nextInt();
        
        empleados.add(new Empleado(nombre, apellido, dniEmpleado, sueldo));
    }
    /**
     * Elimina un empleado de la lista solicitando el DNI por consola.
     *
     * @param input Scanner para la entrada de datos
     */
    public void quitarEmpleado(Scanner input) {
        System.out.println("Ingresar DNI, para eliminar a un empleado: \nDNI: ");
        String dni = input.next();
        
        for (int i = 0; i < empleados.size(); i++) {
            if (dni.equalsIgnoreCase(empleados.get(i).getDni())) {
                empleados.remove(i);
            }
        }
    }
    /**
     * Asigna un sueldo a un empleado existente mediante su DNI.
     *
     * @param sueldo nuevo sueldo a asignar
     * @param input Scanner para la entrada de datos
     */
    public void asignarSueldo (int sueldo, Scanner input) {
        System.out.println("Ingrese el DNI: ");
        String dni = input.next();
        
        for (int i = 0; i < empleados.size(); i++) {
            if (dni == empleados.get(i).getDni()) {
                this.sueldo = sueldo;
            }
        }
    }
    /**
     * Busca un empleado en la lista según su DNI.
     *
     * @param dni DNI del empleado a buscar
     * @param empleados lista de empleados donde buscar
     * @return el empleado si se encuentra, o null si no existe
     */
    static public Empleado buscarEmpleado (String dni, ArrayList<Empleado> empleados) {
        for (int i = 0; i < empleados.size(); i++) {
            if (dni == empleados.get(i).getDni()) {
                return empleados.get(i);
            }
        }
        
        return null;
    }
    /**
     * Muestra un menú de gestión de empleados para crear, eliminar o asignar sueldo.
     *
     * @param input Scanner para la entrada de datos
     * @param sueldo sueldo a asignar cuando se elige la opción correspondiente
     */
    public void gestionarEmpleado (Scanner input, int sueldo) {
        int res;
        
        do {    
            System.out.println("Bienvenido al menu gestionar\n 1. Ingresar nuevo cliente\n2. Quitar empleado\n3. Asignar sueldo");
            res = input.nextInt();
            
            switch (res) {
                case 1:
                    crearEmpleado(input);
                    break;
                case 2:
                    quitarEmpleado(input);
                break;
                case 3:
                    asignarSueldo(sueldo, input);
                break;
                default:
                    throw new AssertionError();
            }
        } while (true);
    }
    /**
     * Devuelve el sueldo del empleado.
     *
     * @return sueldo del empleado
     */
    public double getSueldo() {
        return sueldo;
    }
    /**
     * Asigna un nuevo sueldo al empleado.
     *
     * @param sueldo nuevo sueldo
     */
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
