import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		final int TAM = 10;
		int a[] = new int[TAM];
		int r = 0;
		int m;

		for (int i = 0; i < TAM; i++) {
			System.out.print("Escreva o " + (i + 1) + "o valor de A: ");
			a[i] = ler.nextInt();
			r = a[i] + r;
		}
		
		m = r / TAM;
		System.out.println("Média: " + m);

		ler.close();
	}
}
