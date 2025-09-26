
package clau.tp5;

/**
 *
 * @author Rodriguez
 */
public class Usuario {
    private String nombre;
    private int dni;
    private Celular celular;
    
    //Constructor
    public Usuario(String nombre, int dni, Celular celular) {
        this.nombre = nombre;
        this.dni = dni;
        this.celular = celular;
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
        if (dni > 0) {
            this.dni = dni;
        } 
    }
    

}
