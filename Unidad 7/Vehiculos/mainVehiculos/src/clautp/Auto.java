package clautp;

public class Auto extends Vehiculo {
    private final int cantidadPuertas;
    
   
    public Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo); 
        this.cantidadPuertas = cantidadPuertas;
    }
    
    @Override
    public String mostrarInfo() {
        return super.mostrarInfo() + ", Cantidad de puertas: " + cantidadPuertas;
    }
    
    public int getCantidadPuertas() {
        return cantidadPuertas;
    }
    
}

