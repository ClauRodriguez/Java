
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
    public Computadora(String marc, int numeroSerie,
            Propietario propietario, String modelo, String chipset) {
        this.marc = marc;
        this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre(modelo, chipset);;
        this.propietario = propietario;
}


}
