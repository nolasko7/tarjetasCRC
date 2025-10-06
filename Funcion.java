import java.time.LocalDateTime;

public class Funcion {
    private String pelicula;
    private int cantidadCompras;
    private LocalDateTime fechaHora;
    private Sala sala;
    private double precioEntrada;

    public Funcion(String pelicula, LocalDateTime fechaHora, Sala sala, double precioEntrada) {
        this.pelicula = pelicula;
        this.fechaHora = fechaHora;
        this.sala = sala;
        this.precioEntrada = precioEntrada;
        this.cantidadCompras = 0;
    }

    // Vender entrada
    public void venderEntrada() {
        if(cantidadCompras < sala.getCantidadButacas()) {
            cantidadCompras++;
            System.out.println("Entrada vendida para " + pelicula);
        } else {
            System.out.println("No hay más butacas disponibles");
        }
    }

    // Getters
    public String getPelicula() { return pelicula; }
    public int getCantidadCompras() { return cantidadCompras; }
    public LocalDateTime getFechaHora() { return fechaHora; }
    public Sala getSala() { return sala; }
    public double getPrecioEntrada() { return precioEntrada; }

    // Setters

    public void cambiarPelicula (String nombrePeli) {
        this.pelicula = nombrePeli;
    }

    public void cambiarHorario(LocalDateTime nuevoHorario) {
        this.fechaHora = nuevoHorario;
    }

    public void cambiarSala (Sala nuevaSala) {
        this.sala = nuevaSala;
    } 
    public void cambiarPrecio (int precioNuevo) {
        this.precioEntrada = precioNuevo;
    }
}