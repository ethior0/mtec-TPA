
import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Placa {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.print("Escreva o último dígito da sua placa: ");
        int n = ler.nextInt();

        switch (n) {
            case 1:
            case 2:
                System.out.println("O dia que o veículo não poderá circular será segunda-feira");
                break;
            case 3:
            case 4:
                System.out.println("O dia que o veículo não poderá circular será terça-feira");
                break;
            case 5:
            case 6:
                System.out.println("O dia que o veículo não poderá circular será quarta-feira");
                break;
            case 7:
            case 8:
                System.out.println("O dia que o veículo não poderá circular será quinta-feira");
                break;
            case 9:
            case 0:
                System.out.println("O dia que o veículo não poderá circular será sexta-feira");
                break;
            default:
                System.out.println("Dígito inválido");
        }

        ler.close();
    }
}
