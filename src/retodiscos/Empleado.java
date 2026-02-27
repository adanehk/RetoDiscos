package retodiscos;
import java.util.ArrayList;
import java.util.Scanner;

public class Empleado extends Persona {

    private double sueldo;
    private ArrayList<Empleado> empleados= new ArrayList<>();
    
    public Empleado(String nombre, String apellido, String dni, double sueldo) {
        super(nombre, apellido, dni);
        this.sueldo = sueldo;

    }

    public Empleado(String nombre, String apellido, String dni) {
        super(nombre, apellido, dni);
    }

    public Empleado() {
        
    }
    
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
    
    public void quitarEmpleado(Scanner input) {
        System.out.println("Ingresar DNI, para eliminar a un empleado: \nDNI: ");
        String dni = input.next();
        
        for (int i = 0; i < empleados.size(); i++) {
            if (dni.equalsIgnoreCase(empleados.get(i).getDni())) {
                empleados.remove(i);
            }
        }
    }
    
    public void asignarSueldo (int sueldo, Scanner input) {
        System.out.println("Ingrese el DNI: ");
        String dni = input.next();
        
        for (int i = 0; i < empleados.size(); i++) {
            if (dni == empleados.get(i).getDni()) {
                this.sueldo = sueldo;
            }
        }
    }
    
    static public Empleado buscarEmpleado (String dni, ArrayList<Empleado> empleados) {
        for (int i = 0; i < empleados.size(); i++) {
            if (dni == empleados.get(i).getDni()) {
                return empleados.get(i);
            }
        }
        
        return null;
    }
    
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
    
    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
