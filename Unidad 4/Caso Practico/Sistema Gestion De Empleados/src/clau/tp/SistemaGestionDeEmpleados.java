
package clau.tp;

import java.util.Scanner;

/**
 *
 * @author Rodriguez
 */
public class SistemaGestionDeEmpleados {
    
    public static void main(String[] args) {
        System.out.println("---- SISTEMA DE GESTION DE EMPLEADOS ----");
        //creamos dos empleados con los distintos contructores
        Empleado empleado1 = new Empleado(1,"Junior", "QA Manual", 2500.0); //ID FIJO, SALARIO MANUAL
        Empleado empleado2 = new Empleado("Sofia", "QA Automation"); //ID random, SALARIO fijo de 500
        Empleado empleado3 = new Empleado("Simon", "Developer"); //ID random, SALARIO fijo de 500
        
        //Actualizamos el salario de los empleados
        empleado1.actualizarSalario(500.0); //en cantidad
        empleado2.actualizarSalario(50); //en porcentaje
        
        //Imprimiendo Informacion de cada empleado
        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());       
        System.out.println(empleado3.toString());
        
        
        //Mostramos el total de empleados creados
        Empleado.mostrarTotalEmpleados();
        
        
        System.out.println("\n----------------------------------------");
        
        
    }
    
}
