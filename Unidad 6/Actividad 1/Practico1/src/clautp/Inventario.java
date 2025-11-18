package clautp;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> productos;
    
    public Inventario() {
        this.productos = new ArrayList<>();
    }
    
    public void agregarProducto(Producto p) {
        productos.add(p);
        System.out.println("Producto agregado: " + p.getNombre());
    }
    
    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("El inventario esta vacio.");
            return;
        }
        System.out.println("\n=== LISTADO DE PRODUCTOS ===");
        for (Producto p : productos) {
            p.mostrarInfo();
        }
    }
    
    public Producto buscarProductoPorId(String id) {
        for (Producto p : productos) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }
    
    public boolean eliminarProducto(String id) {
        Producto producto = buscarProductoPorId(id);
        if (producto != null) {
            productos.remove(producto);
            System.out.println("Producto eliminado: " + producto.getNombre());
            return true;
        } else {
            System.out.println("No se encontro un producto con ID: " + id);
            return false;
        }
    }
    
    public boolean actualizarStock(String id, int nuevaCantidad) {
        Producto producto = buscarProductoPorId(id);
        if (producto != null) {
            producto.setCantidad(nuevaCantidad);
            System.out.println("Stock actualizado para " + producto.getNombre() + ": " + nuevaCantidad);
            return true;
        } else {
            System.out.println("No se encontro un producto con ID: " + id);
            return false;
        }
    }
    
    public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        ArrayList<Producto> productosFiltrados = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getCategoria() == categoria) {
                productosFiltrados.add(p);
            }
        }
        return productosFiltrados;
    }
    
    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) {
            total += p.getCantidad();
        }
        return total;
    }
    
    public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) {
            return null;
        }
        Producto mayorStock = productos.get(0);
        for (Producto p : productos) {
            if (p.getCantidad() > mayorStock.getCantidad()) {
                mayorStock = p;
            }
        }
        return mayorStock;
    }
    
    public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max) {
        ArrayList<Producto> productosFiltrados = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                productosFiltrados.add(p);
            }
        }
        return productosFiltrados;
    }
    
    public void mostrarCategoriasDisponibles() {
        System.out.println("\n=== CATEGORIAS DISPONIBLES ===");
        for (CategoriaProducto categoria : CategoriaProducto.values()) {
            System.out.println(categoria.name() + ": " + categoria.getDescripcion());
        }
    }
}

