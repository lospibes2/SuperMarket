package poo_supermarket;
//Julieta y thomas
import java.util.ArrayList;
import java.util.Scanner;

public class Ejecutable {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Producto> listaProductos = new ArrayList<Producto>();

        listaProductos.add(new Producto("pepsi co", "pepsi black 500ml", false, false, 500));
        listaProductos.add(new Producto("pepsi co", "cheetos", true, false, 700));
        listaProductos.add(new Producto("villavicencio", "villavicencio agua 500ml", false, true, 421));
        listaProductos.add(new Producto("elite", "papel higienico", false, true, 800));
        listaProductos.add(new Producto("la serenisima", "la serenisima leche 1L", true, true, 1200));

        RegistrodeVentas registro = new RegistrodeVentas();

        boolean seguirClientes = true;
        while (seguirClientes) {
            Cliente c1 = crearC();

            boolean seguirVentas = true;
            while (seguirVentas) {
                Venta v1 = new Venta(0, "2/2/23", c1);
                boolean seguirAgregando = true;
                    v1.agregarProducto(mostrarLista(listaProductos));
                while (seguirAgregando) {
                    System.out.println("Desea agregar mas productos a la venta?\n[1]Si\n[2]No");
                    if (teclado.nextInt() == 1) {
                        v1.agregarProducto(mostrarLista(listaProductos));
                    } else {
                        seguirAgregando = false;
                    }
                }
                boolean seguirSacando = true;
                while (seguirSacando) {
                    System.out.println("Desea remover un producto de la venta?\n[1]Si\n[2]No");
                    if (teclado.nextInt() == 1) {
                        v1.removerProducto(mostrarLista(v1.getListProd()));
                    } else {
                        seguirSacando = false;
                    }
                }
                registro.agregarV(v1);
                System.out.println("Quiere hacer otra venta con el mismo cliente?\n[1]Si\n[2]No");
                if (teclado.nextInt() == 2) {
                    seguirVentas = false;
                }

            }

            System.out.println("Quiere crear otro cliente para hacer mas ventas?\n[1]Si\n[2]No");
            if (teclado.nextInt() == 2) {
                seguirClientes = false;
            }

        }
        
        System.out.println("Registros de ventas del dia:");
        System.out.println("Cantidad de productos de primera necesidad: "+registro.cantProducPrimNec());
        System.out.println("Cantidad de productos de precios cuidados: "+registro.cantProducCuidados());
        System.out.println("Total ventas generales: "+registro.totalGenerales());
        System.out.println("Total importe con descuentos: "+registro.totalDescuentos());
        
    }

    

    

    public static Producto mostrarLista(ArrayList<Producto> lista) {
        String text = "Seleccione un producto: \n";
        int index = 0;
        for (Producto p : lista) {
            text += index + ": " + p.toString() + "\n";
            index++;
        }

        System.out.println(text);
        System.out.println("Elija un Producto: ");

        int opc = teclado.nextInt();
        return lista.get(opc);
    }

    public static Cliente crearC() {
        System.out.println("Creando nuevo cliente...");
        System.out.println("Ingrese su nombre: ");
        String n = teclado.next();
        System.out.println("Ingrese su edad: ");
        int e = teclado.nextInt();
        System.out.println("Ingrese su telefono: ");
        int t = teclado.nextInt();
        System.out.println("Ingrese su dni: ");
        int d = teclado.nextInt();

        return new Cliente(n, e, t, d);
    }

}
