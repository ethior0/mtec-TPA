import java.util.Locale;
import java.util.Scanner;

public class PesoDoWhile {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		int res;
		double i;
		
		do {
			System.out.print("Informe o seu sexo (M ou F): ");
			String s = ler.next();
			System.out.print("Informe o seu peso em quilogramas: ");
			double p = ler.nextDouble();
			System.out.print("Informe a sua altura em centímetros: ");
			double a = ler.nextDouble();
			
			if (s.equalsIgnoreCase("M")) {
				i = 52 + (0.75 * (a - 152.4));
			} else {
				i = 52 + (0.67 * (a - 152.4));
			}
			System.out.printf("Seu peso ideal é: %.2f kg\n", i);
			
			System.out.println("Informe se quer continuar (1- Sim / 2- Não)");
			res = ler.nextInt();
		} while (res == 1);
		
		System.out.println("---- Fim do programa ----");
		
		ler.close();
	}
}
