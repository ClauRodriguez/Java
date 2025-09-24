
package clau.tp;

import java.util.Scanner;

/**
 *
 * @author Rodriguez
 */
public class Ejercicio4 {

    public static Gallina definirGallina() {
        Scanner input = new Scanner(System.in);
        Gallina gallina = new Gallina();
        System.out.print("Ingrese el ID de la gallina: ");
        gallina.idGallina = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese la edad: ");
        gallina.edad = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese la cantidad de huevos colocados: ");
        gallina.huevosPuestos = Integer.parseInt(input.nextLine());
        return gallina;
        
    }
    
    public static void pasoDeLosAnios(Gallina animal1, Gallina animal2){
        int anios;
        Scanner input = new Scanner(System.in);
        System.out.println("SIMULACION DE TIEMPO......  ");
        System.out.println("...... ");
        System.out.print("Cuantos anios pasaron? : ");
        anios = Integer.parseInt(input.nextLine());
        for (int i = 0; i < anios; i++) {
            animal1.envejecer();
            animal2.envejecer();
        } 
    }
    
    public static void ponerHuevos(Gallina animal){
        int cant;
        Scanner input = new Scanner(System.in);
        System.out.println("SIMULACION DE PUESTA DE HUEVOS......  ");
        System.out.println("...... ");
        System.out.print("Cuantos huevos puso la gallina con ID " + animal.idGallina + ": ");
        cant = Integer.parseInt(input.nextLine());
        for (int i = 0; i < cant; i++) {
            animal.ponerHuevo();
        } 
    }
    public static void main(String[] args) {
        Gallina gallina1, gallina2;
        gallina1 = definirGallina(); //creamos gallina 1
        gallina2 = definirGallina(); //creamos gallina 2
        
        //simulaciones
        ponerHuevos(gallina1); //colocamos huevos
        ponerHuevos(gallina2); // colocamos huevos
        
        pasoDeLosAnios(gallina1, gallina2); //simulamos el paso de los años021
        
        ponerHuevos(gallina1); //colocamos huevos nuevamente
        ponerHuevos(gallina2); // colocamos huevos nuevamente
        
        
        //muestra de datos
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
        
        
    }
    
}
