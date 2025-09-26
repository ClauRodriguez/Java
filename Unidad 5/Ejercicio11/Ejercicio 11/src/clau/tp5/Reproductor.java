
package clau.tp5;

/**
 *
 * @author Rodriguez
 */
public class Reproductor {
    
    void reproducir(Cancion cancion){
        System.out.println("El titulo <<" + cancion.getTitulo() + ">> esta siendo reproducido.");
        System.out.print("Nombre del artista <<" + cancion.artista.getNombre()+ ">> ");
        System.out.print("Genero musical <<" + cancion.artista.getGenero()+ ">> ");
    }

}
