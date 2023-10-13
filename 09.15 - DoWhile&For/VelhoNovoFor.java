import java.util.Scanner;

public class VelhoNovoFor {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int id, aAtual, aNasc, velho = 0, novo = 0;
	
			System.out.println("Qual o ano atual?");
			aAtual = ler.nextInt();
		
		for (int i = 1; i <= 3; i++) {
			
			System.out.println("Qual o ano do seu nascimento?");
			aNasc = ler.nextInt();
			
			id = aAtual - aNasc;
			if (i == 1) {
				novo = id;
			}
			
			if (id > velho) {
				velho = id;
			} else if (id < novo) {
				novo = id;
			}
			System.out.println("Você tem " + id + " anos.");
		}
		System.out.println("O mais velho do grupo tem " + velho + " anos.");
		System.out.println("O mais novo do grupo tem " + novo + " anos.");
		
		ler.close();
	}
}
