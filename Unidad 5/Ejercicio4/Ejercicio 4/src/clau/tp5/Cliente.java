
package clau.tp5;

/**
 *
 * @author Rodriguez
 */
public class Cliente {
    private String nombre;
    private int dni;
    private TarjetaDeCrédito tarjetaDeCredito;
    
    //Constructor
    public Cliente(String nombre, int dni, TarjetaDeCrédito tarjetaDeCrédito) {
        this.nombre = nombre;
        this.dni = dni;
        this.tarjetaDeCredito = tarjetaDeCrédito;
}

}
