import java.time.LocalDateTime;

public class Entrada {
    private LocalDateTime horaYFecha;
    private Funcion funcionAsignada;
    private double precio;

    public Entrada(LocalDateTime horaYFecha, Funcion funcionAsignada, Sala sala, double precio) {
        this.horaYFecha = horaYFecha;
        this.funcionAsignada = funcionAsignada;
        this.precio = precio;
    }
    // Getters
    public LocalDateTime getFechaHora(){ return this.horaYFecha; }
    public Funcion getFuncion() { return this.funcionAsignada; }
    public double getPrecio() { return this.precio; }

    // Modificadores
    public void modificarPrecio (double precio) {
        this.precio = precio;
    }

    public void modificarFuncion (Funcion funcion) {
        this.funcionAsignada = funcion;
    }

    public void modificarTiempo(LocalDateTime tiempo) {
        this.horaYFecha = tiempo;
    }

    public void comprarEntrada() {
        this.funcionAsignada.comprarEntrada();
    }

    
}
