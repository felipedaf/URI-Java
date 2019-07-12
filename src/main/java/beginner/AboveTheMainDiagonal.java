package beginner;

import java.util.Scanner;

public class AboveTheMainDiagonal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[][] numbers = new double[12][12];
		
		String operation = sc.nextLine();
		
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers[i].length; j++) {
				numbers[i][j] = sc.nextDouble();
			}
		}
		
		double sum = 0;
		int times = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			for(int j = i + 1; j < numbers[i].length; j++) {
				sum += numbers[i][j];
				times++;
			}
		}
		
		if(operation.equals("S"))
			System.out.println(String.format("%.1f", sum));
		else if(operation.equals("M"))
			System.out.println(String.format("%.1f", sum/times));
	}
	

}
