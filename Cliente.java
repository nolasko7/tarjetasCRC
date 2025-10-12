import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private final int identificador;
    private String nombreApellido;
    private String correo;
    private String contrasena;
    private String tipoCliente;
    private List<Entrada> entradasCompradas;

    public Cliente(int identificador, String nombreApellido, String correo, String contrasena, String tipoCliente) {
        this.identificador = identificador;
        this.nombreApellido = nombreApellido;
        this.correo = correo;
        this.contrasena = contrasena;
        this.tipoCliente = tipoCliente;
        this.entradasCompradas = new ArrayList<>();
    }

    public void comprarEntrada(Funcion funcion) {
        if (funcion.getSala().getButacasDisponibles() > 0) {
            Entrada entrada = new Entrada(funcion.getFechaHora(), funcion, funcion.getSala(), funcion.getPrecioEntrada());
            entradasCompradas.add(entrada);
            funcion.venderEntrada();
            System.out.println(" " + nombreApellido + " compró una entrada para " + funcion.getPelicula().getTitulo());
        } else {
            System.out.println("️ No hay asientos disponibles para esa función.");
        }
    }

    // Getters
    public String getNombreApellido() { return nombreApellido; }
    public List<Entrada> getEntradasCompradas() { return entradasCompradas; }
}

