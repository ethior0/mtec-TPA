import java.util.Random;

public class MatrizEx02 {

	public static void main(String[] args) {
		
		Random in = new Random();

		int max = 0, min = 0, linMa = 0, colMa = 0, linMe = 0, colMe = 0;
		int[][] matriz = new int[3][3];
 		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3;j ++) {
				matriz[i][j] = in.nextInt()%50;
		
				if (matriz[i][j] < min) {
					min = matriz[i][j];
					linMe = i;
					colMe = j;
				}
				if (matriz[i][j] > max) {
					max = matriz[i][j];
					linMa = i;
					colMa = j;
				}
				
				System.out.format("[%-3d] ", matriz[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("Maior valor: " + max + " na linha " + (linMa+1) + " coluna " + (colMa+1));
		System.out.println("Menor valor: " + min + " na linha " + (linMe+1) + " coluna " + (colMe+1));
		
	}
}
