
package clau.tp5;

import java.util.Date;

/**
 *
 * @author Rodriguez
 */
public class Reserva {
    private Date fecha, hora;
    private Cliente cliente;
    private Mesa mesa;
    
    //Constructor
    public Reserva(Date fecha, Date hora, Cliente cliente, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.mesa = mesa;
}

}
