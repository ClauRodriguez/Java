package ar.clau.tp;

import java.util.Scanner;

/**
 *
 * @author Rodriguez
 */
public class Ejercicio1 {
    
    public static boolean esBisiesto(int año) {
        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);            
    }


    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int anio;
        System.out.print("Ingrese un año: ");
        anio = Integer.parseInt(input.nextLine());
        System.out.println(esBisiesto(anio) ? "El año " + anio + " es bisiesto"
                :"El año " + anio + " no es bisiesto");
    }   
}
