package retodiscos;

import java.util.ArrayList;
import java.util.Scanner;
import static retodiscos.main.stock;

public class Tienda {

    private String nombre;
    private String direccion;
    private double saldo = 0;
    private double beneficio;
    static Scanner entrada = new Scanner(System.in);

    public void addDisco(Disco disco) {
        main.stock.add(disco);
    }

    public void quitarDisco(Disco disco) {
        main.stock.remove(disco);
    }

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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(double beneficio) {
        this.beneficio = beneficio;
    }

    public static void main(String[] args) {
        main.rellenarStock();

        Tienda tienda = new Tienda();
        Disco disco = new Disco();
        tienda.consultarDiscos(stock);
    }
}
