import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Cliente {
    private final UUID id;
    private String nombreApellido;
    private String correo;
    private String contrasena;
    private String tipoCliente;
    private List<Entrada> entradasCompradas;

    public Cliente(String nombreApellido, String correo, String contrasena, String tipoCliente) {
        this.id = UUID.randomUUID();
        this.nombreApellido = nombreApellido;
        this.correo = correo;
        this.contrasena = contrasena;
        this.tipoCliente = tipoCliente;
        this.entradasCompradas = new ArrayList<>();
    }

    // Getters
    public String getContrasena() { return contrasena; }
    public String getCorreo() { return correo; }
    public String getId() { return id.toString(); }
    public String getNombreApellido() { return nombreApellido; }
    public String getTipoCliente() { return tipoCliente; }

    // Setters
    public void setContrasena(String contrasena) { this.contrasena = contrasena; }
    public void setNombreApellido(String nombreApellido) { this.nombreApellido = nombreApellido; }
    public void setCorreo(String correo) { this.correo = correo; }
    public void setTipoCliente(String tipoCliente) { this.tipoCliente = tipoCliente; }

    // Metodos 
    public Entrada comprarEntrada(Funcion funcion) {
        try {
            Entrada nuevaEntrada = new Entrada(LocalDateTime.now(), funcion, this);
            this.entradasCompradas.add(nuevaEntrada);
            funcion.agregarEntradaVendida(nuevaEntrada);
            return nuevaEntrada;
        } catch (Exception e) {
            System.out.println("Error al comprar la entrada: " + e.getMessage());
            return null;
        }
    }
    
    // Método para ver las entradas
    public void mostrarMisEntradas() {
        System.out.println("--- Entradas de " + this.nombreApellido + " ---");
        if (entradasCompradas.isEmpty()) {
            System.out.println("No tienes entradas compradas.");
            return;
        }
        for (Entrada e : entradasCompradas) {
            System.out.println("Película: " + e.getFuncion().getPelicula().getTitulo());
            System.out.println("Fecha: " + e.getFuncion().getFechaHora());
            System.out.println("Precio: $" + e.getPrecio());
            System.out.println("--------------------");
        }
    }
}

