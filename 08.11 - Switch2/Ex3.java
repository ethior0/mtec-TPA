
import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Ex3 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double p;

        System.out.println("Insira a quantidade de alunos:");
        int q = ler.nextInt();

        System.out.println("Escolha a menção: (MB-B-R-I)");
        String m = ler.next();

        String n = m.toUpperCase();

        System.out.println("Quantos alunos têm essa menção:");
        int a = ler.nextInt();

        if (a > q) {
            System.out.println("Inválido");
        } else {
            p = (double) a / q * 100;

            switch (n) {
                case "MB":
                    System.out.printf("%.1f%% dos alunos têm MB", p);
                    break;

                case "B":
                    System.out.printf("%.1f%% dos alunos têm B", p);
                    break;

                case "R":
                    System.out.printf("%.1f%% dos alunos têm R", p);
                    break;

                case "I":
                    System.out.printf("%.1f%% dos alunos têm I", p);
                    break;

                default:
                    System.out.println("Menção inválida!");
            }
        }

        ler.close();
    }
}
