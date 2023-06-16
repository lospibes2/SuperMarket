package poo_supermarket;
//Julieta y thomas
import java.util.ArrayList;

public class RegistrodeVentas {

    ArrayList<Venta> listVenta = new ArrayList<Venta>();

    public RegistrodeVentas() {
    }

    public void agregarV(Venta v) {
        this.listVenta.add(v);
    }

    public int cantProducCuidados() {
        int cant = 0;

        for (Venta v : this.listVenta) {
            cant += v.cantProducCuidados();
        }
        return cant;

    }

    public int cantProducPrimNec() {
        int cant = 0;

        for (Venta v : this.listVenta) {
            cant += v.cantProducNecxDia();
        }
        return cant;

    }
    
    public double totalGenerales(){
        double total = 0;
        
        for (Venta v: this.listVenta){
            total+=v.totalVentasG();
        }
        
        return total;
    }
    public double totalDescuentos(){
        double total = 0;
        
        for (Venta v: this.listVenta){
            total+=v.importeTotalDescuento();
        }
        
        return total;
    }
}
