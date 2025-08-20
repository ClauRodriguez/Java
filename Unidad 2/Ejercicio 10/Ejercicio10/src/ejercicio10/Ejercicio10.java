
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author Rodriguez
 */
public class Ejercicio10 {
    public static int actualizarStock(int stockActual, int cantidadVendida,int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }
   
    public static void main(String[] args) {
        int stockActual, cantVendida, cantRecibida;
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el stock actual del producto: ");
        stockActual = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese la cantidad vendida: ");
        cantVendida = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese la cantidad recibida: ");
        cantRecibida = Integer.parseInt(input.nextLine());
        System.out.println("/////////////////////");
        System.out.println("El nuevo stock del producto es: " +actualizarStock(stockActual, cantVendida, cantRecibida));
    }
    
}
