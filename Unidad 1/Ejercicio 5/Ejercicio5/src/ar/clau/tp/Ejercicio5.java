
package ar.clau.tp;

import java.util.Scanner;

/**
 *
 * @author Rodriguez
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num1, num2, suma, resta, multiplicacion;
        double divicion;
        System.out.println("OPERACIONES MATEMATICAS + - * / ");
        System.out.print("Ingrese un numero: ");
        num1 = Integer.parseInt(input.nextLine());
        System.out.println("---------------------------------");
        System.out.print("Ingrese un numero: ");
        num2 = Integer.parseInt(input.nextLine());
        System.out.println("---------------------------------");
        
        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        divicion = (double) num1 / num2;
        
        System.out.println("RESULTADO DE LAS OPERACIONES + - * / ");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        System.out.println("Divicion: " + divicion);
        
        
    }
    
}
