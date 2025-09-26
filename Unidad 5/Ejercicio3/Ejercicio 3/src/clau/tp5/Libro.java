
package clau.tp5;

/**
 *
 * @author Rodriguez
 */
public class Libro {
     private String titulo, isbn;
     private Autor autor;
     private Editorial editorial;
     
     //Constructor
    public Libro(String titulo, String isbn, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
}
     

}
