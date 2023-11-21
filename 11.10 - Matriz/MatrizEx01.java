
public class MatrizEx01 {

	public static void main(String[] args) {
		
		int[][] matriz = new int[4][4];
		int dobro = 1;
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				
				matriz[i][j] = dobro * 2;
				dobro = matriz[i][j];
				
				System.out.format("[%-5d] ", matriz[i][j]);
			}
			System.out.println();
		}
	}
}
