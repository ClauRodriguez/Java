package clautp;

/**
 * Clase que representa un metodo de pago con tarjeta de credito
 * Implementa PagoConDescuento para permitir descuentos
 */
public class TarjetaCredito implements PagoConDescuento {
    private String numeroTarjeta;
    private String titular;
    private double porcentajeDescuento;
    
    public TarjetaCredito(String numeroTarjeta, String titular, double porcentajeDescuento) {
        this.numeroTarjeta = numeroTarjeta;
        this.titular = titular;
        this.porcentajeDescuento = porcentajeDescuento;
    }
    
    @Override
    public boolean procesarPago(double monto) {
        double montoConDescuento = aplicarDescuento(monto);
        System.out.println("Procesando pago con Tarjeta de Credito " + numeroTarjeta.substring(numeroTarjeta.length() - 4));
        System.out.println("Monto original: $" + monto);
        System.out.println("Descuento aplicado: " + porcentajeDescuento + "%");
        System.out.println("Monto final: $" + montoConDescuento);
        System.out.println("Pago procesado exitosamente.");
        return true;
    }
    
    @Override
    public double aplicarDescuento(double monto) {
        return monto * (1 - porcentajeDescuento / 100);
    }
    
    // Getters y Setters
    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }
    
    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }
    
    public String getTitular() {
        return titular;
    }
    
    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }
    
    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }
}

