import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Encargado {
    private final int idEncargado;
    private final String nombre;
    private final String apellido;
    private String usuario;
    private String contrasenia;

    private List<Pelicula> peliculasCargadas;
    private List<Funcion> funcionesProgramadas;
    private List<Sala> salasAsignadas;

    public Encargado(int idEncargado, String nombre, String apellido, String usuario, String contrasenia) {
        this.idEncargado = idEncargado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.peliculasCargadas = new ArrayList<>();
        this.funcionesProgramadas = new ArrayList<>();
        this.salasAsignadas = new ArrayList<>();
    }

    // === Gestión de Películas ===
    public void cargarPelicula(Pelicula pelicula) {
        peliculasCargadas.add(pelicula);
        System.out.println(" Película cargada: " + pelicula.getTitulo());
    }

    public void eliminarPelicula(Pelicula pelicula) {
        peliculasCargadas.remove(pelicula);
        System.out.println(" Película eliminada: " + pelicula.getTitulo());
    }

    // === Gestión de Funciones ===
    public void programarFuncion(Pelicula pelicula, LocalDateTime fechaHora, Sala sala, Entrada entrada) {
        Funcion funcion = new Funcion(pelicula, fechaHora, sala, entrada);
        funcionesProgramadas.add(funcion);
        System.out.println(" Función programada: " + pelicula.getTitulo() + " en " + sala.getNombreSala());
    }

    public void modificarFuncion(Funcion funcion, Pelicula nuevaPelicula, LocalDateTime nuevaFechaHora, Sala nuevaSala, Entrada nuevaEntrada) {
        if (funcionesProgramadas.contains(funcion)) {
            funcion.modificarFuncion(nuevaPelicula, nuevaFechaHora, nuevaSala, nuevaEntrada);
            System.out.println(" Función modificada por " + nombre);
        } else {
            System.out.println("️ La función no pertenece a este encargado.");
        }
    }

    public void asignarSala(Sala sala) {
        salasAsignadas.add(sala);
        System.out.println(" Sala asignada al encargado: " + sala.getNombreSala());
    }

    public void mostrarCatalogoFunciones() {
        if (funcionesProgramadas.isEmpty()) {
            System.out.println("No hay funciones programadas actualmente.");
            return;
        }

        System.out.println("===  Catálogo de Funciones Programadas ===");
        for (Funcion funcion : funcionesProgramadas) {
            Pelicula peli = funcion.getPelicula();
            Sala sala = funcion.getSala();

            System.out.println("-------------------------------------------");
            System.out.println("Título: " + peli.getTitulo());
            System.out.println("Género: " + peli.getGenero());
            System.out.println("Duración: " + peli.getDuracion() + " minutos");
            System.out.println("Clasificación: " + peli.getClasificacion());
            System.out.println("Sala: " + sala.getNombreSala());
            System.out.println("Fecha y hora: " + funcion.getFechaHora());
            System.out.println("Precio de entrada: $" + funcion.getPrecioEntrada());
        }
    }

    // === Getters ===
    public int getIdEncargado() { return idEncargado; }
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getUsuario() { return usuario; }
    public List<Funcion> getFuncionesProgramadas() { return funcionesProgramadas; }
    public List<Pelicula> getPeliculasCargadas() { return peliculasCargadas; }
    public List<Sala> getSalasAsignadas() { return salasAsignadas; }
}

