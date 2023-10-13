
import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author Thiago
 */
public class Exercicio2 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        double s, i = 0;

        System.out.println("Insira seu salário");
        s = ler.nextDouble();

        if (s <= 1903.98) {
            System.out.println("Imposto de renda: R$ " + 0);
        } else if (s <= 2826.65) {
            i = (s / 100 * 7.5) - 142.80;
            System.out.println("Imposto de renda: R$ " + i);
        } else if (s <= 3751.05) {
            i = (s / 100 * 15) - 354.80;
            System.out.println("Imposto de renda: R$ " + i);
        } else if (s <= 4664.68) {
            i = (s / 100 * 22.5) - 636.13;
            System.out.println("Imposto de renda: R$ " + i);
        } else {
            i = (s / 100 * 27.5) - 869.36;
            System.out.println("Imposto de renda: R$ " + i);
        }

        ler.close();
    }
}
