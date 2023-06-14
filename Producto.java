
package poo_supermarket;

public class Producto {
    protected double precioProducto;
    protected String marca;
    protected String nombre;
    protected boolean preciosCuidados;
    protected boolean primeraNec;

    public Producto(String marca, String nombre, boolean preciosCuidados, boolean primeraNec, double precioProducto) {
        this.marca = marca;
        this.nombre = nombre;
        this.preciosCuidados = preciosCuidados;
        this.primeraNec = primeraNec;
        this.precioProducto = precioProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isPreciosCuidados() {
        return preciosCuidados;
    }

    public void setPreciosCuidados(boolean preciosCuidados) {
        this.preciosCuidados = preciosCuidados;
    }

    public boolean isPrimeraNec() {
        return primeraNec;
    }

    public void setPrimeraNec(boolean primeraNec) {
        this.primeraNec = primeraNec;
    }
    
}
