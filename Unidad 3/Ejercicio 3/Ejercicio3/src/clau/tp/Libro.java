

package clau.tp;

import java.util.Scanner;

/**
 *
 * @author Rodriguez
 */
public class Libro {
    String titulo;
    private String autor;
    private int añoPublicacion;
    
    public void mostrarInfo() {
        System.out.println("=== INFO LIBRO ===");
        System.out.println("Tirulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Año de publicacion: " + this.añoPublicacion);
        System.out.println("");
        
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if(titulo != null){
            this.titulo = titulo;
        }
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if(autor != null){
            this.autor = autor;
        }
    }

    public int getAñoPublicacion() {
        return this.añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        if (añoPublicacion > 0) {
            this.añoPublicacion = añoPublicacion;
        } else {
            System.out.println("ERROR: Año inválido. Debe ser positivo diferente de 0.");
    }

    }
    
    
   
    
    
    
    


}
