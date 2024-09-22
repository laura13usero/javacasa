import java.util.Scanner;

public class EjercicioVocales {
        public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
            System.out.print("Ingresa la letra: ");
            String c = leer.nextLine();
            
         if("a".equals(c) || "A".equals(c)){
             System.out.print("Es una vocal\n");
         }else if("e".equals(c) || "E".equals(c)){
             System.out.print("Es una vocal\n");
         }else if("i".equals(c) || "I".equals(c) ){
             System.out.print("Es una vocal\n");
         }else if("o".equals(c)|| "O".equals(c) ){
             System.out.print("Es una vocal\n");
         }else if("u".equals(c)|| "U".equals(c) ){
             System.out.print("Es una vocal\n");
         }else{
            System.out.println("No es una vocal\n");
         } 
     
    }
    
}
