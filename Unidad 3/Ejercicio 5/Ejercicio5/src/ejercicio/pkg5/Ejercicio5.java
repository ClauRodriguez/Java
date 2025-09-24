
package ejercicio.pkg5;

import java.util.Scanner;

/**
 *
 * @author Rodriguez
 */
public class Ejercicio5 {

   public static NaveEspacial crearNave() {
        Scanner input = new Scanner(System.in);
        NaveEspacial nave = new NaveEspacial();
        System.out.print("Ingrese el nombre de la nave: ");
        nave.nombre = input.nextLine();
        System.out.println("Combustible por defecto para la nave es de 50 unidades ");
        nave.combustible = 50;
        System.out.println("Nave " + nave.nombre + " creada con exito!");     
        return nave;
        
    }
    public static void main(String[] args) {
        NaveEspacial nave = crearNave();
        nave.avanzar(51); //se intenta avanzar mas que el combustible permitido
        nave.recargarCombustible(100); //recargamos combustible
        nave.avanzar(70); //se intenta avanzar aun mas despues de recargar
        nave.mostrarEstado(); //mostramos el estado actual de la nave.
    }
    
}
