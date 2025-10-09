
public class Pelicula {

    private String titulo;
    private String genero;
    private int duracion; // en minutos
    private String clasificacion;
    private String sinopsis;
    
    public Pelicula(String titulo, String genero, int duracion, String clasificacion, String sinopsis) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
        this.clasificacion = clasificacion;
        this.sinopsis = sinopsis;
    }
    
    public String getTitulo() { return titulo; }
    public String getGenero() { return genero; }
    public int getDuracion() { return duracion; }
    public String getClasificacion() { return clasificacion; }
    public String getSinopsis() { return sinopsis; }
    
    // Setters

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
    
}
