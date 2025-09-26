
package clau.tp5;

/**
 *
 * @author Rodriguez
 */
public class Cancion {
    private String titulo;
    private Artista artista;
    
    //Constructor
    public Cancion(String titulo, Artista artista) {
        this.titulo = titulo;
        this.artista = artista;
}
    //Metodos set y get

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo != null){
            this.titulo = titulo;
        }
        
    }
    

}
