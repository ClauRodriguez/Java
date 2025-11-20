package clautp;

/**
 * 
 * @author Rodriguez
 */
public class MainInterfases {

    public static void main(String[] args) {
        System.out.println("========== SISTEMA E-COMMERCE ==========\n");
        
        // 1. Crear un cliente
        Cliente cliente = new Cliente("Juan Perez", "juan.perez@email.com");
        System.out.println("Cliente creado: " + cliente + "\n");
        
        // 2. Crear productos 
        Producto producto1 = new Producto("Laptop", 1500.00);
        Producto producto2 = new Producto("Mouse", 25.50);
        Producto producto3 = new Producto("Teclado", 75.00);
        
        
        // 3. Crear un pedido 
        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(producto1);
        pedido.agregarProducto(producto2);
        pedido.agregarProducto(producto3);
        
        System.out.println("Pedido creado:");
        System.out.println(pedido);
        System.out.println("Total del pedido: $" + pedido.calcularTotal());
        System.out.println();
        
        // 4. Cambio de estado del pedido
        System.out.println("--- Cambios de estado del pedido ---");
        pedido.cambiarEstado("EN PROCESO");
        pedido.cambiarEstado("ENVIADO");
        pedido.cambiarEstado("ENTREGADO");
        
        // 5. Demostrar diferentes metodos de pago
        System.out.println("\n--- Procesamiento de pagos ---\n");
        
        // Pago con Tarjeta de Credito
        TarjetaCredito tarjeta = new TarjetaCredito("1234567890123456", "Juan Perez", 10.0);
        System.out.println("Pago con Tarjeta de Credito:");
        tarjeta.procesarPago(pedido.calcularTotal());
        System.out.println();
        
        // Pago con PayPal 
        PayPal paypal = new PayPal("juan.perez@email.com", "****");
        System.out.println("Pago con PayPal:");
        paypal.procesarPago(pedido.calcularTotal());
        System.out.println();
        
        
        Pagable[] elementosPagables = {producto1, producto2, pedido};
        System.out.println("Total de elementos:");
        double totalGeneral = 0;
        for (Pagable elemento : elementosPagables) {
            double total = elemento.calcularTotal();
            totalGeneral += total;
            String descripcion = "";
            if (elemento instanceof Producto) {
                Producto producto = (Producto) elemento;
                descripcion = " (Producto: " + producto.getNombre() + ")";
            } else if (elemento instanceof Pedido) {
                descripcion = " (Pedido completo)";
            }
            System.out.println("- Total: $" + total + descripcion);
        }
        System.out.println("Total general: $" + totalGeneral);
        
    }
}
