

package ejercicio.pkg5;

/**
 *
 * @author Rodriguez
 */
public class NaveEspacial {
    String nombre;
    int combustible;
    
    public void despegar(){
        
    }                      
            
    public void avanzar(int distancia){
        if(this.combustible < distancia){
            System.out.println("ERROR, Imposible avanzar con tan poco combustible ");
        }else{
            this.combustible -= distancia;
            System.out.println("La nave pudo avanzar " + distancia + " unidades");
        }
        
    }
    public void recargarCombustible(int cantidad){
        this.combustible += cantidad;
        
    }
    public void mostrarEstado(){
        System.out.println("-------------------------------");
        System.out.println("Nombre de la nave: " + this.nombre);
        System.out.println("Cantidad de combustible disponible hasta el momento "
                + this.combustible + " unidades");
        
    }

}
