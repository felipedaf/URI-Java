package beginner;

import java.util.Scanner;

public class SquareMatrix1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int size = sc.nextInt();
			
			if(size == 0)
				break;
			
			int times = size % 2 == 0 ? size / 2 : (size + 1)/2;
			
			
			int[][] matrix = new int[size][size];
			
			for(int i = 0; i < times; i++) {
				bottomLeftFill(i, size, i + 1, matrix);
				size -= 2;
			}
			
			String finalString = "";
			
			for(int i = 0; i < matrix.length; i++) {
				String aux = "  ";
				
				for(int j = 0; j < matrix[i].length; j++) {
					if(j == 0)
						aux += matrix[i][j];
					else
						aux += String.format("%4d", matrix[i][j]);
				}
				
				if(finalString.isEmpty())
					finalString += aux;
				else
					finalString += "\n" + aux;
			}
			
			System.out.println(finalString + "\n");
		}
		
		
	}
	
	public static void bottomLeftFill(int index, int size,int element, int[][] matrix) {
		
		//top and bottom fill
		for(int i = index; i < index + size; i++) {
			matrix[index + (size - 1)][i] = element;
			matrix[index][i] = element;
		}
		//left and right fill
		for(int i = index + 1; i < index + (size - 1); i++) {
			matrix[i][index] = element;
			matrix[i][index + (size - 1)] = element;
		}
		
		
	}

}
