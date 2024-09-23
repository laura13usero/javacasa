import java.util.Scanner;

public class Suma {
	public static void main(String [] args){
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingresa el primer numero: ");
            int n1 = leer.nextInt();
        
            System.out.println("Ingresa el segundo numero: ");
            int n2 = leer.nextInt();
            
           int suma = n1+n2;
            
            System.out.printf("Esta es la suma: %d\n",suma);	
	
	}
		
	
} 