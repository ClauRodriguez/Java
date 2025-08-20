
package ejercicio.pkg11;

import java.util.Scanner;

/**
 *
 * @author Rodriguez
 */
public class Ejercicio11 {
    public static double descuentoBase = 0.10;
    public static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado;
        descuentoAplicado = precio * descuentoBase;
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + (precio - descuentoAplicado));
        
        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double precioProducto;
        System.out.print("Ingrese el precio del producto: ");
        precioProducto = Double.parseDouble(input.nextLine());
        calcularDescuentoEspecial(precioProducto);
        
        
        
    }
    
}
