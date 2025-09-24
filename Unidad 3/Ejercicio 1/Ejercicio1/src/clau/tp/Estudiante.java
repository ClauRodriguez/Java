

package clau.tp;

/**
 *
 * @author Rodriguez
 */

public class Estudiante {

    String nombre;
    String apellido;
    String curso;
    int calificacion;
    
    public void mostrarInfo() {
        System.out.println("=== INFORMACION DEL ESTUDIANTE ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificacion: " + calificacion);
        System.out.println("");
        
    }
    public int subirCalificacion(int puntos) {
        return calificacion += puntos;
        
    }
    public int bajarCalificacion(int puntos) {
        return calificacion -= puntos;
        
    }

}
