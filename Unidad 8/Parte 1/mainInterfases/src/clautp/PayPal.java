package clautp;

/**
 * Clase que representa un metodo de pago con PayPal
 * Implementa Pago (sin descuento)
 */
public class PayPal implements Pago {
    private String email;
    private String contrasena;
    
    public PayPal(String email, String contrasena) {
        this.email = email;
        this.contrasena = contrasena;
    }
    
    @Override
    public boolean procesarPago(double monto) {
        System.out.println("Procesando pago con PayPal: " + email);
        System.out.println("Monto a pagar: $" + monto);
        System.out.println("Pago procesado exitosamente.");
        return true;
    }
    
    // Getters y Setters
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getContrasena() {
        return contrasena;
    }
    
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}

