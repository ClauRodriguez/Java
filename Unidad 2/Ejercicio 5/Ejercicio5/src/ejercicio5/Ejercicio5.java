
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Rodriguez
 */
public class Ejercicio5 {
    public static int sumaPares() {
        int suma = 0;
        int num;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Ingrese un numero (0 para terminar): ");
            num = Integer.parseInt(input.nextLine());
            if (num % 2 == 0 && num != 0) {
                suma += num;
            }
        } while (num != 0);
        return suma;
    }


    
    public static void main(String[] args) {
        System.out.println("La suma de los numeros pares es: " + sumaPares());
    }
    
}
