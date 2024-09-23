
import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
 
       
        System.out.println("Ingresa un numero: ");
        int n = leer.nextInt();
        int i = 1; 
        while(i <= 10){
           
            
            //System.out.println(i + "x" + n1 + "=" + n1*i);
            System.out.printf("%d x %d = %d \n", i, n, n*i);
            
            i++;
  
        
        }
        
        
    }
    
}
//1x3 = 3