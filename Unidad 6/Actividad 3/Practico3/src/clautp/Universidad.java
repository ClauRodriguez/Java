package clautp;

import java.util.ArrayList;
import java.util.List;


public class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;
    
    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }
    
    public void agregarProfesor(Profesor p) {
        if (p != null && !profesores.contains(p)) {
            profesores.add(p);
        }
    }
    
    public void agregarCurso(Curso c) {
        if (c != null && !cursos.contains(c)) {
            cursos.add(c);
        }
    }
    
    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);
        
        if (curso == null) {
            System.out.println("Error: Curso con codigo " + codigoCurso + " no encontrado.");
            return;
        }
        
        if (profesor == null) {
            System.out.println("Error: Profesor con ID " + idProfesor + " no encontrado.");
            return;
        }
        
        curso.setProfesor(profesor);
        System.out.println("Profesor " + profesor.getNombre() + " asignado al curso " + curso.getNombre());
    }
    
    public void listarProfesores() {
        System.out.println("\n=== LISTA DE PROFESORES ===");
        if (profesores.isEmpty()) {
            System.out.println("No hay profesores registrados.");
        } else {
            for (Profesor profesor : profesores) {
                profesor.mostrarInfo();
                System.out.println("Cursos que dicta:");
                profesor.listarCursos();
                System.out.println();
            }
        }
    }
    
    public void listarCursos() {
        System.out.println("\n=== LISTA DE CURSOS ===");
        if (cursos.isEmpty()) {
            System.out.println("No hay cursos registrados.");
        } else {
            for (Curso curso : cursos) {
                curso.mostrarInfo();
                System.out.println();
            }
        }
    }
    
    public Profesor buscarProfesorPorId(String id) {
        for (Profesor profesor : profesores) {
            if (profesor.getId().equals(id)) {
                return profesor;
            }
        }
        return null;
    }
    
    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso curso : cursos) {
            if (curso.getCodigo().equals(codigo)) {
                return curso;
            }
        }
        return null;
    }
    
    public void eliminarCurso(String codigo) {
        Curso curso = buscarCursoPorCodigo(codigo);
        if (curso != null) {
            if (curso.getProfesor() != null) {
                curso.getProfesor().eliminarCurso(curso);
            }
            cursos.remove(curso);
            System.out.println("Curso " + codigo + " eliminado exitosamente.");
        } else {
            System.out.println("Error: Curso con codigo " + codigo + " no encontrado.");
        }
    }
    
    public void eliminarProfesor(String id) {
        Profesor profesor = buscarProfesorPorId(id);
        if (profesor != null) {
            List<Curso> cursosDelProfesor = new ArrayList<>(profesor.getCursos());
            for (Curso curso : cursosDelProfesor) {
                curso.setProfesor(null);
            }
            profesores.remove(profesor);
            System.out.println("Profesor " + id + " eliminado exitosamente.");
        } else {
            System.out.println("Error: Profesor con ID " + id + " no encontrado.");
        }
    }
    
    public void mostrarReporteCursosPorProfesor() {
        System.out.println("\n=== REPORTE: CANTIDAD DE CURSOS POR PROFESOR ===");
        if (profesores.isEmpty()) {
            System.out.println("No hay profesores registrados.");
        } else {
            for (Profesor profesor : profesores) {
                System.out.println(profesor.getNombre() + " (" + profesor.getId() + "): " + 
                                 profesor.getCursos().size() + " curso(s)");
            }
        }
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public List<Profesor> getProfesores() {
        return new ArrayList<>(profesores);
    }
    
    public List<Curso> getCursos() {
        return new ArrayList<>(cursos);
    }
    
    @Override
    public String toString() {
        return "Universidad{nombre='" + nombre + "', profesores=" + profesores.size() + ", cursos=" + cursos.size() + "}";
    }
}

