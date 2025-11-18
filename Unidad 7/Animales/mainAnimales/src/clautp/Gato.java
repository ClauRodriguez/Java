package clautp;

public class Gato extends Animal {
    

    public Gato(String nombre) {
        super(nombre, "Felino");
    }
    
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: Miau miau!");
    }
}

