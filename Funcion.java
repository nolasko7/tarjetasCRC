import java.time.LocalDateTime;

public class Funcion {
    private Pelicula pelicula;
    private int cantidadCompras;
    private LocalDateTime fechaHora;
    private Sala sala;
    private Entrada entradaInfo;

    public Funcion(Pelicula pelicula, LocalDateTime fechaHora, Sala sala, Entrada entradaInfo) {
        this.pelicula = pelicula;
        this.fechaHora = fechaHora;
        this.sala = sala;
        this.entradaInfo = entradaInfo;
        this.cantidadCompras = 0;
    }

    // Vender entrada
    public void venderEntrada() {
        if (cantidadCompras < sala.getCantidadButacas()) {
            cantidadCompras++;
            System.out.println("Entrada vendida para " + pelicula.getTitulo());
        } else {
            System.out.println("No hay más butacas disponibles");
        }
    }
    // Modificar funcion
    public void modificarFuncion(Pelicula nuevaPelicula, LocalDateTime nuevaFechaHora, Sala nuevaSala, double nuevoPrecio) {
        this.pelicula = nuevaPelicula;
        this.fechaHora = nuevaFechaHora;
        this.sala = nuevaSala;
        this.entradaInfo = entradaInfo;
        System.out.println("Función modificada: " + pelicula.getTitulo() + " en sala " + sala.getNombreSala());
    }

    // Getters
    public Pelicula getPelicula() { return pelicula; }
    public int getCantidadCompras() { return cantidadCompras; }
    public LocalDateTime getFechaHora() { return fechaHora; }
    public Sala getSala() { return sala; }
    public Entrada getPrecioEntrada() { return precioInfo; }

    // Setters
    public void cambiarPelicula(Pelicula nuevaPeli) {
        this.pelicula = nuevaPeli;
    }

    public void cambiarHorario(LocalDateTime nuevoHorario) {
        this.fechaHora = nuevoHorario;
    }

    public void cambiarSala(Sala nuevaSala) {
        this.sala = nuevaSala;
    }

}
