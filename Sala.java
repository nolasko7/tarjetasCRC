public class Sala {
    private final String nombreSala;
    private int cantidadButacas;

    public Sala(String nombreSala, int cantidadButacas) {
        this.nombreSala = nombreSala;
        this.cantidadButacas = cantidadButacas;
    }

    // Getters
    public String getNombreSala() { return nombreSala; }
    public int getCantidadButacas() { return cantidadButacas; }

    // Setters

    public void cambiarCantBut(int cantBut) {
        this.cantidadButacas = cantBut;
    }
}
