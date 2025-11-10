import java.util.UUID;

public class Sala {
    private final UUID id;    
    private final String nombreSala;
    private final int cantidadButacas;

    public Sala(String nombreSala, int cantidadButacas) {
        this.id = UUID.randomUUID();
        this.nombreSala = nombreSala;
        this.cantidadButacas = cantidadButacas;
    }

    // Getters
    public String getID() { return this.id.toString(); }
    public String getNombreSala() { return nombreSala; }
    public int getCantidadButacas() { return cantidadButacas; }
}
