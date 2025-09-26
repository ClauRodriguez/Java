
package clau.tp5;

/**
 *
 * @author Rodriguez
 */
public class Computadora {
    private String marc;
    private int numeroSerie;
    private PlacaMadre placaMadre;
    private Propietario propietario;
    
    //Constructor
    public Computadora(String marc, int numeroSerie, PlacaMadre placaMadre,
            Propietario propietario) {
        this.marc = marc;
        this.numeroSerie = numeroSerie;
        this.placaMadre = placaMadre;
        this.propietario = propietario;
}


}
