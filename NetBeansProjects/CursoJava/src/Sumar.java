
/*import java.util.Scanner; 
        
public class Sumar {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int n1 = leer.nextInt();
        
        System.out.println("Ingrese el segundo numero: ");
        int n2 = leer.nextInt();
        
        int suma = n1+n2;
        System.out.println("La suma de ambos numeros es: " + suma );
        
      
    }    
}*/

import java.util.Scanner; 
public class Sumar {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
       
        System.out.println("Ingresa el primer numero: ");
        int num1 = leer.nextInt();
        
        System.out.println("Ingresa el segundo numero");
        int num2 = leer.nextInt();
        
        
        
        System.out.println(" ");
        System.out.println("Suma: "+FuncionSumar(num1,num2));
        System.out.println("Resta: "+(num1-num2));
        
        
    }
    
    
    public static int FuncionSumar(int n1, int n2){
    
        return n1 + n2;
    }

}