package clautp;

/**
 * Clase que representa un cliente en el sistema de E-commerce
 * Implementa Notificable para recibir notificaciones sobre cambios de estado
 */
public class Cliente implements Notificable {
    private String nombre;
    private String email;
    
    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }
    
    @Override
    public void notificar(String mensaje) {
        System.out.println("=== NOTIFICACION PARA " + nombre.toUpperCase() + " ===");
        System.out.println("Email: " + email);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("==========================================\n");
    }
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", email=" + email + '}';
    }
}

