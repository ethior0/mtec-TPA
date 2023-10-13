
import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Potencia {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite a base: ");
        int b = ler.nextInt();
        System.out.print("Digite o expoente: ");
        int ex = ler.nextInt();

        long res = b;
        int i = 1;

        while (i < ex) {
            res = res * b;
            i++;
        }

        System.out.println("Resultado: " + res);

        ler.close();
    }
}
