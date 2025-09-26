
package clau.tp5;

import java.util.Date;

/**
 *
 * @author Rodriguez
 */
public class TarjetaDeCrédito {
    private int numero;
    private Date fechaVencimiento;
    private Cliente cliente;
    private Banco banco;
    
    //Constructor
    public TarjetaDeCrédito(int numero, Date fechaVencimiento, Cliente cliente,
    Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.cliente = cliente;
        this.banco = banco;
}


}
