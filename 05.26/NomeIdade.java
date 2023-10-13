
import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class NomeIdade {

    public static void main(String args[]) {

        Scanner ler = new Scanner(System.in);
        int idade, anoA, anoN;
        String nome;

        System.out.println("Escreva seu nome:");
        nome = ler.next();

        System.out.println("Escreva o ano atual:");
        anoA = ler.nextInt();

        System.out.println("Escreva o seu ano de nascimento:");
        anoN = ler.nextInt();

        idade = anoA - anoN;

        System.out.println(nome + " a sua idade é de " + idade + " anos.");
        ler.close();

    }

}
