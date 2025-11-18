package clautp;


public class Vaca extends Animal {

    public Vaca(String nombre) {
        super(nombre, "Vacuna");
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: Muu muu!");
    }
}

