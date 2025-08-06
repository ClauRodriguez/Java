
package ar.clau.tp;

import java.util.Scanner;

/**
 *
 * @author Rodriguez
 */
public class Ejercicio4 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       String nombre;
       int edad;
       System.out.print("Ingrese su nombre: ");
       nombre = input.nextLine();
       System.out.print("Ingrese su edad: ");
       edad = Integer.parseInt(input.nextLine());
       System.out.println("////////////////////////////////");
       System.out.println("El nombre ingresado es: " + nombre);
       System.out.println("La edad ingresada es: " + edad);
       
    }
    
}
