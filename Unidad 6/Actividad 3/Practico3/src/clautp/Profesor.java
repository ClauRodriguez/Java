package clautp;

import java.util.ArrayList;
import java.util.List;


public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    List<Curso> cursos;
    
    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }
    
    public void agregarCurso(Curso c) {
        if (c != null && !cursos.contains(c)) {
            cursos.add(c);
            if (c.getProfesor() != this) {
                c.setProfesor(this);
            }
        }
    }
    
    public void eliminarCurso(Curso c) {
        if (c != null && cursos.contains(c)) {
            cursos.remove(c);
            if (c.getProfesor() == this) {
                c.setProfesor(null);
            }
        }
    }
    
    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("  No dicta cursos actualmente.");
        } else {
            for (Curso curso : cursos) {
                System.out.println("  - " + curso.getCodigo() + ": " + curso.getNombre());
            }
        }
    }
    
    public void mostrarInfo() {
        System.out.println("Profesor ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Cantidad de cursos: " + cursos.size());
    }
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getEspecialidad() {
        return especialidad;
    }
    
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    public List<Curso> getCursos() {
        return new ArrayList<>(cursos);
    }
    
    @Override
    public String toString() {
        return "Profesor{id='" + id + "', nombre='" + nombre + "', especialidad='" + especialidad + "', cursos=" + cursos.size() + "}";
    }
}

