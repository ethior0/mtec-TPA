
import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Salario {

    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);
        double salario, divida;

        System.out.println("Escreva seu salario em reais:");
        salario = ler.nextDouble();
        divida = salario * 0.3;

        System.out.println("O valor máximo que você pode gastar com dívidas é de R$" + divida);
        ler.close();

    }
}
