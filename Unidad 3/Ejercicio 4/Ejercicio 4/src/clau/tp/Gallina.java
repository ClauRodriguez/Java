

package clau.tp;

/**
 *
 * @author Rodriguez
 */
public class Gallina {
     int idGallina, edad, huevosPuestos;
     
     
     public void ponerHuevo(){
         this.huevosPuestos ++;
     }
     public void envejecer(){
         this.edad ++;
     }
     public void mostrarEstado(){
         System.out.println("Gallina ID: " + this.idGallina);
         System.out.println("Edad: " + this.edad);
         System.out.println("Huevos puestos: " + this.huevosPuestos);
         
     }


}
