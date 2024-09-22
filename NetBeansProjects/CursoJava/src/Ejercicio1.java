
import java.util.Scanner; 
        
public class Ejercicio1 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int n1 = leer.nextInt();
        
        System.out.println("Ingrese el segundo numero: ");
        int n2 = leer.nextInt();
        
        int suma = n1+n2;
        System.out.println("La suma de ambos numeros es: " + suma );
      
    }    
}
