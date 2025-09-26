
package clau.tp;

import java.util.Date;
import java.util.HashSet;

/**
 *
 * @author Rodriguez
 */
public class FirmaDigital {
    private HashSet codigoHash;
    private Date fecha;
    private Usuario usuario;
    
    //Constructor
    public FirmaDigital(HashSet codigoHash, Date fecha, Usuario usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
}

}
