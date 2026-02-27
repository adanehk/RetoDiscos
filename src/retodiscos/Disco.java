package retodiscos;

import java.util.ArrayList;
import java.util.Scanner;

public class Disco {

    private static int contador = 0;
    private String titulo;
    private String autor;
    private String discografica;
    private double precio;
    private String genero;
    private int numCanciones;
    private String formato;
    private static int contadorDiscos = 0;
    private Cliente antiguoPropietario;
    private static boolean nuevo;

    public Disco(String titulo, String autor, String discografica, double precio, String genero, int numCanciones, String formato) {
        this.titulo = titulo;
        this.autor = autor;
        this.discografica = discografica;
        this.precio = precio;
        this.genero = genero;
        this.numCanciones = numCanciones;
        this.formato = formato;
        contador++;
    }
    public Disco(){}
    
    
    public void setAntiguoPropietario(Cliente antiguoPropietario) {
        this.antiguoPropietario = antiguoPropietario;
    }

    public Cliente getAntiguoPropietario() {
        return antiguoPropietario;
    }

    public static int getContador() {
        return contador;
    }

    public String getAutor() {
        return autor;
    }

    public String getDiscografica() {
        return discografica;
    }

    public String getFormato() {
        return formato;
    }

    public int getNumCanciones() {
        return numCanciones;
    }

    public String getGenero() {
        return genero;
    }

    public double getPrecio() {
        return precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public static int getContadorDiscos() {
        return contadorDiscos;
    }
    
    
    public void eliminarDisco (ArrayList<Disco> stock, Scanner input) {
    input.nextLine();


    System.out.println("Coloca el nombre del disco: ");
    String identificadorNombre = input.nextLine();
    System.out.println("Coloca el autor: ");
    String identificadorAutor = input.nextLine();


    for (int i = 0; i < stock.size(); i++) {
        if (identificadorNombre.equalsIgnoreCase(stock.get(i).getTitulo())
                && identificadorAutor.equalsIgnoreCase(stock.get(i).getAutor())) {
            stock.remove(i);
        }
    }

        
    }
    
    @Override
    public String toString() {
        return "titulo=" + titulo + ", autor=" + autor + ", discografica=" + discografica + ", precio=" + precio + ", genero=" + genero + ", numCanciones=" + numCanciones + ", formato=" + formato + ", antiguoPropietario=" + antiguoPropietario + '}';
    }

}
