import java.util.Scanner; 

public class Condicionales {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        int n = leer.nextInt();
        
        if(n != 0){
            if(n>0){
            if(n % 2 == 0){
                System.out.printf("%d es par positivo\n", n);
            }else{ 
                System.out.printf("%d es impar positivo\n", n);
            }  
            }else{
            if(n % 2 == 0){
                System.out.printf("%d es par negativo\n", n);
            }else{ 
                System.out.printf("%d es impar negativo\n", n);
            }  
            }
                
        }else{
            System.out.printf("El numero %d es NEUTRO\n", n);
        }        
    }
    
}
