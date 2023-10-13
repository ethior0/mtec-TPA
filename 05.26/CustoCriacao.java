
import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class CustoCriacao {

    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);
        int num_coelhos;
        double custo;

        System.out.println("Insira a quantidade de coelhos:");
        num_coelhos = ler.nextInt();
        custo = (num_coelhos * 0.70) / 18 + 10;

        System.out.println("O custo para a criação é de " + custo);
        ler.close();

    }
}
