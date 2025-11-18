
package clautp;

/**
 * @author Rodriguez
 */
public class Practico2 {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("  SISTEMA DE GESTION DE BIBLIOTECA");
        System.out.println("========================================\n");
        
        System.out.println("TAREA 1 --> Creando una biblioteca...");
        Biblioteca biblioteca = new Biblioteca("Biblioteca de Clau");
        System.out.println("Biblioteca '" + biblioteca.getNombre() + "' creada exitosamente.\n");
        
        System.out.println("TAREA 2 --> Creando autores...");
        Autor autor1 = new Autor("z001", "Akira Toriyama", "Japonesa");
        Autor autor2 = new Autor("z002", "Eiichiro Oda", "Japonesa");
        Autor autor3 = new Autor("z003", "Kohei Horikoshi", "Japonesa");
        Autor autor4 = new Autor("z004", "Riichiro Inagaki", "Japonesa");
        Autor autor5 = new Autor("z005", "CLAMP", "Japonesa");
        System.out.println("Cinco autores creados exitosamente.\n");
        
        System.out.println("TAREA 3 --> Agregando 5 libros a la biblioteca...");
        biblioteca.agregarLibro("978-4-08-851090-1", "Dragon Ball Z", 1984, autor1);
        biblioteca.agregarLibro("978-4-08-871099-8", "One Piece", 1997, autor2);
        biblioteca.agregarLibro("978-4-08-880260-0", "Boku no Hero Academia", 2014, autor3);
        biblioteca.agregarLibro("978-4-08-880884-8", "Dr. Stone", 2017, autor4);
        biblioteca.agregarLibro("978-4-08-872076-8", "Sakura Card Captor", 1996, autor5);
        System.out.println();
        
        System.out.println("TAREA 4 --> Listando todos los libros...");
        biblioteca.listarLibros();
        
        System.out.println("TAREA 5 --> Buscando un libro por ISBN...");
        String isbnBuscado = "978-4-08-851090-1";
        Libro libroEncontrado = biblioteca.buscarLibroPorIsbn(isbnBuscado);
        if (libroEncontrado != null) {
            System.out.println("Libro encontrado:");
            libroEncontrado.mostrarInfo();
        } else {
            System.out.println("No se encontro el libro con ISBN: " + isbnBuscado);
        }
        
        System.out.println("TAREA 6 --> Filtrando libros por anio...");
        int anioFiltro = 1997;
        biblioteca.filtrarLibrosPorAnio(anioFiltro);
        
        System.out.println("TAREA 7 --> Eliminando un libro por ISBN...");
        String isbnEliminar = "978-4-08-880260-0";
        biblioteca.eliminarLibro(isbnEliminar);
        System.out.println("\nListando libros restantes despues de la eliminacion:");
        biblioteca.listarLibros();
        
        System.out.println("TAREA 8 --> Mostrando cantidad total de libros...");
        int cantidad = biblioteca.obtenerCantidadLibros();
        System.out.println("La biblioteca '" + biblioteca.getNombre() + "' contiene " + cantidad + " libro(s).\n");

        System.out.println("TAREA 9 --> Listando todos los autores disponibles...");
        biblioteca.mostrarAutoresDisponibles();
        
    }

}
