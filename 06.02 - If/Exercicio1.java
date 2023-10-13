
import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author Thiago
 */
public class Exercicio1 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        String estudante;
        double ingresso;

        System.out.println("Qual é o preço do ingresso?");
        double preco = ler.nextDouble();

        System.out.println("Você é um estudante?");
        estudante = ler.next();

        if (estudante.equalsIgnoreCase("Sim")) {
            ingresso = preco * 0.5;
            System.out.printf("O novo valor do ingresso é R$%.2f\n", ingresso);
        } else {
            System.out.printf("O valor do ingresso é R$%.2f\n", preco);
        }

        ler.close();
    }
}
