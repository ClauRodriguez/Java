package clautp;

public class EmpleadoTemporal extends Empleado {
    private double horasTrabajadas;
    private double tarifaPorHora;
    
    public EmpleadoTemporal(String nombre, String id, double horasTrabajadas, double tarifaPorHora) {
        super(nombre, id);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }
    
    @Override
    public double calcularSueldo() {
        return horasTrabajadas * tarifaPorHora;
    }
    
    // Getters y setters
    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }
    
    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    
    public double getTarifaPorHora() {
        return tarifaPorHora;
    }
    
    public void setTarifaPorHora(double tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }
}

