
package clau.tp5;

/**
 *
 * @author Rodriguez
 */
public class Calculadora {
    
    public void calcular(Impuesto impuesto){
        impuesto.setMonto(impuesto.getMonto() + impuesto.getMonto() * 0.21); 
        //sumamos 21% al impuesto ya aplicado
        System.out.print("Nuevo impuesto para "
                + "el contribuyente<<" + impuesto.contribuyente.getNombre()+ ">> "
                        + "con cuil " + impuesto.contribuyente.getCuil());
    }

}
