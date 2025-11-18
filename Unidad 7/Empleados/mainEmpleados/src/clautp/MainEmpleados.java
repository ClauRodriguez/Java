package clautp;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Rodriguez
 */
public class MainEmpleados {
    public static void main(String[] args) {

        List<Empleado> empleados = new ArrayList<>();
        
        empleados.add(new EmpleadoPlanta("Juan Perez", "EMP001", 50000, 5000));
        empleados.add(new EmpleadoTemporal("Maria Garcia", "EMP002", 160, 500));
        empleados.add(new EmpleadoPlanta("Carlos Lopez", "EMP003", 60000, 6000));
        empleados.add(new EmpleadoTemporal("Ana Martinez", "EMP004", 120, 450));
        empleados.add(new EmpleadoPlanta("Luis Rodriguez", "EMP005", 55000, 5500));
        
        // Invocar calcularSueldo() polimorficamente
        System.out.println("============ Empleados y Polimorfismo =============");
        System.out.println("\n--- Sueldos calculados polimorficamente ---");
        for (Empleado empleado : empleados) {
            System.out.println(empleado.getNombre() + " (ID: " + empleado.getId() + 
                             ") - Sueldo: $" + String.format("%.2f", empleado.calcularSueldo()));
        }
        
        // Usar instanceof para clasificar empleados
        System.out.println("\n--- Clasificacion usando instanceof ---");
        for (Empleado empleado : empleados) {
            if (empleado instanceof EmpleadoPlanta) {
                System.out.println(empleado.getNombre() + " es un Empleado de Planta");
            } else if (empleado instanceof EmpleadoTemporal) {
                System.out.println(empleado.getNombre() + " es un Empleado Temporal");
            }
        }
        
    }

}
