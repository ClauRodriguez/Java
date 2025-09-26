
package clau.tp5;

import java.util.Date;

/**
 *
 * @author Rodriguez
 */
public class ClaveSeguridad {
    private int codigo;
    private Date ultimaModificacion;
    
    //Constructor
    public ClaveSeguridad(int codigo, Date ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
}

}
