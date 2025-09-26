

package clau.tp5;

/**
 *
 * @author Rodriguez
 */
public class Titular {
    private String nombre;
    private int dni;
    private Pasaporte pasaporte;
    
    //Constructor
    public Titular(String nombre, int dni, Pasaporte pasaporte) {
        this.nombre = nombre;
        this.dni = dni;
        this.pasaporte = pasaporte;
}
    //Metodos set y get

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null) {
            this.nombre = nombre;
        }  
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        if (dni >= 0 ) {
            this.dni = dni;
        }
        
    }
    
    
}
