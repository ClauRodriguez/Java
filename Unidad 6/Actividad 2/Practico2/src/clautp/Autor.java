package clautp;

/**
 * Clase que representa un Autor
 * @author Rodriguez
 */
public class Autor {
    private String id;
    private String nombre;
    private String nacionalidad;
    
    
    public Autor(String id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }
    
    
    public void mostrarInfo() {
        System.out.println("=== Informacion del Autor ===");
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Nacionalidad: " + nacionalidad);
        System.out.println("============================");
    }
    
    @Override
    public String toString() {
        return "Autor{id='" + id + "', nombre='" + nombre + "', nacionalidad='" + nacionalidad + "'}";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Autor autor = (Autor) obj;
        return id != null ? id.equals(autor.id) : autor.id == null;
    }
    
    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
    
    // Getters y Setters
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
    
    public String getNacionalidad() {
        return nacionalidad;
    }
    
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
}

