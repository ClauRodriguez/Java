
package clau.tp5;

/**
 *
 * @author Rodriguez
 */
public class Impuesto {
    private double monto;
    private Contribuyente contribuyente;
    
    //Constructor
    public Impuesto(double monto, Contribuyente contribuyente) {
        this.monto = monto;
        this.contribuyente = contribuyente;
}
    //Metodos set y get

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        if (monto > 0){
            this.monto = monto;
        }   
    }
    

}
