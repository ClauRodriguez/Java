

package clau.tp;

/**
 *
 * @author Rodriguez
 */
public class Mascota {
     String nombre, especie;
     int edad;
    
    public void mostrarInfo() {
        System.out.println("=== INFO MASCOTA ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Epecie: " + especie);
        System.out.println("Edad: " + edad);
        System.out.println("");
        
    }
    
    public void cumplirAnios() {
        edad++;
    }

}
