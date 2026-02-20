package retodiscos;

import java.util.ArrayList;

public class Disco {

    private static int contador = 0;
    private Disco propietario;
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
    
    public void setPropietario(Disco propietario) {
        this.propietario = propietario;
    }
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

}
