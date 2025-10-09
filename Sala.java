public class Sala {
    private final String nombreSala;
    private final int cantidadButacas;
    private int butacasOcupadas;

    public Sala(String nombreSala, int cantidadButacas) {
        this.nombreSala = nombreSala;
        this.cantidadButacas = cantidadButacas;
        this.butacasOcupadas = 0;
    }

    // Getters
    public String getNombreSala() { return nombreSala; }
    public int getCantidadButacas() { return cantidadButacas; }
    public int getButacasOcupadas() { return butacasOcupadas; }

    // Métodos para gestionar butacas
    public boolean ocuparButaca() {
        if (butacasOcupadas < cantidadButacas) {
            butacasOcupadas++;
            return true;
        } else {
            System.out.println("No hay más butacas disponibles en " + nombreSala);
            return false;
        }
    }

    public void liberarButaca() {
        if (butacasOcupadas > 0) {
            butacasOcupadas--;
        }
    }

    public int getButacasDisponibles() {
        return cantidadButacas - butacasOcupadas;
    }
}
