
    import java.util.Random;

public class Matrices {

    public static void main(String[] args) {
        int[][] matriz = new int[2][2]; //Crear un matriz de 5 x 5
        Random rand = new Random();
        int sumaDiagonales = 0;
        int sumaUltimaFila = 0; 

        // Llenar la matriz con números aleatorios entre 1 y 100
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matriz[i][j] = rand.nextInt(2) + 1;
            }
        }

        // Mostrar la matriz
        System.out.println("Matriz:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Mostrar en consola el promedio de la matriz.
        int sumaTotal = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sumaTotal += matriz[i][j];
            }
        }
        double promedio = sumaTotal / 4.0;
        System.out.println("\nPromedio de la matriz: " + promedio);

        // Mostrar en consola el número mayor y la cantidad de veces que este se repite.
        int numeroMayor = matriz[0][0];
        int repeticiones = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (matriz[i][j] > numeroMayor) {
                    numeroMayor = matriz[i][j];
                    repeticiones = 1;
                } else if (matriz[i][j] == numeroMayor) {
                    repeticiones++;
                }
            }
        }
        System.out.println("\nNumero mayor: " + numeroMayor + ", se repite " + repeticiones + " veces");

        // Mostrar en consola todos los números primos.
        System.out.println("\nNumeros primos:"); 
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (esPrimo(matriz[i][j])) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
        System.out.println();

        // Mostrar en consola todos los números pares
        System.out.println("\nNumeros pares:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (matriz[i][j] % 2 == 0) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
        System.out.println();

        // Mostrar en consola la suma de las diagonales
        for (int i = 0; i < 2; i++) {
            sumaDiagonales += matriz[i][i]; // Diagonal 1
            sumaDiagonales += matriz[i][1 - i]; // Diagonal 2
        }
        System.out.println("\nSuma de las diagonales: " + sumaDiagonales);

        // Mostrar en consola la suma de la la última fila
        for (int j = 0; j < 2; j++) {
            sumaUltimaFila += matriz[1][j];
        }
        System.out.println("Suma de la ultima fila: " + sumaUltimaFila);

        // Mostrar en consola el mensaje "Cuadrado Mágico" si la matriz cataloga como un cuadrado mágico
        if (esCuadradoMagico(matriz)) {
            System.out.println("\nEs un Cuadrado Magico!!!!!!!!!!!!!!!!!!");
        } else {
            System.out.println("\nNo es un Cuadrado Magico :c");
        }
    }

    // Mostrar en consola todos los números primos.
    public static boolean esPrimo(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Método para comprobar si una matriz es un cuadrado mágico
    public static boolean esCuadradoMagico(int[][] matriz) {
        int sumaMagica = 0;
        for (int i = 0; i < 2; i++) {
            sumaMagica += matriz[0][i];
        }

        // Comprobar filas del cuadrado 
        for (int i = 1; i < 2; i++) {
            int sumaFila = 0;
            for (int j = 0; j < 2; j++) {
                sumaFila += matriz[i][j];
            }
            if (sumaFila != sumaMagica) {
                return false;
            }
        }

        // Columnas para cuadrado magico :(
        for (int j = 0; j < 2; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < 2; i++) {
                sumaColumna += matriz[i][j];
            }
            if (sumaColumna != sumaMagica) {
                return false;
            }
        }

        // Diagonales cuadrado magico :)
        int sumaDiagonal1 = 0, sumaDiagonal2 = 0;
        for (int i = 0; i < 2; i++) {
            sumaDiagonal1 += matriz[i][i];
            sumaDiagonal2 += matriz[i][1 - i];
        }
        return sumaDiagonal1 == sumaMagica && sumaDiagonal2 == sumaMagica;
    }
}

        
 
    
