package poo_supermarket;
//Covarrubias 
import java.util.ArrayList;

public class Venta {

    protected double precio;
    protected String fecha;
    protected Cliente cli;
    ArrayList<Producto> listProd = new ArrayList<Producto>();

    public Venta(double precio, String fecha, Cliente cli) {
        this.precio = precio;
        this.fecha = fecha;
        this.cli = cli;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }

    public ArrayList<Producto> getListProd() {
        return listProd;
    }

    public void setListProd(ArrayList<Producto> listProd) {
        this.listProd = listProd;
    }
    
    public void agregarProducto(Producto p){
        this.listProd.add(p);
    }
    public void removerProducto(Producto p){
        this.listProd.remove(p);
    }

    public int cantProducCuidados() {
        int contador = 0;

        for (Producto p : this.listProd) {
            if (p.isPreciosCuidados()) {
                contador++;
            }
        }

        return contador;
    }

    public int cantProducNecxDia() {
        int contador = 0;

        for (Producto p : this.listProd) {
            if (p.isPrimeraNec()) {
                contador++;
            }
        }

        return contador;
    }

    public double totalVentasG() {
        double total = 0.0;
        for (Producto p : this.listProd) {
            total += p.getPrecioProducto();
        }

        return total;
    }

    public double importeTotalDescuento() {
        double total = 0.0;
        for (Producto p : this.listProd) {
                total += p.calcularDesc(p.tipoProducto());

        }

        return total;
    }

}
