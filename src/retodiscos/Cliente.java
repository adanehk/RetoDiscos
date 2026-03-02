package retodiscos;
    /**
     * Clase que representa a un cliente, heredando de Persona.
     * Permite gestionar correo, estado de nuevo cliente y operaciones de compra y venta de discos.
     */
public class Cliente extends Persona {
    /** Correo electrónico del cliente */
    private String correo;
    /** Indica si el cliente es nuevo o no */
    private boolean nuevo;
    /**
     * Constructor de la clase Cliente.
     *
     * @param correo correo electrónico del cliente
     * @param nuevo indica si el cliente es nuevo (true) o recurrente (false)
     * @param nombre nombre del cliente
     * @param apellido apellido del cliente
     * @param dni DNI del cliente
     */
    public Cliente(String correo, boolean nuevo, String nombre, String apellido, String dni) {
        super(nombre, apellido, dni);
        this.correo = correo;
        this.nuevo = nuevo;
    }
    /**
     * Devuelve el correo electrónico del cliente.
     *
     * @return correo del cliente
     */
    public String getCorreo() {
        return correo;
    }
    /**
     * Permite que el cliente compre un disco.
     * Si el cliente es nuevo, cambia su estado a no nuevo.
     *
     * @param discoX disco que el cliente desea comprar
     */
    public void comprar(Disco discoX) {
        if (nuevo == true) {
            nuevo = false;
        }
    }
    /**
     * Permite que el cliente venda un disco.
     * El disco queda sin propietario actual y se registra al cliente como antiguo propietario.
     *
     * @param discoX disco que el cliente desea vender
     */
    public void vender(Disco discoX) {
        discoX.setAntiguoPropietario(this);
    }
}
