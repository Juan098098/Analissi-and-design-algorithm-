package controlador;

import java.util.ArrayList;
import modelo.Producto;

public class Carrito {

    ArrayList<Producto> carrito = new ArrayList<Producto>();

    public boolean añadirCarrito(Producto producto, int cantidad) {
        
        if (producto.getCantidad() > 0 && cantidad <= producto.getCantidad()) {
            producto.setCantidad(cantidad);
            carrito.add(producto);
            return true;
        } else {
            return false;
        }
    }

    public double precioCantidad(double precio, int cantidad) {
        precio = precio * cantidad;
        return precio;
    }

    public double totalVenta() {
        double total = 0;
        for (Producto producto : carrito) {
            total = total + producto.getPrecio();
        }
        return total;
    }

    public void vaciarCarrito() {
        int i = carrito.size() - 1;
        while (i >= 0) {
            carrito.remove(i);
            i--;
        }
    }

    public String imprimir() {
        String carritoImpresion = "";
        for (Producto producto : carrito) {
            carritoImpresion = carritoImpresion + "\n"
                    + producto.toString();
        }
        return carritoImpresion;
    }
    
        public String imprimirFormatoVent() {
        String carritoImpresion = "";
        for (Producto producto : carrito) {
            carritoImpresion = carritoImpresion + "\n"
                    + producto.toStringVentas();
        }
        return carritoImpresion;
    }
}
