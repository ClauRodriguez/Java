
package clau.tp;

import java.util.Scanner;

/**
 *
 * @author Rodriguez
 */
public class Ejercicio3 {
    public static Libro definirLibro() {
        Scanner input = new Scanner(System.in);
        Libro libro = new Libro();
        System.out.print("Ingrese el nombre del libro: ");
        libro.setTitulo(input.nextLine());
        System.out.print("Ingrese el autor del libro: ");
        libro.setAutor(input.nextLine());
        System.out.print("Ingrese el año de publicacion: ");
        libro.setAñoPublicacion(Integer.parseInt(input.nextLine()));
        return libro;
        
    }
    public static void cambiarAnio(Libro libro) {
        Scanner input = new Scanner(System.in);
        System.out.print("MODIFICACION DE ANIO DE PUBLICACION");
        System.out.print("Ingrese el anio del libro: ");
        libro.setAñoPublicacion(Integer.parseInt(input.nextLine()));    
    }
    
    public static void main(String[] args) {
        Libro libro1;
        libro1 = definirLibro(); //creamos el objeto libro correcto
        cambiarAnio(libro1); //modificamos el año por uno invalido
        cambiarAnio(libro1); //modificamos el año por uno valido
        libro1.mostrarInfo();//mostramos la info con el metodo
        
        
    }
    
}
