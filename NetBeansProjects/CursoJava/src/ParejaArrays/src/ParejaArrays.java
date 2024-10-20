import java.io.IOException;
import java.util.Random;
import java.util.Scanner;




/*Mejoras

Limpiar consola para no ver el principio

controlar que si se añade el mismo numero de un error

hacer una prueba acertando todos para ver que termina bien

Que al revelar unas, quite el * del tablero (ahora solo se añade el numero)

ver que filas y columnas esten bien, es lioso al introducirlas ahora(x e y estan al reves)

*/


public class ParejaArrays {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int[][] tablero = new int[4][4];
        boolean[][] reveladas = new boolean[4][4]; // cartas descubiertas
        int intentos = 6;
        

        // Llenar el tablero con pares de números del 1 al 8
        rellenarTablero(tablero);

        //tablero inicial, se enseña el tablero tal cual
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                    System.out.print(tablero[i][j] + "\t"); 
            }
            System.out.println();
        }
        
        
        Thread.sleep(2000);
        
        System.out.println("Tablero ocultado:");
        enseñarTablero(tablero, reveladas);

        // Juego
        while (intentos > 0 && !parejasEncontradas(reveladas)) { //while continúa ejecutándose mientras se tengan intentos disponibles y no haya encontrado todas las parejas. El ciclo se repite.
            System.out.println("Introduce las coordenadas de la primera celda (x0, y0): ");
            int x0 = scanner.nextInt();
            int y0 = scanner.nextInt();

            System.out.println("Introduce las coordenadas de la segunda celda (x1, y1): ");
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();

            // Verificar si coincide la pareja
            
            
            //TODO: control mismo numero, volver a pedir numeros
            //lo que ahi aqui abajo, lo pasaria a otra funcion, y si son el mismo que no la llame, el resto de casos llamar siempre
            
            
            System.out.println("primer numero es:"+tablero[x0][y0]);
            System.out.println("segundo numero es:"+tablero[x1][y1]);
            
           
            
            if (tablero[x0][y0] == tablero[x1][y1]) {
                reveladas[x0][y0] = true;
                reveladas[x1][y1] = true;
                System.out.println("Has acertado!!");
            } else {
                intentos--;
                System.out.println("Has fallado. Te quedan " + intentos + " intentos.");
            }

            // Mostrar el tablero después de cada intento
            enseñarTablero(tablero, reveladas);
        }

        if (parejasEncontradas(reveladas)) {
            System.out.println("Felicidades!!!! Has encontrado todas las parejas.");
        } else {
            System.out.println("Se te han acabado los intentos :c");
        }

    }
    
    
    /*public static void main(String[] args) throws InterruptedException {
       while (true)
       {
           Thread.sleep(5000);
           System.out.println("espera a que se genere");
       }
   }
}*/

    // funcion 1-16
    static void rellenarTablero(int[][] board) {
        int[] array16 = new int[16];
        int num = 1;
        for (int i = 0; i < 16; i += 2) {
            array16[i] = num;
            array16[i + 1] = num;
            num++;
        }
        barajar(array16);

        // Llenar el tablero
        int otrotablero = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                board[i][j] = array16[otrotablero++];
            }
        }
        
        
        
        
    }

    // tablero cartas descubiertas
    static void enseñarTablero(int[][] tablero, boolean[][] reveladas) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (reveladas[i][j]) {
                    System.out.print(tablero[i][j]);
                } else {
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }
    }

    // funcion barajar array
    static void barajar(int[] array) {
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }

    // Verificar si encontradas
    static boolean parejasEncontradas(boolean[][] reveladas) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (!reveladas[i][j]) {
                    return false;
                }
            }
        }
        return true;
        
        
    }
    
    
    
   

}
