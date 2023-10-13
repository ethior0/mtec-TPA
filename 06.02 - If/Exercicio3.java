
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Exercicio3 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        String resposta1, resposta2;
        int despacho = 0, assento = 60, vol;
        double preco;

        System.out.println("Informe o valor da passagem");
        preco = ler.nextDouble();

        System.out.println("Vai despachar bagagem?");
        resposta1 = ler.next();

        System.out.println("Quer marcar assento?");
        resposta2 = ler.next();

        if (resposta1.equalsIgnoreCase("Sim")) {
            System.out.println("Informe a quantidade de volume");
            vol = ler.nextInt();
            despacho = vol * 90;
            preco = preco + despacho;
        }

        if (resposta2.equalsIgnoreCase("Sim")) {
            preco = preco + assento;
        }

        System.out.printf("Preço final: R$ %.2f \n", preco);

        ler.close();
    }
}
