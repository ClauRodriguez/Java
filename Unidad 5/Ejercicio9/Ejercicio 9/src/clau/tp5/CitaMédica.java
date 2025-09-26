
package clau.tp5;

import java.util.Date;

/**
 *
 * @author Rodriguez
 */
public class CitaMédica {
    private Date fecha, hora;
    private Paciente paciente;
    private Profesional profesional;
    
    //Constructor
    public CitaMédica(Date fecha, Date hora, Paciente paciente, 
            Profesional profesional) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.profesional = profesional;
}

}
