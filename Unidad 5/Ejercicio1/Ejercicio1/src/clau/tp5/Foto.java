

package clau.tp5;

/**
 *
 * @author Rodriguez
 */
public class Foto {
    private int imagen;
    private String formato;
    
    //Constructor
    public Foto(int imagen, String formato) {
        this.imagen = imagen;
        this.formato = formato;
}
    //Metodos set y get

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        if (imagen >= 0 ) {
            this.imagen = imagen;
        }
        
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        if (formato != null) {
            this.formato = formato;
        }
        
    }
    

}
