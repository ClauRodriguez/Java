package clautp;

/**
 * Clase que representa un Libro
 * @author Rodriguez
 */
public class Libro {
    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private Autor autor;
    
    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }
    
    public void mostrarInfo() {
        System.out.println("\n=== Informacion del Libro ===");
        System.out.println("Titulo: " + titulo);
        System.out.println("ISBN: " + isbn);
        System.out.println("Anio de Publicacion: " + anioPublicacion);
        System.out.println("Autor: " + autor.getNombre() + " (" + autor.getNacionalidad() + ")");
        System.out.println("=============================\n");
    }
    
    @Override
    public String toString() {
        return "Libro{isbn='" + isbn + "', titulo='" + titulo + "', anioPublicacion=" + anioPublicacion + ", autor=" + autor.getNombre() + "}";
    }
    
    // Getters y Setters
    public String getIsbn() {
        return isbn;
    }
    
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    
    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
    
    public Autor getAutor() {
        return autor;
    }
    
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}

