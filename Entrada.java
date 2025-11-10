import java.time.LocalDateTime;
import java.util.UUID;

public class Entrada {
    private final UUID id;
    private LocalDateTime horaYFecha;
    private Funcion funcionAsignada;
    private double precioPagado;
    private Cliente cliente;

    public Entrada(LocalDateTime horaYFecha, Funcion funcionAsignada, Cliente cliente) throws Exception {
        
        boolean pudoOcupar = funcionAsignada.ocuparButaca();

        if (pudoOcupar) {
            this.id = UUID.randomUUID();
            this.horaYFecha = horaYFecha;
            this.funcionAsignada = funcionAsignada;
            this.precioPagado = funcionAsignada.getPrecioBase(); // Tomamos el precio de la función
            this.cliente = cliente;
            
            System.out.println("Entrada comprada para " + this.funcionAsignada.getPelicula().getTitulo() +
                    ". Butacas ocupadas: " + this.funcionAsignada.getCantidadEntradasVendidas() + "/" + 
                    this.funcionAsignada.getSala().getCantidadButacas());
        } else {
            throw new Exception("No hay más butacas disponibles para " + funcionAsignada.getPelicula().getTitulo());
        }
    }
    // Getters
    public String getID() { return this.id.toString(); }
    public LocalDateTime getFechaHora(){ return this.horaYFecha; }
    public Funcion getFuncion() { return this.funcionAsignada; }
    public double getPrecio() { return this.precioPagado; }
    public Cliente getCliente() { return this.cliente; }

    // Modificadores
    public void modificarFuncion (Funcion funcion) {
        this.funcionAsignada = funcion;
    }

    public void modificarTiempo(LocalDateTime tiempo) {
        this.horaYFecha = tiempo;
    }

    public void modificarCliente(Cliente cliente) { 
        this.cliente = cliente; 
    }

}
