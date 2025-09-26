
package clau.tp5;

/**
 *
 * @author Rodriguez
 */
public class Artista {
    private String nombre, genero;
    
    //Constructor
    public Artista(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
}
    //Metodos set y get

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null){
            this.nombre = nombre;
        }
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        if (genero != null){
            this.genero = genero;
        }
    }
    

}
