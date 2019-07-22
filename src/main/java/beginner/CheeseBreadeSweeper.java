package beginner;

import java.util.Scanner;

public class CheeseBreadeSweeper {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int height = sc.nextInt();
			int length = sc.nextInt();
			
			int[][] matrix = new int[height][length];
			
			for(int i = 0; i < height; i++) {
				for(int j = 0; j < length; j++) {
					matrix[i][j] = sc.nextInt();
				}
			}
			
			
			for(int i = 0; i < height; i++) {
				for(int j = 0; j < length; j++) {
					int sum = 0;
					if(matrix[i][j] == 1) {
						System.out.print("9");;
						continue;
					}
					
					if(i > 0 && matrix[i - 1][j] == 1)
						sum++;
					
					if(i < matrix.length - 1 && matrix[i + 1][j] == 1)
						sum++;
					
					if(j > 0 && matrix[i][j - 1] == 1)
						sum++;
					
					if(j < matrix[i].length - 1 && matrix[i][j + 1] == 1)
						sum++;
					
					System.out.print(sum);
				}
				System.out.println("");
			}
			
		}
		sc.close();
	}

}
