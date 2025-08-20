
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author Rodriguez
 */
public class Ejercicio8 {
    public static double calcularPrecioFinal(double precioBase, double porcImpuesto, double porcDescuento) {
        double precioFinal, precioImpuesto, precioDescuento;
        precioImpuesto = precioBase * porcImpuesto / 100;
        precioDescuento = precioBase * porcDescuento / 100;
        precioFinal = precioBase + precioImpuesto - precioDescuento;
        return precioFinal;
    }
  
    public static void main(String[] args) {
        double precioBase, porcInpuesto, porcDescuento;
        Scanner input = new Scanner (System.in);
        System.out.print("Ingrese el precio base del producto: ");
        precioBase = Double.parseDouble(input.nextLine());
        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        porcInpuesto = Double.parseDouble(input.nextLine());
        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        porcDescuento = Double.parseDouble(input.nextLine());
        System.out.println("El precio final del producto es: " + calcularPrecioFinal(precioBase, porcInpuesto, porcDescuento));
        
    }
    
}
