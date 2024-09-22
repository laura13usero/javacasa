
import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa un numero: ");
        int n1 = leer.nextInt();
        
        
        System.out.println("Ingresa otro numero: ");
        int n2 = leer.nextInt();
        
        
        if(n1>n2){
            System.out.println(n1+" es Mayor");
        }else if(n2>n1){
            System.out.printf("%d es Mayor", n2);
             
        }   
        
    }
    
}
