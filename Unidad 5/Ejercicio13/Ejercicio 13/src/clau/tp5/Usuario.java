
package clau.tp5;

/**
 *
 * @author Rodriguez
 */
public class Usuario {
    private String nombre, email;
    
    //Constructor
    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
}
    //Metodos set y get

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null ) {
            this.nombre = nombre;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email != null ) {
            this.email = email;
        }
    }
    

}
