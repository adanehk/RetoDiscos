package retodiscos;

import java.util.ArrayList;

public class Tienda {
    private String nombre;
    private String direccion;
    private double saldo = 0;
    private double beneficio;
   
    
    public void addDisco (Disco disco) {
        main.stock.add(disco);
    }
    
    public void quitarDisco(Disco disco) {
        main.stock.remove(disco);
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

}
