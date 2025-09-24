
package clau.tp;

import java.util.Scanner;

/**
 *
 * @author Rodriguez
 */
public class Ejercicio1 {
    public static Estudiante definirAlumno() {
        Scanner input = new Scanner(System.in);
        Estudiante alumno = new Estudiante();
        System.out.print("Ingrese el nombre del alumno: ");
        alumno.nombre = input.nextLine();
        System.out.print("Ingrese el apellido del alumno: ");
        alumno.apellido = input.nextLine();
        System.out.print("Ingrese el curso del alumno: ");
        alumno.curso = input.nextLine();
        System.out.print("Ingrese la calificacion del alumno: ");
        alumno.calificacion = Integer.parseInt(input.nextLine());
        return alumno;
        
    }
   
    public static void main(String[] args) {
        //definimos una variable de clase Estudiante
        Estudiante alumno1;
        alumno1 = definirAlumno();
        //mostramos la info
        alumno1.mostrarInfo();
        //subimos su calificacion
        alumno1.subirCalificacion(3);
        //mostramos la info nuevamente
        alumno1.mostrarInfo();
        //bajamos su calificacion
        alumno1.bajarCalificacion(2);
        //mostramos la info nuevamente
        alumno1.mostrarInfo();
    }
    
}
