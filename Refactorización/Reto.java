
package Refactorización;
import java.util.Scanner;

public class Reto {


    public static boolean ventaEstaActivada(int opcionFinVenta) {
        boolean ventaActivada;
        if(opcionFinVenta == 1) {
        ventaActivada = true;
        }else if(opcionFinVenta == 2) {
        ventaActivada = false;
        }else {
        ventaActivada = false;
        }
        return ventaActivada;
        }
        //En este caso la refactrorización es de inline, donde se puede ver que el metodo de arriba es más extenso, lop cual lo hace mucho más tedioso de hacer
        public static boolean ventaEstaActivadaS(int opcionFinVenta) {
            return opcionFinVenta == 1;
           }
           
           
}
    // public static void main(String[] args) {
        
    //     int valPerro = 2000, valHamburguesa = 3000, cantPerro = 0, cantHamburguesa = 0,
    //     proSel = 0, cant, selFin = 0, total, totalPer = 0, totalHamb = 0;
    //     boolean initTrans = true;
    //      Scanner entradaEscaner = new Scanner (System.in);
        
    //      System.out.println("Venta de perros y hamburguesas");
    //      while(initTrans){
    //      proSel = extracted(entradaEscaner);
    //      System.out.println("Indique cantidad: ");
    //      cant = Integer.parseInt(entradaEscaner.nextLine());
    //      if (proSel == 1) {
    //      cantPerro = cantPerro + cant;
    //      }else if (proSel == 2){
    //      cantHamburguesa = cantHamburguesa + cant;
    //      } else {
    //      break;
    //      }
    //      System.out.println("Desea finalizar o agregar otro producto ?");
    //      System.out.println("1. Agregar \n2. Finalizar");
    //      selFin = Integer.parseInt(entradaEscaner.nextLine());
    //      if(selFin == 1) {
    //      initTrans = true;
    //      }else if (selFin == 2) {
    //      initTrans = false;
    //      }else {
    //      break;
    //      }
    //      }
    //      totalHamb = valHamburguesa*cantHamburguesa;
    //      totalPer = valPerro*cantPerro;
    //      total = totalHamb + totalPer;
    //      System.out.println("Total: "+total);
         

    // private static int extracted(Scanner entradaEscaner) {
    //     int proSel;
    //     System.out.println("Seleccione producto: ");
    //      System.out.println("1. Perro \n2. Hamburguesa");
    //      proSel = Integer.parseInt(entradaEscaner.nextLine());
    //     return proSel;
    // }
    //     }


    //     public class Prueba {
    //         public static void main(String[] args) {
    //         Venta.iniciarVenta();
    //         Venta.finalizarVenta();
    //         }
    //        }
    //         public static int cantidadDePerroSeleccinada = 0;
    //         public static int cantidadDeHamburguesaSeleccionada = 0;
    //         public static void iniciarVenta() {
    //         Scanner scanner = new Scanner (System.in);
    //         boolean ventaActivada = true;
    //         int productoSeleccionado;
    //         int cantidadDeProductoSeleccionado;
    //         int opcionFinVenta;
    //         System.out.println("Venta de perros y hamburguesas");
    //         while(ventaActivada){
    //         productoSeleccionado =
    //        Consola.obtenerProductoSeleccionado(scanner);
    //         cantidadDeProductoSeleccionado =
    //        Consola.obtenerCantidadDeProductoSeleccionado(scanner);
    //         aumentarProducto(productoSeleccionado,
    //        cantidadDeProductoSeleccionado);
    //         opcionFinVenta = Consola.obtenerOpcionFinVenta(scanner);
    //         ventaActivada = ventaEstaActivada(opcionFinVenta);
    //         }
    //         }
    //         public static void aumentarProducto(int productoSeleccionado, int
    //        cantidadDeProductoSeleccionado) {
    //         if (productoSeleccionado == 1) {
    //         cantidadDePerroSeleccinada = cantidadDePerroSeleccinada +
    //        cantidadDeProductoSeleccionado;
    //         }else if(productoSeleccionado == 2){
    //         cantidadDeHamburguesaSeleccionada =
    //        cantidadDeHamburguesaSeleccionada + cantidadDeProductoSeleccionado;
    //         }
    //         }
            
    //         public static boolean ventaEstaActivada(int opcionFinVenta) {
    //             boolean ventaActivada;
    //             if(opcionFinVenta == 1) {
    //             ventaActivada = true;
    //             }else if(opcionFinVenta == 2) {
    //             ventaActivada = false;
    //             }else {
    //             ventaActivada = false;
    //             }
    //             return ventaActivada;
    //             }
    //             public static void finalizarVenta() {
    //             int precioTotalHamburguesa;
    //             int precioTotalPerro;
    //             int precioTotalVenta;
    //             int PRECIO_PERRO = 2000;
    //             int PRECIO_HAMBURGUESA = 3000;
    //             precioTotalHamburguesa = PRECIO_HAMBURGUESA *
    //            cantidadDeHamburguesaSeleccionada;
    //             precioTotalPerro = PRECIO_PERRO * cantidadDePerroSeleccinada;
    //             precioTotalVenta = precioTotalHamburguesa + precioTotalPerro;
    //             System.out.println("Total: "+ precioTotalVenta);
    //             }
               
            //    public class Consola {
            //     public static int obtenerOpcionFinVenta(Scanner scanner) {
            //     int opcionFinVenta;
            //     System.out.println("Desea finalizar o agregar otro producto ?");
            //     System.out.println("1. Agregar \n2. Finalizar");
            //     opcionFinVenta = Integer.parseInt(scanner.nextLine());
            //     return opcionFinVenta;
            //     }
            //     public static int obtenerCantidadDeProductoSeleccionado(Scanner
            //    scanner) {
            //     int cantidadDeProductoSeleccionado;
            //     System.out.println("Indique cantidad: ");
            //     cantidadDeProductoSeleccionado =
            //    Integer.parseInt(scanner.nextLine());
            //     return cantidadDeProductoSeleccionado;
            //     }
            //     public static int obtenerProductoSeleccionado(Scanner scanner) {
            //     int productoSeleccionado;
            //     System.out.println("Seleccione producto: ");
            //     System.out.println("1. Perro \n2. Hamburguesa");
            //     productoSeleccionado = Integer.parseInt(scanner.nextLine());
            //     return productoSeleccionado;
            //     }
            //    }
               