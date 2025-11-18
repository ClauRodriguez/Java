
package clautp;

/**
 * 
 * @author Rodriguez
 */
public class Practico3 {

    public static void main(String[] args) {
        System.out.println("==================== SISTEMA ACADEMICO ====================\n");
        
        Universidad universidad = new Universidad("Universidad JR Technology");
        
        System.out.println("TAREA 1 -->  Creando profesores y cursos...");
        Profesor prof1 = new Profesor("P001", "Dr. Juan Perez", "Matematicas");
        Profesor prof2 = new Profesor("P002", "Dra. Maria Gonzalez", "Programacion");
        Profesor prof3 = new Profesor("P003", "Dr. Carlos Rodriguez", "Base de Datos");
        
        Curso curso1 = new Curso("C001", "Algebra Lineal");
        Curso curso2 = new Curso("C002", "Programacion Orientada a Objetos");
        Curso curso3 = new Curso("C003", "Estructuras de Datos");
        Curso curso4 = new Curso("C004", "Base de Datos I");
        Curso curso5 = new Curso("C005", "Calculo Diferencial");
        
        System.out.println("3 profesores y 5 cursos creados.\n");
        
        System.out.println("TAREA 2 -->  Agregando profesores y cursos a la universidad...");
        universidad.agregarProfesor(prof1);
        universidad.agregarProfesor(prof2);
        universidad.agregarProfesor(prof3);
        
        universidad.agregarCurso(curso1);
        universidad.agregarCurso(curso2);
        universidad.agregarCurso(curso3);
        universidad.agregarCurso(curso4);
        universidad.agregarCurso(curso5);
        
        System.out.println("Profesores y cursos agregados a la universidad.\n");
        
        System.out.println("TAREA 3 -->  Asignando profesores a cursos...");
        universidad.asignarProfesorACurso("C001", "P001");
        universidad.asignarProfesorACurso("C002", "P002");
        universidad.asignarProfesorACurso("C003", "P002");
        universidad.asignarProfesorACurso("C004", "P003");
        universidad.asignarProfesorACurso("C005", "P001");
        System.out.println();
        
        System.out.println("TAREA 4 -->  Listando informacion...");
        universidad.listarCursos();
        universidad.listarProfesores();
        
        System.out.println("\nTAREA 5 -->  Cambiando profesor de un curso...");
        System.out.println("Cambiando el profesor del curso C003 (Estructuras de Datos) de P002 a P001...");
        universidad.asignarProfesorACurso("C003", "P001");
        System.out.println("\nVerificando sincronizacion:");
        System.out.println("Cursos de " + prof1.getNombre() + ":");
        prof1.listarCursos();
        System.out.println("\nCursos de " + prof2.getNombre() + ":");
        prof2.listarCursos();
        System.out.println();
        
        System.out.println("TAREA 6 -->  Removiendo un curso...");
        System.out.println("Removiendo el curso C005 (Calculo Diferencial)...");
        universidad.eliminarCurso("C005");
        System.out.println("\nVerificando que el curso ya no esta en la lista del profesor:");
        prof1.listarCursos();
        System.out.println();
        
        System.out.println("TAREA 7 -->  Removiendo un profesor...");
        System.out.println("Removiendo el profesor P003 (Dr. Carlos Rodriguez)...");
        universidad.eliminarProfesor("P003");
        System.out.println("\nVerificando que los cursos del profesor eliminado tienen profesor = null:");
        curso4.mostrarInfo();
        System.out.println();
        
        System.out.println("TAREA 8 -->  Generando reporte de cursos por profesor...");
        universidad.mostrarReporteCursosPorProfesor();
        
        System.out.println("\n=== FIN DEL PROGRAMA ===");
    }

}
