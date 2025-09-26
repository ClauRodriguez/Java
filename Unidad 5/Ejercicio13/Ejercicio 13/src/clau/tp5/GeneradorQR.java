
package clau.tp5;

/**
 *
 * @author Rodriguez
 */
public class GeneradorQR {
    
    public void generar(String valor, Usuario usuario){
        CodigoQR codigoQR = new CodigoQR(valor, usuario);
        
        System.out.println("Creando codigo QR......");
        System.out.println("Codigo QR creado con exito!: " + codigoQR);
        System.out.println("Codigo QR generado para el usuario: " + usuario.getNombre());
        System.out.println("Valor del QR: " + valor);
        System.out.println("Email asociado: " + usuario.getEmail());
    }


}
