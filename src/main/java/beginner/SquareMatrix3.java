package beginner;

import java.util.Scanner;

public class SquareMatrix3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int size = sc.nextInt();
			
			if(size == 0)
				break;
			
			int[][] matrix = new int[size][size];
			
			for(int i = matrix.length - 1; i >= 0; i--) {
				for(int j = 0; j < matrix[i].length; j++) {
					matrix[i][j] = (int) (Math.pow(2, ((matrix.length - 1) - i)) * Math.pow(2, j));
				}
			}
			
			String output = "";
			
			for(int i = matrix.length - 1; i >= 0; i--) {
				String aux = "";
				for(int j = 0; j < matrix[i].length; j++) {
					
					String spaces = "";
					String number = String.valueOf(matrix[i][j]);
					
					//for to count the spaces

					for(int s = 0; s < (String.valueOf(matrix[0][matrix.length - 1]).length()) - number.length(); s++) {
						spaces += " ";
					}
					
					if(j == 0) {
						aux += String.format("%s%s", spaces, number);
					}
					else
						aux += String.format("%s%s", spaces + " ", number);
				}
				
				output += aux + "\n";
				
			}
			
			System.out.println(output);
		}
	}

}
