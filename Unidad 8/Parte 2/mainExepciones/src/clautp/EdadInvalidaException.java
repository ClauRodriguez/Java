package clautp;

/**
 * Excepcion personalizada para validar edades invalidas
 */
public class EdadInvalidaException extends Exception {
    
    public EdadInvalidaException(String mensaje) {
        super(mensaje);
    }
    
    public EdadInvalidaException(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}

