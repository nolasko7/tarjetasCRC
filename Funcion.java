import java.time.LocalDateTime;

public class Funcion {
    private Pelicula pelicula;
    private LocalDateTime fechaHora;
    private Sala sala;
    private Entrada entradaInfo;

    public Funcion(Pelicula pelicula, LocalDateTime fechaHora, Sala sala, Entrada entradaInfo) {
        this.pelicula = pelicula;
        this.fechaHora = fechaHora;
        this.sala = sala;
        this.entradaInfo = entradaInfo;
    }

    public void comprarEntrada() {
        // Cada vez que se crea una entrada, se ocupa una butaca
        boolean ocupada = sala.ocuparButaca();
        if (ocupada) {
            System.out.println("Se vendió una entrada para " + getPelicula().getTitulo()
                    + " en " + sala.getNombreSala() +
                    ". Butacas ocupadas: " + sala.getButacasOcupadas() + "/" + sala.getCantidadButacas());
        }
    }

    // Modificar funcion
    public void modificarFuncion(Pelicula nuevaPelicula, LocalDateTime nuevaFechaHora, Sala nuevaSala, Entrada entradaInfo) {
        this.pelicula = nuevaPelicula;
        this.fechaHora = nuevaFechaHora;
        this.sala = nuevaSala;
        this.entradaInfo = entradaInfo;
        System.out.println("Función modificada: " + pelicula.getTitulo() + " en sala " + sala.getNombreSala());
    }

    // Getters
    public Pelicula getPelicula() { return pelicula; }
    public LocalDateTime getFechaHora() { return fechaHora; }
    public Sala getSala() { return sala; }
    public double getPrecioEntrada() { return this.entradaInfo.getPrecio(); }
    public Entrada getEntrada() { return this.entradaInfo; }

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

    // Métodos informativos
    public void permitirAccesoSala() {
        System.out.println("Acceso permitido a la sala: " + sala.getNombreSala());
    }

    public void informarCliente() {
        System.out.println("Su función " + getPelicula().getTitulo() +
                " es el " + fechaHora.toString() + " en la sala " + sala.getNombreSala() +
                ". Precio: $" + entradaInfo.getPrecio());
    }

}
