
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Rodriguez
 */
public class Ejercicio2 {
    public static int mayorEntreTres(int[] nums) {
        int mayor;
        if (nums[0] >= nums[1] && nums[0] >= nums[2]){
            mayor = nums[0];
        }else if(nums[1] >= nums[0] && nums[1] >= nums[2]){
            mayor = nums[1];
        }else{
            mayor = nums[2];
        }
        return mayor;
    }
    public static int[] ingresarNNumeros(int n) {
        Scanner input = new Scanner(System.in);
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ")- Ingrese un numero: ");
            num[i] = Integer.parseInt(input.nextLine());
        }
        return num;
    }

   
    public static void main(String[] args) { 
        int mayor;
        int[] numeros;
        
        numeros = ingresarNNumeros(3);
        mayor = mayorEntreTres(numeros);
        System.out.println("El mayor es: " + mayor);
    }
    
}
