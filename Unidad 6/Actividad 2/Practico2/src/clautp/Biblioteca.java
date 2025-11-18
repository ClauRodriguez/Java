package clautp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Clase que representa una Biblioteca
 * Relacion de composicion 1 a N con Libro
 * @author Rodriguez
 */
public class Biblioteca {
    private String nombre;
    private List<Libro> libros;
    
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }
    

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        Libro libro = new Libro(isbn, titulo, anioPublicacion, autor);
        libros.add(libro);
        System.out.println("Libro '" + titulo + "' agregado exitosamente a la biblioteca.");
    }
    

    public void listarLibros() {
        System.out.println("\n========== LISTADO DE LIBROS ==========");
        System.out.println("Biblioteca: " + nombre);
        System.out.println("Total de libros: " + libros.size());
        System.out.println("=======================================\n");
        
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
        } else {
            for (int i = 0; i < libros.size(); i++) {
                System.out.println("Libro #" + (i + 1) + ":");
                libros.get(i).mostrarInfo();
            }
        }
    }
    
    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }
    

    public boolean eliminarLibro(String isbn) {
        Libro libroAEliminar = buscarLibroPorIsbn(isbn);
        if (libroAEliminar != null) {
            libros.remove(libroAEliminar);
            System.out.println("Libro con ISBN '" + isbn + "' eliminado exitosamente.");
            return true;
        } else {
            System.out.println("No se encontro un libro con ISBN '" + isbn + "'.");
            return false;
        }
    }
    
    public int obtenerCantidadLibros() {
        return libros.size();
    }
    

    public void filtrarLibrosPorAnio(int anio) {
        System.out.println("\n========== LIBROS DEL ANIO " + anio + " ==========");
        List<Libro> librosFiltrados = new ArrayList<>();
        
        for (Libro libro : libros) {
            if (libro.getAnioPublicacion() == anio) {
                librosFiltrados.add(libro);
            }
        }
        
        if (librosFiltrados.isEmpty()) {
            System.out.println("No se encontraron libros publicados en el anio " + anio + ".");
        } else {
            System.out.println("Se encontraron " + librosFiltrados.size() + " libro(s) del anio " + anio + ":\n");
            for (Libro libro : librosFiltrados) {
                libro.mostrarInfo();
            }
        }
        System.out.println("==========================================\n");
    }
    
    public void mostrarAutoresDisponibles() {
        System.out.println("\n========== AUTORES DISPONIBLES ==========");
        Set<Autor> autoresUnicos = new HashSet<>();
        
        for (Libro libro : libros) {
            autoresUnicos.add(libro.getAutor());
        }
        
        if (autoresUnicos.isEmpty()) {
            System.out.println("No hay autores disponibles (no hay libros en la biblioteca).");
        } else {
            System.out.println("Total de autores: " + autoresUnicos.size() + "\n");
            int contador = 1;
            for (Autor autor : autoresUnicos) {
                System.out.println("Autor #" + contador + ":");
                autor.mostrarInfo();
                contador++;
            }
        }
        System.out.println("========================================\n");
    }
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public List<Libro> getLibros() {
        return libros;
    }
}

