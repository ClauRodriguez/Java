

package clau.tp5;

import java.util.Date;

/**
 *
 * @author Rodriguez
 */
public class Pasaporte {
    private int numero;
    private Date fechaEmision;
    private Titular titular;
    private Foto foto;
    
    //Constructor
    public Pasaporte(int numero, Date fechaEmision, Titular titular, Foto foto) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.titular = titular;
        this.foto = foto;
}
    //Metodos set y get
    public int getNumero() {
        return numero;
}

    public void setNumero(int numero) {
        this.numero = numero;
}

    public Date getFechaEmision() {
        return fechaEmision;
}

    public void setFechaEmision(Date fechaEmision) {
        if (fechaEmision != null) {
            this.fechaEmision = fechaEmision;
        }        
    
}

}
