public class Cliente {
    private int identificador;
    private String nombreApellido;
    private String correo;
    private String contrasena;
    private String tipoCliente;

    public Cliente(int identificador, String nombreApellido, String correo, String contrasena, String tipoCliente) {
        this.identificador = identificador;
        this.nombreApellido = nombreApellido;
        this.correo = correo;
        this.contrasena = contrasena;
        this.tipoCliente = tipoCliente;
    }

    // Getters
    public int getIdentificador() { return identificador; }
    public String getNombreApellido() { return nombreApellido; }
    public String getCorreo() { return correo; }
    public String getContrasena() { return contrasena; }
    public String getTipoCliente() { return tipoCliente; }
    
    // Metodos
    public void accederCartelera() {
        System.out.println("🎥 " + nombreApellido + " accede a la cartelera de funciones.");
    }

    public void seleccionarPelicula(Pelicula pelicula) {
        System.out.println("🍿 " + nombreApellido + " seleccionó la película: " + pelicula.getTitulo());
    }

    public void realizarCompraEntrada(Funcion funcion, int cantidad) {
        System.out.println("🧾 " + nombreApellido + " compró " + cantidad + " entrada(s) para " + funcion.getPelicula().getTitulo());
    }

    public void pagar(String medioPago) {
        System.out.println("💳 " + nombreApellido + " realizó el pago con: " + medioPago);
    }
}
