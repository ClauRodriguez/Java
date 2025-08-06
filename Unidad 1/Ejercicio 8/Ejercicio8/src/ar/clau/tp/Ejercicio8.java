
package ar.clau.tp;

import java.util.Scanner;

/**
 *
 * @author Rodriguez
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.println("DIVISION DE NUMEROS ENTEROS EN JAVA");
        System.out.print("Ingrese un numero: ");
        num1 = Integer.parseInt(input.nextLine());
        System.out.println("//////////////");
        System.out.print("Ingrese un numero: ");
        num2 = Integer.parseInt(input.nextLine());
        System.out.println("-----------------");
        System.out.println("Resultados con INT");
        System.out.println("Division 1: " + ( num1 / num2));
        System.out.println("-----------------");
        System.out.println("Resultados con DOUBLE");
         System.out.println("Division 2: " + ((double) num1 / num2));
        
       
        
    }
    
}
