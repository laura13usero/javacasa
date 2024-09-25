import java.util.Random;
import java.util.Scanner;

public class MoscaCojonera {

    // Dimensiones de la matriz
    public static final int SIZE = 10;
    
    public static void main(String[] args) {
        // Crear tablero 10x10
        char[][] tablero = new char[SIZE][SIZE];
        llenarMatriz(tablero);
        
        // Coordenada random para la mosca
        Random random = new Random();
        int[] mosca = {random.nextInt(SIZE), random.nextInt(SIZE)};  // Coordenadas de la mosca
        
        // Lógica del juego
        jugar(tablero, mosca);
    }

    // Llenar la tablero con 'X'
    public static void llenarMatriz(char[][] tablero) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                tablero[i][j] = 'X';  // Llenar cada celda con "X"
            }
        }
    }

    // Método principal
    public static void jugar(char[][] tablero, int[] mosca) {
        Scanner scanner = new Scanner(System.in);
        boolean encontrada = false;
        int intentos = 0;

        System.out.println("Bienvenidos al juego de la mosca.");
        System.out.println("La mosca esta escondida en alguna celda de la matriz 10x10.");

        while (!encontrada) {
            // Mostrar el tablero
            imprimirMatriz(tablero);

            // Pedir coordenadas al usuario
            System.out.print("Introduce la coordenada X (0-9): ");
            int intentoX = scanner.nextInt();
            System.out.print("Introduce la coordenada Y (0-9): ");
            int intentoY = scanner.nextInt();

            intentos++;

            // Verificar si las coordenadas coinciden con la mosca
            if (intentoX == mosca[0] && intentoY == mosca[1]) {
                encontrada = true;
                tablero[intentoX][intentoY] = 'M';  // Colocar la mosca en el tablero
                System.out.println("Ueee has encontrado la mosca en " + intentos + " intentos.");
            } else {
                // Pistas
                System.out.println("Fallaste. Aqui tienes una pista:");
                darPista(intentoX, intentoY, mosca);
            }
        }

        // Mostrar el tablero final con la mosca localizada
        imprimirMatriz(tablero);
    }

    // Pistas bucles
    public static void darPista(int intentoX, int intentoY, int[] mosca) {
        String[] pistas = {"mss arriba", "mas abajo", "y mas a la izquierda", "y mas a la derecha"};
        StringBuilder pista = new StringBuilder();

        // Comparar las coordenadas y crear pistas
        int[][] comparaciones = {{intentoX, mosca[0]}, {intentoY, mosca[1]}};
        for (int i = 0; i < comparaciones.length; i++) {
            int intento = comparaciones[i][0];
            int moscaPos = comparaciones[i][1];

            if (intento > moscaPos) {
                if (i == 0) pista.append(pistas[0]).append(" ");
                else pista.append(pistas[2]).append(" ");
            } else if (intento < moscaPos) {
                if (i == 0) pista.append(pistas[1]).append(" ");
                else pista.append(pistas[3]).append(" ");
            }
        }

        System.out.println("La mosca esta " + pista.toString().trim() + ".");
    }

    // Imprimir tablero en consolaa
    public static void imprimirMatriz(char[][] tablero) {
        System.out.println("Tablero actual:");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}