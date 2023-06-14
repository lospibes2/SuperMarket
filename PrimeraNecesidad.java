
package poo_supermarket;

public class PrimeraNecesidad extends Producto{
    private double desc;

    public PrimeraNecesidad(double desc) {
        this.desc = desc;
    }
    
    static String tipoProducto = null;
    
    public String AsignarTipoProducto(){
        int cantProducPrimNec = 0;
        int cantProducPrecCuid = 0;
        
        if("precios cuidados".equalsIgnoreCase(tipoProducto)){
            tipoProducto = "precios cuidados";
            System.out.println("Producto tipo " + tipoProducto);
            cantProducPrecCuid ++;
        }
        
        if("primera necesidad".equalsIgnoreCase(tipoProducto)){
            tipoProducto = "primera necesidad";
            System.out.println("Producto tipo " + tipoProducto);
            cantProducPrimNec ++;
        }
        
         if("ninguno".equalsIgnoreCase(tipoProducto)){
            tipoProducto = "ninguno";
            System.out.println("Producto tipo " + tipoProducto);
            
        return tipoProducto;
        
    }
    public double calcularDesc(String tipoProducto){
         if("primera necesidad".equalsIgnoreCase(tipoProducto)){
             desc = this. * 10 / 100;
             precioProducto = precioProducto - desc;
         }
         
        return desc;
        
    }
}
        