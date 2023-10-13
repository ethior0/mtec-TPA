
import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Ex1 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.print("Informe a sua idade: ");
        int idade = ler.nextInt();

        switch (idade) {
            case 6:
                System.out.println("Você é da categoria dente de leite");
                break;
            case 7:
                System.out.println("Você é da categoria júnior");
                break;
            case 8:
                System.out.println("Você é da categoria júnior max");
                break;
            case 9:
                System.out.println("Você é da categoria júnior master");
                break;
            case 10:
                System.out.println("Você é da categoria master");
                break;
            default:
                System.out.println("Categoria inexistente");
        }

        ler.close();
    }
}
