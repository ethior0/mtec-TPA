
import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class CelsiusFahrenheit {

    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);
        double f, c;

        System.out.println("Escreva a temperatura em Fahrenheit:");
        f = ler.nextDouble();
        c = (f - 32) * 5 / 9;

        System.out.println("A temperatura em graus Celsius é de " + c);
        ler.close();

    }
}
