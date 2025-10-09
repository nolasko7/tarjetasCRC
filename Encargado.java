import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Encargado {
    private final int idEncargado;
    private final String nombre;
    private final String apellido;
    private String usuario;
    private String contrasenia;
    private List<Funcion> funcionesProgramadas;

    public Encargado(int idEncargado, String nombre, String apellido, String usuario, String contrasenia) {
        this.idEncargado = idEncargado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.funcionesProgramadas = new ArrayList<>();
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }
    
    // Funcionalidades 
    public void programarFuncion(Funcion funcion) {
        funcionesProgramadas.add(funcion);
        System.out.println("Función programada: " + funcion.getPelicula());
    }

    public void removerFuncion(Funcion funcion) {
        funcionesProgramadas.remove(funcion);
        System.out.println("Función removida: " + funcion.getPelicula().getTitulo());
    }

    public void modificarFuncion(Funcion funcion, Pelicula nuevaPelicula, LocalDateTime nuevaFechaHora, Sala nuevaSala, double nuevoPrecio) {
        if(funcionesProgramadas.contains(funcion)) {
            funcion.modificarFuncion(nuevaPelicula, nuevaFechaHora, nuevaSala, nuevoPrecio);
            System.out.println("Encargado " + nombre + " modificó la función.");
        } else {
            System.out.println("La función no está a cargo de este encargado.");
        }
    }

    public void cambiarUsuario(String usuarioNuevo) {
        this.usuario = usuarioNuevo;
    }

    public void cambiarContra(String nuevaContra) {
        this.contrasenia = nuevaContra;
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public int getIdEncargado() { return idEncargado; }
    public List<Funcion> getFuncionesProgramadas() { return funcionesProgramadas; }
    public String getUsuario() { return usuario; }

}
