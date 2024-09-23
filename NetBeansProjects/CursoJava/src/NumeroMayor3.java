import java.util.Scanner;

public class NumeroMayor3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        
        System.out.println("Ingresa un numero: ");
        int n1 = leer.nextInt();
        System.out.println("Ingresa el segundo numero: ");
        int n2 = leer.nextInt();
        System.out.println("Ingresa el tercer numero: ");
        int n3 = leer.nextInt();
        
        
        if((n1>n2)&&(n1>n3)){
            System.out.println(n1 + " es mayor");
    
        }else if((n2>n1)&&(n2>n3)){
            System.out.println(n2 + " es mayor");
        }else{
            System.out.println(n3 + " es mayor");
        }
            
            
            
            
       /* }else if(n1>n3){
            System.out.println(n1 + " es mayor");
        }else if(n2>n1){
            System.out.println(n2 + " es mayor");
        }else if(n2>n3){
            System.out.println(n2 + " es mayor");
        }else if(n3>n1){
            System.out.println(n3 + " es mayor");           
        }else if(n3>n2){
            System.out.println(n3 + " es mayor");
        }*/
        
  
        
    }
    
}
