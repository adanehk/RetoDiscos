package retodiscos;

import java.util.ArrayList;

public class Tienda {
    private String nombre;
    private String direccion;
    private double beneficio;
    ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    ArrayList<Empleado> empleados = new ArrayList<Empleado>(); 
    ArrayList<Proveedor> proveedores = new ArrayList<Proveedor>();
    
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
