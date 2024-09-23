//Crea un algoritmo que recorra un rango de números (del 1 al 100) y muestre cuáles son pares y cuáles impares.


public class ParImpar {
    public static void main(String[] args) {
        
        int c = 1;

        while(c <= 100){


            System.out.println(c);


            if(c % 2 == 0){
                System.out.println("PAR");

            }else{
                System.out.println("IMPAR");

            }
            c++;


        }
 
    
    }

}
