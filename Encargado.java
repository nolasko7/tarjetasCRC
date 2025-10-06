import java.util.ArrayList;
import java.util.List;

public class Encargado {
    private final String nombre;
    private final String apellido;
    private final int idEncargado;
    private List<Funcion> funcionesProgramadas;

    public Encargado(int idEncargado, String nombre, String apellido) {
        this.idEncargado = idEncargado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.funcionesProgramadas = new ArrayList<>();
    }
    
    // Funcionalidades 
    public void programarFuncion(Funcion funcion) {
        funcionesProgramadas.add(funcion);
        System.out.println("Función programada: " + funcion.getPelicula());
    }

    public void removerFuncion(Funcion funcion) {
        funcionesProgramadas.remove(funcion);
        System.out.println("Función removida: " + funcion.getPelicula());
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public int getIdEncargado() { return idEncargado; }
    public List<Funcion> getFuncionesProgramadas() { return funcionesProgramadas; }

}
