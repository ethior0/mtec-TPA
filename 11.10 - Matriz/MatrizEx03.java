import java.util.Random;
public class MatrizEx03 {

	public static void main(String[] args) {
		
	Random in= new Random();
	
	int[][] matriz= new int [3][4];
	int soma = 0;
	
	for(int i=0; i< 3; i++) {
		soma = 0;
		for(int j= 0; j< 4; j++) {
			matriz[i][j] = in.nextInt()%20; 
			if(matriz[i][j] == matriz[i][3]) {
				matriz[i][3] = soma;
			} else {
				soma += matriz[i][j];
			}
			
			System.out.format("[%-3d]", matriz[i][j]);
		}
		System.out.println();
		}
	}
}
