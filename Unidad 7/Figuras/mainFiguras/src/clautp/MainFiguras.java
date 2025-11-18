package clautp;

/**
 * 
 * @author Rodriguez
 */
public class MainFiguras {

    public static void main(String[] args) {
        
        Figura[] figuras = new Figura[4];
        
        
        figuras[0] = new Circulo("Circulo 1", 5.0);
        figuras[1] = new Rectangulo("Rectangulo 1", 4.0, 6.0);
        figuras[2] = new Circulo("Circulo 2", 3.5);
        figuras[3] = new Rectangulo("Rectangulo 2", 8.0, 2.0);
        
        // Mostrar el area de cada figura usando polimorfismo
        System.out.println("============ Figuras Geometricas y Metodos Abstractos =============");
        for (Figura figura : figuras) {
            System.out.println(figura.getNombre() + " - Area: " + 
                             String.format("%.2f", figura.calcularArea()));
        }
        
    }

}
