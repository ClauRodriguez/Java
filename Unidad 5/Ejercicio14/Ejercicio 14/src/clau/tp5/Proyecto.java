
package clau.tp5;

/**
 *
 * @author Rodriguez
 */
public class Proyecto {
    private String nombre;
    private int duracionMin;
    
    //Constructor
    public Proyecto(String nombre, int duracionMin) {
        this.nombre = nombre;
        this.duracionMin = duracionMin;
}
    //Metodos set y get

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if( nombre != null){
            this.nombre = nombre;
        }  
    }

    public int getDuracionMin() {
        return duracionMin;
    }

    public void setDuracionMin(int duracionMin) {
        if( duracionMin > 0) {
            this.duracionMin = duracionMin;
        }
    }
    

}
