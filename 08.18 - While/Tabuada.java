
import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Tabuada {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int i = 1, t;

        System.out.print("Insira um número: ");
        int n = ler.nextInt();

        while (i <= 10) {
            t = n * i;
            System.out.printf("%2d x %2d = %2d\n", n, i, t);
            i++;
        }

        ler.close();
    }
}
