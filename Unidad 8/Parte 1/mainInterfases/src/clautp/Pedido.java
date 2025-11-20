package clautp;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un pedido en el sistema de E-commerce
 * Implementa Pagable y puede notificar cambios de estado
 */
public class Pedido implements Pagable {
    private List<Producto> productos;
    private String estado;
    private Cliente cliente;
    
    public Pedido(Cliente cliente) {
        this.productos = new ArrayList<>();
        this.estado = "PENDIENTE";
        this.cliente = cliente;
    }
    
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
    
    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.calcularTotal();
        }
        return total;
    }
    
    public void cambiarEstado(String nuevoEstado) {
        String estadoAnterior = this.estado;
        this.estado = nuevoEstado;
        
        if (cliente != null) {
            cliente.notificar("El pedido cambio de estado: " + estadoAnterior + " -> " + nuevoEstado);
        }
    }
    
    // Getters y Setters
    public List<Producto> getProductos() {
        return productos;
    }
    
    public String getEstado() {
        return estado;
    }
    
    public Cliente getCliente() {
        return cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    @Override
    public String toString() {
        return "Pedido{" + "productos=" + productos.size() + ", estado=" + estado + ", total=" + calcularTotal() + '}';
    }
}

