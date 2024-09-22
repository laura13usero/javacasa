import java.util.Scanner;

public class ValorVenta {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingresa el valor de venta: ");
        
        //Valor Venta
        double valorVenta = leer.nextDouble();
        
        //IVA 18%
        double iva = valorVenta * 0.18; 
        
        //precio venta
        double precioVenta = valorVenta + iva;
        
        System.out.println("Valor de Venta: "+valorVenta);
        System.out.println("IVA: "+iva);
        System.out.println("Total: "+precioVenta);
        
        
        
        //Saca por consola un ingreso de un valor de venta al que se le calcule
        //el IVA y te cree un total con dicho IVA
        
        
        
      }
        
}
