

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
}
