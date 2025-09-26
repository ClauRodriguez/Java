

package clau.tp5;

/**
 *
 * @author Rodriguez
 */
public class Bateria {
    private String modelo;
    private int capacidad;
    
    //Constructor
    public Bateria(String modelo, int capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
}
    //Metodos set y get

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo != null) {
            this.modelo = modelo;
        }  
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        if (capacidad > 0) {
            this.capacidad = capacidad;
        } 
    }
    

}
