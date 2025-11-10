import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.UUID;

public class Funcion {
    private final UUID id;
    private Pelicula pelicula;
    private LocalDateTime fechaHora;
    private Sala sala;
    private double precioBase;
    private final Encargado encargado; // Porque no deberia cambiar nunca
    private ArrayList<Entrada> entradasVendidas;
    private final int capacidadSala;
    private int butacasOcupadas;

    public Funcion(Pelicula pelicula, LocalDateTime fechaHora, Sala sala, Encargado encargado, double precioBase) {
        this.id = UUID.randomUUID();        
        this.pelicula = pelicula;
        this.fechaHora = fechaHora;
        this.sala = sala;
        this.encargado = encargado;
        this.precioBase = precioBase; 
        this.entradasVendidas = new ArrayList<>();
        this.capacidadSala = sala.getCantidadButacas();
        this.butacasOcupadas = 0;
    }

    // Modificar funcion
    public void modificarFuncion(Pelicula nuevaPelicula, LocalDateTime nuevaFechaHora, Sala nuevaSala, double nuevoPrecio) {
        this.pelicula = nuevaPelicula;
        this.fechaHora = nuevaFechaHora;
        this.sala = nuevaSala;
        this.precioBase = nuevoPrecio;
        System.out.println("Función modificada: " + pelicula.getTitulo() + " en sala " + sala.getNombreSala());
    }

    // Getters
    public String getId() { return this.id.toString(); }
    public Pelicula getPelicula() { return pelicula; }
    public LocalDateTime getFechaHora() { return fechaHora; }
    public Sala getSala() { return sala; }
    public double getPrecioBase() { return this.precioBase; }
    public Encargado getEncargado() { return this.encargado; }
    public String getNombreSala() { return this.sala.getNombreSala(); }
    public int getCantidadEntradasVendidas() { return this.entradasVendidas.size(); }
    public int getCantidadButacas() { return this.butacasOcupadas; }
    
    // Setters
    public void cambiarPelicula(Pelicula nuevaPeli) { this.pelicula = nuevaPeli; }
    public void cambiarHorario(LocalDateTime nuevoHorario) { this.fechaHora = nuevoHorario; }
    public void cambiarSala(Sala nuevaSala) { this.sala = nuevaSala; }
    public void cambiarPrecioBase(double nuevoPrecio) { this.precioBase = nuevoPrecio; }

    // Metodos

    public boolean ocuparButaca() {
        if (butacasOcupadas < capacidadSala) {
            butacasOcupadas++;
            return true;
        } else {
            return false; // No hay más lugar
        }
    }

    public void liberarButaca() {
        if (butacasOcupadas > 0) {
            butacasOcupadas--;
        }
    }

    public void agregarEntradaVendida(Entrada entrada) {
        this.entradasVendidas.add(entrada);
    }


}
