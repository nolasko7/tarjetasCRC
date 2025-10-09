import java.time.LocalDateTime;

public class Entrada {
    private LocalDateTime horaYFecha;
    private Funcion funcionAsignada;
    private Sala sala;
    private double precio;

    public Entrada(LocalDateTime horaYFecha, Funcion funcionAsignada, Sala sala, double precio) {
        this.horaYFecha = horaYFecha;
        this.funcionAsignada = funcionAsignada;
        this.sala = sala;
        this.precio = precio;

        // Cada vez que se crea una entrada, se ocupa una butaca
        boolean ocupada = sala.ocuparButaca();
        if (ocupada) {
            System.out.println("Se vendió una entrada para " + funcionAsignada.getPelicula().getTitulo()
                    + " en " + sala.getNombreSala() +
                    ". Butacas ocupadas: " + sala.getButacasOcupadas() + "/" + sala.getCantidadButacas());
        }
    }

    // Métodos informativos
    public void permitirAccesoSala() {
        System.out.println("✅ Acceso permitido a la sala: " + sala.getNombreSala());
    }

    public void informarCliente() {
        System.out.println("🎬 Su función " + funcionAsignada.getPelicula().getTitulo() +
                " es el " + horaYFecha + " en la sala " + sala.getNombreSala() +
                ". Precio: $" + precio);
    }
}
