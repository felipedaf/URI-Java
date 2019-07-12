package beginner;

import java.util.Scanner;

public class SquareMatrix2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			
			int size = sc.nextInt();
			
			if(size == 0)
				break;
			
			int[][] matrix = new int[size][size];
			
			fillCenter(1, 0, matrix.length - 1, matrix);
			
			String output = "";
			
			for(int i = matrix.length - 1; i >= 0; i--) {
				String aux = "";
				
				for(int j = 0; j < matrix[i].length; j++) {
					if(j == 0)
						aux += String.format("%3d", matrix[i][j]); 
					else
						aux += String.format("%4d", matrix[i][j]);
						
				}
				output += aux + "\n";
			}
			
			System.out.println(output);
		}	
	}
	
	public static void fillCenter(int element,int x, int y, int[][] matrix) {
		
		if((y <= 0 && x <= 0) || (y >= matrix.length - 1 && x >= matrix.length - 1)) {
			matrix[y][x] = element;
			return;
		}
		
		int tempY = y;
		int tempX = x;
		
		for(int i = 0; i < matrix.length - (element - 1); i++) {
			matrix[tempY][tempX] = element;
			
			tempY--;
			tempX++;
		}
		
		fillXAxis(element + 1, x + 1, y, matrix);
		fillYAxis(element + 1, x, y - 1, matrix);
		
		
	}
	
	private static void fillXAxis(int element,int x, int y, int[][] matrix) {
		if((y >= matrix.length - 1 && x >= matrix.length - 1)) {
			matrix[y][x] = element;
			return;
		}
		
		int tempY = y;
		int tempX = x;
		
		for(int i = 0; i < matrix.length - (element - 1); i++) {
			matrix[tempY][tempX] = element;
			
			tempY--;
			tempX++;
		}
		
		fillXAxis(element + 1, x + 1, y, matrix);
		
	}
	
	private static void fillYAxis(int element,int x, int y, int[][] matrix) {
		if((y <= 0 && x <= 0)) {
			matrix[y][x] = element;
			return;
		}
		
		int tempY = y;
		int tempX = x;
		
		for(int i = 0; i < matrix.length - (element - 1); i++) {
			matrix[tempY][tempX] = element;
			
			tempY--;
			tempX++;
		}
		
		fillYAxis(element + 1, x, y - 1, matrix);
		
	}
	
	

}
