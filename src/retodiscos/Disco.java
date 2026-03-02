package retodiscos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase que representa un disco musical dentro de la tienda.
 * 
 * Contiene información sobre el disco (título, autor, género, precio, etc.)
 * y métodos para su gestión dentro del stock.
 */

public class Disco {

    /** Contador general de discos creados */
    private static int contador = 0;
    /** Título del disco */
    private String titulo;
    /** Autor o artista del disco */
    private String autor;
    /** Discográfica del disco */
    private String discografica;
    /** Precio del disco */
    private double precio;
    /** Género musical */
    private String genero;
    /** Número de canciones del disco */
    private int numCanciones;
    /** Formato del disco (CD, Vinilo, Digital, etc.) */
    private String formato;
    /** Contador adicional de discos */
    private static int contadorDiscos = 0;
    /** Cliente que fue propietario anteriormente del disco */
    private Cliente antiguoPropietario;
    /** Indica si el disco es nuevo o de segunda mano */
    private static boolean nuevo;
    /** Empleado que ha gestionado el disco */
    private Empleado empleado;
    
    
    /**
     * Constructor con todos los datos básicos del disco.
     *
     * @param titulo título del disco
     * @param autor autor o artista
     * @param discografica discográfica del disco
     * @param precio precio del disco
     * @param genero género musical
     * @param numCanciones número de canciones
     * @param formato formato del disco
     */
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
    
    /**
     * Constructor que asocia el disco a un empleado.
     *
     * @param titulo título del disco
     * @param autor autor o artista
     * @param discografica discográfica
     * @param precio precio del disco
     * @param genero género musical
     * @param numCanciones número de canciones
     * @param formato formato del disco
     * @param empleado empleado responsable
     */
    public Disco(String titulo, String autor, String discografica, double precio, String genero, int numCanciones, String formato, Empleado empleado) {
        this.titulo = titulo;
        this.autor = autor;
        this.discografica = discografica;
        this.precio = precio;
        this.genero = genero;
        this.numCanciones = numCanciones;
        this.formato = formato;
        this.empleado = empleado;
    }
    
     /**
     * Constructor vacío.
     */
    public Disco(){}
    
    /**
     * Asigna el antiguo propietario del disco.
     *
     * @param antiguoPropietario cliente anterior
     */
    public void setAntiguoPropietario(Cliente antiguoPropietario) {
        this.antiguoPropietario = antiguoPropietario;
    }
    /**
     * Devuelve el antiguo propietario del disco.
     *
     * @return cliente antiguo propietario
     */
    public Cliente getAntiguoPropietario() {
        return antiguoPropietario;
    }
    /**
     * Devuelve el número total de discos creados.
     *
     * @return contador de discos
     */
    public static int getContador() {
        return contador;
    }
    /**
     * Devuelve el autor del disco.
     *
     * @return autor
     */
    public String getAutor() {
        return autor;
    }
    /**
     * Devuelve la discográfica del disco.
     *
     * @return discográfica
     */
    public String getDiscografica() {
        return discografica;
    }
    /**
     * Devuelve el formato del disco.
     *
     * @return formato
     */
    public String getFormato() {
        return formato;
    }
    /**
     * Devuelve el número de canciones.
     *
     * @return número de canciones
     */
    public int getNumCanciones() {
        return numCanciones;
    }
    /**
     * Devuelve el género musical del disco.
     *
     * @return género
     */
    public String getGenero() {
        return genero;
    }
    /**
     * Devuelve el precio del disco.
     *
     * @return precio
     */
    public double getPrecio() {
        return precio;
    }
    /**
     * Devuelve el título del disco.
     *
     * @return título
     */
    public String getTitulo() {
        return titulo;
    }
    /**
     * Devuelve el contador adicional de discos.
     *
     * @return contador de discos
     */
    public static int getContadorDiscos() {
        return contadorDiscos;
    }
    /**
     * Elimina un disco del stock buscando por título y autor.
     *
     * @param stock lista de discos disponibles
     * @param input scanner para la entrada de datos
     */    
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
    /**
     * Devuelve una representación en texto del disco.
     *
     * @return información detallada del disco
     */
    @Override
    public String toString() {
        return  "\n---------------------------------- ALBUM ----------------------------------\n" +
            "Titulo:        " + titulo + "\n" +
            "Autor:         " + autor + "\n" +
            "Discografica:  " + discografica + "\n" +
            "Precio:        " + precio + " €\n" +
            "Genero:        " + genero + "\n" +
            "Canciones:     " + numCanciones + "\n" +
            "Formato:       " + formato + "\n" +
            "---------------------------------------------------------------------------\n";
    }

}
