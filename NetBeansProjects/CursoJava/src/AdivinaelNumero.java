import java.util.Scanner;

import java.util.Random;

public class AdivinaelNumero {
    public static void main(String[] args) {
        // Crear un array de 100 números enteros
        int[] num = new int[100];
        Random random = new Random();
        
        // Llenar el array con números aleatorios entre 1 y 100
        for (int cont = 0; cont < 100; cont++) {
            num[cont] = random.nextInt(99) + 1; // Aleatorio entre 1 y 100
        }

        // Mostrar los números generados
        for (int cont = 0; cont < 100; cont++) {
            System.out.print(num[cont] + " ");
        }
        System.out.println(); // Salto de línea

        System.out.println("Adivina los numeros");

        Scanner scanner = new Scanner(System.in);
        
        boolean esCorrecto = false;

        // Permitir hasta 10 intentos para adivinar los números
        for (int intentos = 1; intentos <= 10; intentos++) {
            System.out.println("Dame 1 numero");
            int numUsuario = scanner.nextInt();
            
            

            // Recorrer el array para verificar si el número ingresado está en el arreglo
            for (int cont1 = 0; cont1 < 100; cont1++) {
                if (num[cont1] == numUsuario) {
                    num[cont1] = 0; // Si lo encuentra, lo reemplaza por 0
                    esCorrecto = true;
                    
                }
            }
            
            if(esCorrecto){
                System.out.println("Es correcto");
                break;
            }else{
                System.out.println("Es incorrecto");
            }
            
            
        } 
        
        if(!esCorrecto)
            System.out.println("Te has quedado sin intentos");
        

        scanner.close();
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    

