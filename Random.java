
import java.util.Random;


public class Random {
    public static void main(String[] args) {

        Random r = new Random();
        int i = 0;

        System.out.println("Hola!");

        for (i = 1; i <= 5; i++) {

            System.out.println("i = " + r.nextInt(100));
        }
    }
}
