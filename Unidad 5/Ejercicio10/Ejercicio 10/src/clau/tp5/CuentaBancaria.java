
package clau.tp5;

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
    public CuentaBancaria(int cbu, double saldo, ClaveSeguridad claveSeguridad,
            Titular titular) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.claveSeguridad = claveSeguridad;
        this.titular = titular;
}
}
