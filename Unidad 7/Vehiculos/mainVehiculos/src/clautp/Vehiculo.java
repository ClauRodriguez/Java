package clautp;

public class Vehiculo {
    protected String marca;
    protected String modelo;
  
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
  
    public String mostrarInfo() {
        return "Vehiculo - Marca: " + marca + ", Modelo: " + modelo;
    }
    
    // Getters y setters
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}

