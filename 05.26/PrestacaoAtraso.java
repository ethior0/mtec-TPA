
import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class PrestacaoAtraso {

    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);
        double valor, taxa, prestacao;
        int tempo;

        System.out.println("Coloque o Valor original da Prestação:");
        valor = ler.nextDouble();

        System.out.println("Coloque o Valor da taxa de juros:");
        taxa = ler.nextDouble();

        System.out.println("Coloque a Quantidade de dias que a Prestação está atrasada:");
        tempo = ler.nextInt();

        prestacao = valor + (valor * (taxa / 100) * tempo);

        System.out.println("O valor da Prestação com juros e de: R$" + prestacao);
    }
}
