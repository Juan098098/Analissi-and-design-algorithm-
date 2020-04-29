package controlador;

import java.util.ArrayList;
import modelo.Producto;

public class Productos {

    ArrayList<Producto> listaProductos = new ArrayList<Producto>();

    public boolean agregar(Producto producto) {
        if (buscarPorId(producto.getId()) == null) {
            listaProductos.add(producto);
            return true;
        } else {
            return false;
        }
    }

    public void eliminar(Producto producto) {
        listaProductos.remove(producto);
    }

//    public void eliminarPorId(int idEliminar) {
//        for (int i = 0; i < listaProductos.size(); i++) {
//            if (idEliminar == listaProductos.get(i).getId()) {
//                listaProductos.remove(idEliminar);
//            }
//        }
//
//    }

    public String mostrarLista() {
        String lista = "";
        for (Producto producto : listaProductos) {
            lista = lista + producto.toString();
        }
        return lista;
    }

    public Producto buscarPorNombre(String nombreBusqueda) {
        Producto aux = null;
        for (Producto producto : listaProductos) {
            if (nombreBusqueda.equalsIgnoreCase(producto.getNombre())) {
                aux = producto;
            }
        }
        return aux;
    }

    public Producto buscarPorId(int idBusqueda) {
        Producto aux = null;
        for (Producto producto : listaProductos) {
            if (idBusqueda == producto.getId()) {
                aux = producto;
            }
        }
        return aux;
    }

    public void disminuirCantidad(int id, int cantidad) {
        int nuevaCantidad = buscarPorId(id).getCantidad() - cantidad;
        System.out.println("Nueva cantidad del metodo "+nuevaCantidad);
        buscarPorId(id).setCantidad(nuevaCantidad);   
    }
    

}
