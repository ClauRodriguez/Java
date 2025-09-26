
package clau.tp5;

/**
 *
 * @author Rodriguez
 */
public class EditorVideo {
    
    public void exportar(String formato, Proyecto proyecto){
        
        System.out.println("Editor de video procesando exportación...");
        Render render = new Render(formato, proyecto);
        System.out.println("Render creado: " + render);
        System.out.println();
        
        // Simular tiempo de procesamiento
        System.out.println("Exportación completada exitosamente!");
        System.out.println("Archivo guardado como: " + proyecto.getNombre() + "." + formato.toLowerCase());
        
        System.out.println("------ EXPORTACIÓN FINALIZADA --------");

    }

}
