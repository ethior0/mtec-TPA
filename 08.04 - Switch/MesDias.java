
import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class MesDias {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.print("Escreva o número do mês: ");
        int m = ler.nextInt();

        switch (m) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 dias");
                break;
            case 2:
                System.out.println("28 dias");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 dias");
                break;
            default:
                System.out.println("Mês inválido");
        }

        ler.close();
    }
}
