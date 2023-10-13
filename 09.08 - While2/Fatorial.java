
import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Fatorial {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        long s = 1;

        System.out.print("Escreva o número: ");
        int f = ler.nextInt();

        int i = f;
        while (i > 1) {
            s = s * i;
            i--;
        }

        System.out.println(f + "! = " + s);

        ler.close();
    }
}
