
import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class SalarioProfessor {

    public static void main(String args[]) {
        Scanner ler = new Scanner(System.in);
        double vAula, inss, salarioL, salario;
        int aula;

        System.out.println("Quanto vale a hora da aula dada:");
        vAula = ler.nextDouble();

        System.out.println("Quantas aulas foi dadas:");
        aula = ler.nextInt();

        System.out.println("Qual o valor Percentual do INSS:");
        inss = ler.nextDouble();

        salarioL = aula * vAula;

        salario = salarioL - salarioL * (inss / 100);

        System.out.println("o salário contando com o INSS é de: R$" + salario);

        ler.close();
    }
}
