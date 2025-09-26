
package clau.tp5;

/**
 *
 * @author Rodriguez
 */
public class Titular {
    private String nombre;
    private int dni;
    private CuentaBancaria cuentaBancaria;
    
    //Constructor
    public Titular(String nombre, int dni, CuentaBancaria cuentaBancaria) {
        this.nombre = nombre;
        this.dni = dni;
        this.cuentaBancaria = cuentaBancaria;
}

}
