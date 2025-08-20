
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author Rodriguez
 */
public class Ejercicio6 {
    public static int[] cantPosNegaCeros() {
        int[] cantidad = new int[10];
        int num;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++){
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            num = Integer.parseInt(input.nextLine());
            if (num > 0){
                cantidad[1]++ ;
            }else if (num < 0){
                cantidad[cantidad.length - 1]++;
            }else{
                cantidad[0]++ ;
            }
        }
        
        return cantidad;
    }

    public static void main(String[] args) {
        int[] nums = new int[3];
        nums = cantPosNegaCeros();
        System.out.println("Resultados");
        System.out.println("Positivos: " + nums[1]);
        System.out.println("Negativo: " + nums[nums.length - 1]);
        System.out.println("Ceros: " + nums[0]);
        
    }
    
}
