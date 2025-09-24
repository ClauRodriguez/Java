

package clau.tp;

/**
 *
 * @author Rodriguez
 */
public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    
    // Atributo estático para contar empleados
    private static int totalEmpleados = 0;
    
    //Constructor completo
    public Empleado(int id, String nombre, String puesto, double salario){
        totalEmpleados++;
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
       }
    //Contructor nombre y pusto. Asigna ID automatico, salario por defecto
    public Empleado(String nombre, String puesto){
        this.nombre = nombre;
        this.puesto = puesto;
        this.id = ++totalEmpleados;
        this.salario = 500;
       }

    //Metodos sobrecargados actualizarSalario()
    public void actualizarSalario(int porcentaje){
        double aumentoEnPesos = this.salario * porcentaje / 100;
        this.salario +=  aumentoEnPesos;
    }
    public void actualizarSalario(double cantidad){
        this.salario +=  cantidad;
    }
    
    //Metodo toString()
    @Override
    public String toString() {
        return "Empleado[ID= " + id + ", Nombre= " + nombre + ", Puesto= " + puesto +
                ", Salario= $" + salario + "]";
    }
    
    
    //Metodo estatico
    public static void mostrarTotalEmpleados(){
        System.out.print("Total de empleados hasta el momento: " + getTotalEmpleados());
        
    }
    
    //Metodos setters

    public void setNombre(String nombre) {
        if (nombre != null) {
            this.nombre = nombre;
        }
    }

    public void setPuesto(String puesto) {
        if (puesto != null) {
            this.puesto = puesto;
        };
    }

    public void setSalario(double salario) {
         if (salario > 0) {
            this.salario = salario;
        }
    }
    
    //Metodos getters

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }

    public static int getTotalEmpleados() {
        return totalEmpleados;
    }
    
    

}
