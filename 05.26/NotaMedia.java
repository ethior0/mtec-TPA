
import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class NotaMedia {

    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);
        double n1, n2, n3, n4, media;

        System.out.println("Escreva sua primeira nota:");
        n1 = ler.nextDouble();

        System.out.println("Escreva sua segunda nota:");
        n2 = ler.nextDouble();

        System.out.println("Escreva sua terceira nota:");
        n3 = ler.nextDouble();

        System.out.println("Escreva sua quarta nota:");
        n4 = ler.nextDouble();

        media = (n1 + n2 + n3 + n4) / 4;
        System.out.println("A sua média é de " + media);
        ler.close();
    }
}
