
import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Ex4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a;

        System.out.print("Insira o código do produto: ");
        a = in.nextInt();

        switch (a) {
            case 1:
                System.out.println("Cachorro Quente: R$ 8,00");
                break;
            case 2:
                System.out.println("Chesseburguer: R$ 12,00");
                break;
            case 3:
                System.out.println("X-salada: R$ 15,00");
                break;
            case 4:
                System.out.println("Misto Quente: R$ 11,00");
                break;
            case 5:
                System.out.println("Pão na Chapa: R$ 6,00");
                break;
            default:
                System.out.println("Código Inexistente");
        }

        in.close();
    }
}
