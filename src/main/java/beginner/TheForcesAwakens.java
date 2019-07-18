package beginner;

import java.util.Scanner;

public class TheForcesAwakens {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mY = sc.nextInt();
		int mX = sc.nextInt();
		
		int[][] matrix = new int[mY][mX];
		int[] lightSaberCords = new int[2 * (mY - 2) * (mX - 2)];
		int cord = 0;
		boolean isSaber = false;
		
		for(int i = 0; i < matrix.length; i++) {
			
			for(int j = 0; j < matrix[i].length; j++) {
				
				matrix[i][j] = sc.nextInt();
				
				if(i > 0 && j > 0 && i < matrix.length - 1 && j < matrix[i].length - 1 && matrix[i][j] == 42) {
					
					lightSaberCords[cord++] = i;
					lightSaberCords[cord++] = j;
				}
			}
		}
		
		for(int i = 0; i < cord; i = i + 2) {
			int y = lightSaberCords[i];
			int x = lightSaberCords[i + 1];
			
			if(matrix[y + 1][x - 1] == 7 && matrix[y + 1][x] == 7 && matrix[y + 1][x + 1] == 7) {
				
				if(matrix[y][x - 1] == 7 && matrix[y][x + 1] == 7) {
					
					if(matrix[y - 1][x - 1] == 7 && matrix[y - 1][x] == 7 && matrix[y - 1][x + 1] == 7) {
						
						System.out.println(String.format("%d %d", y + 1, x + 1));
						isSaber = true;
						break;
					}
				}
			}
		}
		
		if(!isSaber)
			System.out.println("0 0");
	}

}
