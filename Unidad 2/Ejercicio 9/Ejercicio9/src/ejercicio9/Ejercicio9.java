
package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author Rodriguez
 */
public class Ejercicio9 {
    public static double calcularCostoEnvio(int peso, String zona) {
        double costoEnvio;
        switch(zona){
            case "Nacional":
                costoEnvio = 5 * peso;
                break;
            case "Internacional":
                costoEnvio = 10 * peso;
                break;
            default:
                costoEnvio = -1;                    
        }
        return costoEnvio;       
    }
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;     
    }

   
    public static void main(String[] args) {
        double precioProducto, costoEnvio;
        int pesoPaquete;
        String zona;
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        precioProducto = Double.parseDouble(input.nextLine());
        System.out.print("Ingrese el peso del paquete en kg: ");
        pesoPaquete = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese la zona de envio (Nacional/Internacional): ");
        zona = input.nextLine();
        costoEnvio = calcularCostoEnvio(pesoPaquete, zona);
        if (costoEnvio > 0){
            System.out.println("//////////////////////////////");
            System.out.println("El costo de envio es: " + costoEnvio);
            System.out.println("El total a pagar es: " + calcularTotalCompra(precioProducto,costoEnvio));
        }else{
            System.out.println("//////////////////////////////");
            System.out.println("El costo de envio es: INVALIDO");
            System.out.println("El total a pagar es: INVALIDO");
        }
        
        
        
        
    }
    
}
