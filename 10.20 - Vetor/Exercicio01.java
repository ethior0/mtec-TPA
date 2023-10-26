import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		final int TAM = 10;
		int a[] = new int[TAM];
		int b[] = new int[TAM];

		for (int i = 0; i<TAM; i++) {
			System.out.print("Digite o "+(i+1)+"o valor de A: ");
			a[i] = ler.nextInt();
		}
		
		System.out.print("B[] = [ ");
		for (int j = 0; j<TAM; j++) {
			b[j] = a[j] * a[j];
			System.out.print(b[j]+" ");
		}
		System.out.print("]");
		
		ler.close();
	}
}
