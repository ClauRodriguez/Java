package clautp;

/**
 * 
 * @author Rodriguez
 */
public class MainVehiculos {

    public static void main(String[] args) {
        

        Auto auto = new Auto("Volkswagen", "Golf", 5);
        System.out.println("\n--- INFORMACION DEL VEHICULO ---");
        System.out.println(auto.mostrarInfo());
    }

}
