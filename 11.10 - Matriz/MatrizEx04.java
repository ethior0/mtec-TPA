import java.util.Random;
import java.util.Scanner;

public class MatrizEx04 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Random in = new Random();
		
		int rodada = 0, cc = 0;
		int[][] bingo = new int[4][4];
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				bingo[i][j] = in.nextInt(75);
				if (bingo[i][j] == 0) {
					bingo[i][j] = 1;
				}
//				System.out.format("[%-2d]", bingo[i][j]); output do vetor (trapaça/hack)
			}
//			System.out.println(); output do vetor (trapaça/hack) 
		}
		
		for (;;) {
			System.out.println();
			System.out.print("Informe um número (1-75): ");
			int valor = ler.nextInt();
			
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					if (valor == bingo[i][j]) {
						System.out.println("O número está presente!");
						cc++;
					} 
				}
			}
			System.out.println(cc + " de 16");
			rodada++;
			
			if (cc == 16) {
				System.out.println();
				System.out.println("BINGO");
				System.out.println("Rodadas: " + rodada);
				break;
			}
		}
	}
}
