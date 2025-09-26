
package clau.tp5;

import java.util.Date;

/**
 *
 * @author Rodriguez
 */
public class CuentaBancaria {
    private int cbu;
    private double saldo;
    private ClaveSeguridad claveSeguridad;
    private Titular titular;

    //Constructor
    public CuentaBancaria(int cbu, double saldo,int codigo, 
            Date ultimaModificacion, Titular titular) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.claveSeguridad = new ClaveSeguridad(codigo, ultimaModificacion);
        this.titular = titular;
}
}
