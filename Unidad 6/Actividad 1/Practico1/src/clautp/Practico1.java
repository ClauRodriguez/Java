
package clautp;

import java.util.ArrayList;

/**
 *
 * @author Rodriguez
 */
public class Practico1 {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        
        System.out.println("========== SISTEMA DE STOCK ==========\n");
        
        // Tarea 1: Crear al menos cinco productos
        System.out.println("1. CREANDO PRODUCTOS Y AGREGANDOLOS AL INVENTARIO");
        System.out.println("==================================================");
        Producto p1 = new Producto("P001", "Laptop HP", 2500.00, 15, CategoriaProducto.ELECTRONICA);
        Producto p2 = new Producto("P002", "Camiseta Nike", 1500.00, 30, CategoriaProducto.ROPA);
        Producto p3 = new Producto("P003", "Arroz 1kg", 800.00, 50, CategoriaProducto.ALIMENTOS);
        Producto p4 = new Producto("P004", "Sofa 3 plazas", 3500.00, 5, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P005", "Smartphone Samsung", 2800.00, 20, CategoriaProducto.ELECTRONICA);
        
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);
        
        System.out.println("\n");
        
        // Tarea 2: Listar todos los productos
        System.out.println("2. LISTANDO TODOS LOS PRODUCTOS");
        System.out.println("==================================================");
        inventario.listarProductos();
        
        // Tarea 3: Buscar un producto por ID y mostrar su informacion
        System.out.println("\n3. BUSCANDO PRODUCTO POR ID");
        System.out.println("==================================================");
        Producto productoEncontrado = inventario.buscarProductoPorId("P002");
        if (productoEncontrado != null) {
            System.out.println("Producto encontrado:");
            productoEncontrado.mostrarInfo();
        } else {
            System.out.println("Producto no encontrado.");
        }
        
        // Tarea 4: Filtrar por una categoria especifica
        System.out.println("\n4. FILTRANDO PRODUCTOS POR CATEGORIA (ELECTRONICA)");
        System.out.println("==================================================");
        ArrayList<Producto> productosElectronica = inventario.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);
        System.out.println("Productos de categoria ELECTRONICA:");
        for (Producto p : productosElectronica) {
            p.mostrarInfo();
        }
        
        // Tarea 5: Eliminar un producto por su ID y listar los productos restantes
        System.out.println("\n5. ELIMINANDO PRODUCTO POR ID");
        System.out.println("==================================================");
        inventario.eliminarProducto("P003");
        System.out.println("\nProductos restantes despues de la eliminacion:");
        inventario.listarProductos();
        
        // Tarea 6: Actualizar el stock de un producto existente
        System.out.println("\n6. ACTUALIZANDO STOCK DE UN PRODUCTO");
        System.out.println("==================================================");
        inventario.actualizarStock("P001", 25);
        System.out.println("\nProducto actualizado:");
        inventario.buscarProductoPorId("P001").mostrarInfo();
        
        // Tarea 7: Mostrar el total de stock disponible
        System.out.println("\n7. TOTAL DE STOCK DISPONIBLE");
        System.out.println("==================================================");
        int totalStock = inventario.obtenerTotalStock();
        System.out.println("Total de stock disponible: " + totalStock + " unidades");
        
        // Tarea 8: Obtener y mostrar el producto con mayor stock
        System.out.println("\n8. PRODUCTO CON MAYOR STOCK");
        System.out.println("==================================================");
        Producto productoMayorStock = inventario.obtenerProductoConMayorStock();
        if (productoMayorStock != null) {
            System.out.println("Producto con mayor stock:");
            productoMayorStock.mostrarInfo();
        }
        
        // Tarea 9: Filtrar productos con precios entre $1000 y $3000
        System.out.println("\n9. FILTRANDO PRODUCTOS POR PRECIO ($1000 - $3000)");
        System.out.println("==================================================");
        ArrayList<Producto> productosPorPrecio = inventario.filtrarProductosPorPrecio(1000, 3000);
        System.out.println("Productos con precio entre $1000 y $3000:");
        for (Producto p : productosPorPrecio) {
            p.mostrarInfo();
        }
        
        // Tarea 10: Mostrar las categorias disponibles con sus descripciones
        System.out.println("\n10. CATEGORIAS DISPONIBLES");
        System.out.println("==================================================");
        inventario.mostrarCategoriasDisponibles();
        
        System.out.println("\n=== FIN DEL SISTEMA DE GESTION DE STOCK ===");
    }

}
