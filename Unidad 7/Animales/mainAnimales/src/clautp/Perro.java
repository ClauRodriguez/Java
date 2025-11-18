package clautp;

public class Perro extends Animal {
    
    public Perro(String nombre) {
        super(nombre, "Canino");
    }
    
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: Guau guau!");
    }
}

