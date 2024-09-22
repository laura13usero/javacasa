import java.util.Scanner;

public class GenerarTablaMultiplicar {
    public static void main(String[] srgs){
        // Variables
        int i, num, suma = 0;
        

        // Crear un objeto de la clase Scanner
        Scanner leer = new Scanner(System.in);

        // Ingresar Datos
        System.out.print("Numero: ");
        num = leer.nextInt();

        String pepito = "";
        // Solución
        i = 1;
        while (i <= num){
            pepito = pepito + "a";
            System.out.println(pepito);
            suma = suma + i;
            i++;
        }

        // Mostrar Datos
        System.out.println("");
        System.out.println("pepito es: " + pepito);
        System.out.println("Suma Final: " + suma);
    }
}


