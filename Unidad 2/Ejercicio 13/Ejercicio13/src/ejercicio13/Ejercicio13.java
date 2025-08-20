
package ejercicio13;

import java.util.Random;

/**
 *
 * @author Rodriguez
 */
public class Ejercicio13 {
    
    public static double precioAleatorio() {
        Random rando = new Random();
        return Math.round(rando.nextDouble() * 50000.0) / 100.0; // Precio entre 0.00 y 500.00         
    }
    
    
    public static double[] addPrecios() {
        Random rando = new Random();
        int tamanioLista = 1 + rando.nextInt(10);
        double[] listaPrecios = new double[tamanioLista];
        for (int i = 0; i < tamanioLista; i++) {
            listaPrecios[i] = precioAleatorio();
        }
        return listaPrecios;
    }
    
    public static void mostrarValores(double[] lista, int indice) {
        if (indice >= lista.length) {
            return;
        }
        System.out.println("Precio: $" + lista[indice]);
        mostrarValores(lista, indice + 1);
}
    public static int indiceAleatorio(double[] lista) {
        Random rando = new Random();
        return rando.nextInt(lista.length);
}
    
    public static double[] modificarValor(double[] lista, int indice) {
        lista[indice] = precioAleatorio();
        return lista;
}

   
    public static void main(String[] args) {
        double[] precioProductos = addPrecios();
        System.out.println("Precios originales: ");
        mostrarValores(precioProductos,0);
        double[] precioModificado = modificarValor(precioProductos,indiceAleatorio(precioProductos));
        System.out.println("///////////////");
        System.out.println("Precios modificados: ");
        mostrarValores(precioModificado,0);
        
        
    }
    
}
