package clautp;


public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;
    
    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }
    
    public void setProfesor(Profesor p) {
        if (this.profesor == p) {
            return;
        }
        
        Profesor profesorAnterior = this.profesor;
        if (profesorAnterior != null) {
            profesorAnterior.cursos.remove(this);
        }
        
        this.profesor = p;
        
        if (p != null && !p.cursos.contains(this)) {
            p.cursos.add(this);
        }
    }
    
    public void mostrarInfo() {
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombre);
        if (profesor != null) {
            System.out.println("Profesor: " + profesor.getNombre());
        } else {
            System.out.println("Profesor: Sin asignar");
        }
    }
    
    public String getCodigo() {
        return codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public Profesor getProfesor() {
        return profesor;
    }
    
    @Override
    public String toString() {
        String profNombre = (profesor != null) ? profesor.getNombre() : "Sin asignar";
        return "Curso{codigo='" + codigo + "', nombre='" + nombre + "', profesor='" + profNombre + "'}";
    }
}

