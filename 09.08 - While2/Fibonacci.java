
import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Fibonacci {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int i = 0, a = 0, b = 1, c = 1;

        System.out.print("Digite o número: ");
        int n = ler.nextInt();

        while (i < n) {
            a = b;
            b = c;
            c = a + b;

            if (i == n - 1) {
                System.out.println(a);
            } else {
                System.out.print(a + ", ");
            }
            i++;
        }

        ler.close();
    }
}
