package modelo;

public class Producto {

    public int id;
    public String nombre;
    public String marca;
    public String fechaVencimiento;
    public double precio;
    public int cantidad;
//Todos los atributos

    public Producto(int id, String nombre, String fechaVencimiento, String marca, double precio, int cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.marca = marca;
        this.fechaVencimiento = fechaVencimiento;
        this.precio = precio;
        this.cantidad = cantidad;
    }
//Todos los atributos not null

    public Producto(int id, String nombre, double precio, int cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public Producto(int id, String nombre, String fechaVencimiento, double precio, int cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.fechaVencimiento = fechaVencimiento;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public Producto(int id, String nombre, double precio, int cantidad, String marca) {
        this.id = id;
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Id: " + id + " \n"
                + nombre + ": \n"
                + "Marca: " + marca + ": \n"
                + "Precio: " + precio + "\n"
                + "Fecha de vencimiento: " + fechaVencimiento + "\n"
                + "Cantidad: " + cantidad + "\n"
                + "__________________________________________________________________ \n";
    }

    public String toStringVentas() {
        return  "Cantidad vendida: " + cantidad + " del producto " + nombre + " \n";

    }

}
