//Thomas y julieta
package poo_supermarket;

public class PrimeraNecesidad extends Producto{
    private double desc;

    public PrimeraNecesidad(double desc, String marca, String nombre, boolean preciosCuidados, boolean primeraNec, double precioProducto) {
        super(marca, nombre, preciosCuidados, primeraNec, precioProducto);
        this.desc = desc;
    }


    
    static String tipoProducto = null;
    
    public String AsignarTipoProducto(){
        int cantProducPrimNec = 0;
        int cantProducPrecCuid = 0;
        
        if("precios cuidados".equalsIgnoreCase(tipoProducto)){
            System.out.println("Producto tipo " + tipoProducto);
            cantProducPrecCuid ++;
        }
        
        if("primera necesidad".equalsIgnoreCase(tipoProducto)){
            System.out.println("Producto tipo " + tipoProducto);
            cantProducPrimNec ++;
        }
        
         if("ninguno".equalsIgnoreCase(tipoProducto)){
            System.out.println("Producto tipo " + tipoProducto);
            
        
    }
                 return tipoProducto;

    }
    
    public double calcularDesc(String tipoProducto){
        double newPrecio=0;
         if("primera necesidad".equalsIgnoreCase(tipoProducto)){
            desc = precioProducto * 10 / 100;
            newPrecio= this.precioProducto - desc;
         }
         
        return newPrecio;
        
    }
}
        