
package ar.clau.tp;

/**
 *
 * @author Rodriguez
 */
import java.util.Scanner;
public class ErrorEjemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine(); // ERROR
        System.out.println("Hola, " + nombre);
    }
}

/*
import java.util.Scanner;
public class ErrorEjemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextInt(); // ERROR
        System.out.println("Hola, " + nombre);
}
}
*/
//El error que contenia el codigo era que estaba intentando guardar un valor de tipo
//INT en una variable declarada como tipo String. La solucion fue cambiar
//el codigo scanner.nextInt(); por scanner.nextLine(); linea 13.

