package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Rodriguez
 */
public class Ejercicio3 {
    public static String clasificarEdad(int edad) {
        String texto;
        if(edad < 12){
            texto = "Niño";
        }else if (edad <= 17){
            texto = "Adolecente";
        }else if (edad <= 59){
            texto = "Adulto";
        }else{
            texto = "Adulto mayor";
        }
        return texto;            
    }
    public static void main(String[] args) {
        int edad;
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        edad = Integer.parseInt(input.nextLine());
        System.out.println("Eres un " + clasificarEdad(edad));
        
    }
    
}
