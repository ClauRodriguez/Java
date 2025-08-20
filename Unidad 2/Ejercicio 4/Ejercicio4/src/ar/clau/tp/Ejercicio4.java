
package ar.clau.tp;

import java.util.Scanner;

/**
 *
 * @author Rodriguez
 */
public class Ejercicio4 {
  
    public static double precioDescuento(double precio, String categoria) {
        double precioFinal;
        
        switch (categoria) {
            case "A":
                precioFinal = precio - (precio * 0.10);
                break;
            case "B":
                precioFinal = precio - (precio * 0.15);
                break;
            case "C":
                precioFinal = precio - (precio * 0.20);
                break;
            default:
                precioFinal = precio;
        }
        return precioFinal;
    }
    public static int descuentoAplicado(String categoria) {
        int descuento;
        
        switch (categoria) {
            case "A":
                descuento = 10;
                break;
            case "B":
                descuento = 15;
                break;
            case "C":
                descuento = 20;
                break;
            default:
                descuento = 0;
        }
        return descuento;
    }
    
    
    public static void main(String[] args) {
        double precio;
        String categoria;
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        precio = Double.parseDouble(input.nextLine());
        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        categoria = (input.nextLine());
        System.out.println("Descuento aplicado: " + descuentoAplicado(categoria) + "%");
        System.out.println("Precio final: " + precioDescuento(precio, categoria));        
    }
    
}
