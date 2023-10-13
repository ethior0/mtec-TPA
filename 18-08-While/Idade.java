
import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Idade {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int i = 0, id, maior = 0, menor = 0;

        System.out.println("Insira a idade das 10 pessoas: ");

        while (i < 10) {

            id = ler.nextInt();

            if (id >= 18) {
                maior++;
            } else {
                menor++;
            }
            i++;
        }

        System.out.println("Total: 10 pessoas.");
        System.out.println("Menor(es) de idade: " + menor + " pessoa(s).");
        System.out.println("Maior(es) de idade: " + maior + " pessoa(s).");

        ler.close();
    }
}
