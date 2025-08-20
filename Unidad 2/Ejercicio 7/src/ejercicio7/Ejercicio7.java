
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author Rodriguez
 */
public class Ejercicio7 { 
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nota;
       
        do{
            System.out.print("Ingrese una nota (0-10): ");
            nota = Integer.parseInt(input.nextLine());
            if (nota < 0 || nota > 10){
                System.out.print("Error: Nota invalida. Ingrese una nota entre 0 y 10.");
            }
        }while(nota < 0 || nota > 10);
        System.out.println("Nota guardada correctamente.");
       
    }
    
}
