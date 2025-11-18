package clautp;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Rodriguez
 */
public class MainAnimales {
    public static void main(String[] args) {

        List<Animal> animales = new ArrayList<>();
        
        // Agregar diferentes tipos de animales
        animales.add(new Perro("Max"));
        animales.add(new Gato("Luna"));
        animales.add(new Gato("Simba"));
        animales.add(new Vaca("Daisy"));
        
        // Mostrar descripcion y sonidos de cada animal usando polimorfismo
        System.out.println("============ Animales y Comportamiento Sobrescrito =============");
        System.out.println("\n--- Descripcion y sonidos de los animales ---");
        for (Animal animal : animales) {
            System.out.println(animal.describirAnimal());
            animal.hacerSonido(); 
            System.out.println();
        }
        
    }

}
