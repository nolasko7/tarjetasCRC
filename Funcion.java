import java.time.LocalDateTime;

public class Funcion {
    private Pelicula pelicula;
    private int cantidadCompras;
    private LocalDateTime fechaHora;
    private Sala sala;
    private double precioEntrada;

    public Funcion(Pelicula pelicula, LocalDateTime fechaHora, Sala sala, double precioEntrada) {
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
    public void modificarFuncion(Pelicula nuevaPelicula, LocalDateTime nuevaFechaHora, Sala nuevaSala, double nuevoPrecio) {
        this.pelicula = nuevaPelicula;
        this.fechaHora = nuevaFechaHora;
        this.sala = nuevaSala;
        this.precioEntrada = nuevoPrecio;
        System.out.println("Función modificada: " + pelicula + " en sala " + sala.getNombreSala());
    }

    // Getters
    public Pelicula getPelicula() { return pelicula; }
    public int getCantidadCompras() { return cantidadCompras; }
    public LocalDateTime getFechaHora() { return fechaHora; }
    public Sala getSala() { return sala; }
    public double getPrecioEntrada() { return precioEntrada; }

    // Setters

    public void cambiarPelicula (Pelicula nuevaPeli) {
        this.pelicula = nombrePeli;
    }

    public void cambiarHorario(LocalDateTime nuevoHorario) {
        this.fechaHora = nuevoHorario;
    }

    public void cambiarSala (Sala nuevaSala) {
        this.sala = nuevaSala;
    } 
    public void cambiarPrecio (double precioNuevo) {
        this.precioEntrada = precioNuevo;
    }
}