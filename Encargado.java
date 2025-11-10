import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Encargado {
    private final UUID id;
    private String nombre;
    private String apellido;
    private String usuario;
    private String contrasenia;
    private List<Funcion> funcionesProgramadas;

    public Encargado(String nombre, String apellido, String usuario, String contrasenia) {
        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.funcionesProgramadas = new ArrayList<>();
    }

    // === Gestión de Funciones ===
    public void programarFuncion(Pelicula pelicula, LocalDateTime fechaHora, Sala sala, double precioBase) {
        
        Funcion nuevaFuncion = new Funcion(pelicula, fechaHora, sala, this, precioBase);
        this.funcionesProgramadas.add(nuevaFuncion);
        System.out.println(" Función programada: " + pelicula.getTitulo() + " en " + sala.getNombreSala());
    }

    public void modificarFuncion(Funcion funcion, Pelicula nuevaPelicula, LocalDateTime nuevaFechaHora, Sala nuevaSala, double nuevoPrecioBase) {
        // Verificamos que esta función pertenezca al encargado
        if (this.funcionesProgramadas.contains(funcion)) {
            // Llamamos al 'modificarFuncion' CORREGIDO
            funcion.modificarFuncion(nuevaPelicula, nuevaFechaHora, nuevaSala, nuevoPrecioBase);
            System.out.println(" Función modificada por " + nombre);
        } else {
            System.out.println("️ La función no pertenece a este encargado.");
        }
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
            System.out.println("Sala: " + sala.getNombreSala());
            System.out.println("Fecha y hora: " + funcion.getFechaHora());
            System.out.println("Precio de entrada: $" + funcion.getPrecioBase()); 
            System.out.println("Butacas: " + funcion.getCantidadEntradasVendidas() + "/" + funcion.getCantidadButacas());
        }
    }

    // Getters
    public String getId() { return this.id.toString(); }
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public String getUsuario() { return usuario; }
    public String getContrasenia() { return contrasenia; }
    public List<Funcion> getFuncionesProgramadas() { return funcionesProgramadas; }

    // Setters
    public void setNombreApellido(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void setUsuario (String usuario) {
        this.usuario = usuario;
    }

    public void setContrasena(String contrasenia) {
        this.contrasenia = contrasenia;
    }
}

