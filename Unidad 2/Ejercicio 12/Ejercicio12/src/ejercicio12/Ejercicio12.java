
package ejercicio12;

import java.util.Random;

/**
 *
 * @author Rodriguez
 */
public class Ejercicio12 {
    public static double[] preciosAleatorios() {
        Random rando = new Random();
        int tamanioLista = 1 + rando.nextInt(10);
        double[] listaPrecios = new double[tamanioLista];
        for (int i = 0; i < tamanioLista; i++) {
            listaPrecios[i] = Math.round(rando.nextDouble() * 50000.0) / 100.0; // Precio entre 0.00 y 500.00
        }
        return listaPrecios;
    }
    
    public static void mostrarValores(double[] lista) {
        for (double precio : lista) {
            System.out.println("Precio: $" + precio);
        }        
    }
    public static double[] modificarValores(double[] lista,int porcAumento) {
        for (int i = 0; i < lista.length ; i++) {
            lista[i] = lista[i] + (lista[i] * porcAumento / 100);
        }     
        return lista;
    }
    
    

    public static void main(String[] args) {
        double[] precioProductos = preciosAleatorios();
        System.out.println("Precios originales: ");
        mostrarValores(precioProductos);
        double[] precioModificado = modificarValores(precioProductos,15);
        System.out.println("///////////////");
        System.out.println("Precios modificados: ");
        mostrarValores(precioModificado);    
        
    }
    
}
