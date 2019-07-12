package beginner;

import java.util.Scanner;

public class SquareArray4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size;
		
		while(sc.hasNext()) {
			size = sc.nextInt();
			
			int[][] matrix = new int[size][size];
			
			fillCenter(matrix);
			fillTopBottom(matrix);
			
			for(int i = 0; i < matrix.length; i++) {
				for(int j = 0; j < matrix[i].length; j++) {
					if(j == matrix[i].length - 1)
						System.out.println(matrix[i][j]);
					else
						System.out.print(matrix[i][j]);
				}
			}
			System.out.println("");
			
		}
	}
	
	public static void fillCenter(int[][] matrix) {
		
		int startIndex = matrix.length/3;
		
		for(int i = startIndex; i <= (matrix.length - (startIndex + 1)); i++ ) {
			
			for(int j  = startIndex; j <= (matrix.length - (startIndex + 1)); j++) {
				
				matrix[i][j] = 1;
				
			}
			
		}
		
		matrix[matrix.length/2][matrix.length/2] = 4;
		
	}
	
	public static void fillTopBottom(int[][] matrix) {
		
		for(int i = (matrix.length / 3) - 1; i >= 0; i--) {
			
			matrix[i][i] = 2;
			matrix[i][matrix.length - (i + 1)] = 3;
			matrix[matrix.length - (i + 1)][i] = 3;
			matrix[matrix.length - (i + 1)][matrix.length - (i + 1)] = 2;
		}
		
		
		
		
	}
	
}
