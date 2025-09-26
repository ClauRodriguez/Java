
package clau.tp5;

/**
 *
 * @author Rodriguez
 */
public class Contribuyente {
    private String nombre, cuil;
    
    //Constructor
    public Contribuyente(String nombre, String cuil) {
        this.nombre = nombre;
        this.cuil = cuil;
}
    //Metodos set y get

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null){
            this.nombre = nombre;
        }    
    }

    public String getCuil() {
        return cuil;
    }

    public void setCuil(String cuil) {
        if (cuil != null){
            this.cuil = cuil;
        }  
    }
    

}
