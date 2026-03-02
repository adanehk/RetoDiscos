package retodiscos;

import java.util.ArrayList;
import java.util.Scanner;
import static retodiscos.main.stock;

/**
 * Clase que representa una tienda de discos.
 * 
 * Gestiona el stock de discos, las ventas, las compras y
 * el saldo económico de la tienda.
 */
public class Tienda {
    /** Nombre de la tienda */
    private String nombre;
    /** Dirección de la tienda */
    private String direccion;
    /** Saldo actual de la tienda */
    private double saldo = 0;
    /** Beneficio total de la tienda */
    private double beneficio;
    /** Scanner para la entrada de datos */
    static Scanner entrada = new Scanner(System.in);
    /** Lista de clientes a los que se les ha realizado una venta */
    private ArrayList<Cliente> ventas = new ArrayList<>();
    /** Empleado asociado a la tienda */
    Empleado empleado = new Empleado(nombre, direccion, nombre, saldo);
    /**
     * Añade un disco al stock de la tienda.
     *
     * @param disco disco a añadir
     */
    public void addDisco(Disco disco) {
        main.stock.add(disco);
    }
    /**
     * Elimina un disco del stock de la tienda.
     *
     * @param disco disco a eliminar
     */
    public void quitarDisco(Disco disco) {
        main.stock.remove(disco);
    }
    /**
     * Muestra un menú para consultar los discos del stock.
     * 
     * Permite listar todos los discos o buscar uno por título.
     *
     * @param stock lista de discos disponibles
     */
    public void consultarDiscos(ArrayList<Disco> stock) {

    int resList;

    do {

        System.out.println("\nActualmente hay " + Disco.getContador() + " discos\n");
        System.out.println("1. Ver todos los discos");
        System.out.println("2. Buscar un disco por nombre");
        System.out.println("3. Salir");
        System.out.print("Elige una opción: ");

        resList = entrada.nextInt();
        entrada.nextLine(); 

        switch (resList) {

            case 1:
                for (int i = 0; i < stock.size(); i++) {
                    System.out.println("\n" + stock.get(i));
                }

                System.out.println("\n¿Quieres buscar un disco por su nombre?");
                System.out.println("1. Sí");
                System.out.println("2. No");
                int opcion = entrada.nextInt();
                entrada.nextLine();

                if (opcion == 2) {
                    resList = 3; 
                }
                break;

            case 2:
                System.out.println("Introduce el título:");
                String res = entrada.nextLine();

                for (int i = 0; i < stock.size(); i++) {
                    if (res.equalsIgnoreCase(stock.get(i).getTitulo())) {
                        System.out.println("\n" + stock.get(i));
                    }
                }

                System.out.println("\nPulsa Enter para volver al menú...");
                entrada.nextLine();
                break;

            case 3:
                System.out.println("Saliendo...");
                break;

            default:
                System.out.println("Opción no válida.");
        }

    } while (resList != 3);
}
    /**
     * Devuelve el nombre de la tienda.
     *
     * @return nombre de la tienda
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Asigna el nombre de la tienda.
     *
     * @param nombre nombre de la tienda
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Devuelve la dirección de la tienda.
     *
     * @return dirección
     */
    public String getDireccion() {
        return direccion;
    }
    /**
     * Asigna la dirección de la tienda.
     *
     * @param direccion dirección de la tienda
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    /**
     * Devuelve el beneficio total de la tienda.
     *
     * @return beneficio
     */
    public double getBeneficio() {
        return beneficio;
    }
    /**
     * Asigna el beneficio de la tienda.
     *
     * @param beneficio beneficio total
     */
    public void setBeneficio(double beneficio) {
        this.beneficio = beneficio;
    }
    /**
     * Realiza una venta de un disco a un cliente.
     * 
     * Se solicita la información del cliente y del disco,
     * se actualiza el saldo y se elimina el disco del stock.
     *
     * @param stock lista de discos disponibles
     * @param input scanner para entrada de datos
     */
    public void venta (ArrayList<Disco> stock, Scanner input) {
    boolean isNew = false;

    System.out.println("Es un cliente Nuevo S/N: ");
    String clienteNuevo = input.next();
    if (clienteNuevo.equalsIgnoreCase("Si")) {
        isNew = true;
    }
        
    System.out.println("Ingrese el DNI: ");
    String dni = input.next();

    System.out.println("Ingrese el nombre del cliente: ");
    String nombre = input.next();

    System.out.println("Ingrese el apellido del cliente: ");
    String apellido = input.next();

    System.out.println("Ingrese el correo electronico: ");
    String correo = input.next();


    System.out.println("Coloca el nombre del disco: ");
    input.next();
    String identificadorNombre = input.next();
    System.out.println("Coloca el autor: ");
    String identificadorAutor = input.next();
        
    for (int i = 0; i < stock.size(); i++) {
        if (identificadorNombre.equalsIgnoreCase(stock.get(i).getTitulo())
            && identificadorAutor.equalsIgnoreCase(stock.get(i).getAutor())) {

        double precio = stock.get(i).getPrecio();
        saldo+= precio;
        stock.remove(i);
        }
    }
        
        ventas.add(new Cliente(correo, isNew, nombre, apellido, dni));
    }
    /**
     * Realiza la compra de un disco para reponer el stock.
     * 
     * Solicita los datos del disco y descuenta el precio del saldo.
     *
     * @param stock lista de discos
     * @param empleado lista de empleados
     * @param input scanner para entrada de datos
     */
    public void compra (ArrayList<Disco> stock, ArrayList<Empleado> empleado,Scanner input) {
         System.out.print("Introduce el título: ");
        String titulo = input.nextLine();

        System.out.print("Introduce el autor: ");
        String autor = input.nextLine();

        System.out.print("Introduce la discográfica: ");
        String discografica = input.nextLine();

        System.out.print("Introduce el precio: ");
        double precio = input.nextDouble();
        input.nextLine(); // limpiar buffer

        System.out.print("Introduce el género: ");
        String genero = input.nextLine();

        System.out.print("Introduce el número de canciones: ");
        int numCanciones = input.nextInt();
        input.nextLine(); // limpiar buffer

        System.out.print("Introduce el formato (CD, Vinilo, Digital...): ");
        String formato = input.nextLine();
        
        stock.add(new Disco(titulo, autor, discografica, precio, genero, numCanciones, formato,Empleado.buscarEmpleado("z35r32g", empleado)));
        
        saldo-= precio;
    }
    /**
     * Muestra la lista de ventas realizadas por la tienda.
     */    
    public void listaVentas () {
        System.out.println("Lista de ventas: ");
        for (int i = 0; i < ventas.size(); i++) {
            System.out.println(ventas.get(i).toString());
        }
    }
}
