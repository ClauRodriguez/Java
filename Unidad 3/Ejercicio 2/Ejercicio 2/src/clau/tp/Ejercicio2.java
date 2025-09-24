
package clau.tp;

import java.util.Scanner;

/**
 *
 * @author Rodriguez
 */
public class Ejercicio2 {
    public static Mascota definirMascota() {
        Scanner input = new Scanner(System.in);
        Mascota mascota = new Mascota();
        System.out.print("Ingrese el nombre de la mascota: ");
        mascota.nombre = input.nextLine();
        System.out.print("Ingrese el tipo de especie: ");
        mascota.especie = input.nextLine();
        System.out.print("Ingrese la edad: ");
        mascota.edad = Integer.parseInt(input.nextLine());
        return mascota;
        
    }
    
    public static Mascota pasoDeLosAnios(Mascota mascota){
        int anios;
        Scanner input = new Scanner(System.in);
        System.out.println("SIMULACION DE TIEMPO......  ");
        System.out.println("...... ");
        System.out.print("Cuantos anios pasaron? : ");
        anios = Integer.parseInt(input.nextLine());
        for (int i = 0; i < anios; i++) {
            mascota.cumplirAnios();
        } 
        return mascota;
    }
   
    public static void main(String[] args) {
        Mascota chicho;
        chicho = definirMascota(); //defino mi mascota
        chicho.mostrarInfo(); //mostramos la info actual
        pasoDeLosAnios(chicho); //simulamos el paso de los años
        chicho.mostrarInfo(); //mostramos la info con el paso de los años
        
        
        
    }
    
}
