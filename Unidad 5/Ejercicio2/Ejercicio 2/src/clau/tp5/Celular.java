

package clau.tp5;

/**
 *
 * @author Rodriguez
 */
public class Celular {
    int imei;
    String marca; 
    String modelo;
    Bateria bateria;
    Usuario usuario;
    
    //Constructor
    public Celular(int imei, String marca, String modelo, Bateria bateria, Usuario usuario) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
        this.usuario = usuario;
}
    //Metodos set y get

    public int getImei() {
        return imei;
    }

    public void setImei(int imei) {
        this.imei = imei;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca != null) {
            this.marca = marca;
        }     
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo != null) {
            this.modelo = modelo;
        }        
    }
    

}
