
//Saca por consola un ingreso de un valor de venta al que se le calcula
//el IVA y te cree un total con dicho IVA
        
import java.util.Scanner; 

public class Ejercicio {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
    //Valor Venta
    System.out.println("Ingresa el valor de Venta: ");
    double valorVenta = leer.nextDouble(); 
    
    //Valor IVA  
    double iva = valorVenta * 0.18; 
    
    //Valor total
    
    double total = iva + valorVenta; 
    
        System.out.println("IVA anadido: "+iva);
        System.out.println("Valor total: "+total);
        
    
    
  
    
}
}
