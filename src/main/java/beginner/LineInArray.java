package beginner;

import java.util.Scanner;

public class LineInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int line = Integer.parseInt(sc.nextLine());
		
		String operation = sc.nextLine();
		
		double[][] matrix = new double[12][12];
		
		double sum = 0;
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				double number = sc.nextDouble();
				if(i == line)
					sum += number;
				matrix[i][j] = number;
			}
		}
		
		if(operation.equalsIgnoreCase("S"))
			System.out.println(sum);
		else if(operation.equalsIgnoreCase("M"))
			System.out.println(sum/12);
	}

}
