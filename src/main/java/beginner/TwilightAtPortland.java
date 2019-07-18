package beginner;

import java.util.Scanner;

public class TwilightAtPortland {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int matrixSize = sc.nextInt();
		
		int[][] cameras = new int[matrixSize + 1][matrixSize + 1];
		
		for(int i = 0; i < cameras.length; i++) {
			for(int j = 0; j < cameras[i].length; j++) {
				cameras[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < cameras.length - 1; i++) {
			for(int j = 0; j < cameras[i].length - 1; j++) {
				if(j == cameras[i].length - 2)
					System.out.println(checkPosition(i, j, cameras));
				else
					System.out.print(checkPosition(i, j, cameras));
			}
		}
		
	}
	
	public static String checkPosition(int y, int x, int[][] matrix) {
		int camerasNum = 0;
		
		if(matrix[y][x] == 1)
			camerasNum++;
		
		if(matrix[y + 1][x] == 1)
			camerasNum++;
		
		if(matrix[y][x + 1] == 1)
			camerasNum++;
		
		if(matrix[y + 1][x + 1] == 1)
			camerasNum++;
		
		
		if(camerasNum > 1)
			return "S";
		else
			return "U";
	}

}
