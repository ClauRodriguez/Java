
package clau.tp5;

/**
 *
 * @author Rodriguez
 */
public class Vehiculo {
    private String patente, modelo;
    private Motor motor;
    private Conductor conductor;
    
    //Constructor
    public Vehiculo(String patente, String modelo, Motor motor, 
            Conductor conductor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
        this.conductor = conductor;
}

}
