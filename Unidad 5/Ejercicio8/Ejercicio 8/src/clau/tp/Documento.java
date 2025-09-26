
package clau.tp;

import java.util.Date;
import java.util.HashSet;

/**
 *
 * @author Rodriguez
 */
public class Documento {
    private String titulo, contenido;
    private FirmaDigital firmaDigital;
    
    //Constructor
    public Documento(String titulo, String contenido, 
            HashSet codigoHash, Date fecha, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firmaDigital = new FirmaDigital(codigoHash, fecha, usuario);
}
    

}
