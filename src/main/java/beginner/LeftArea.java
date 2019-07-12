package beginner;

import java.util.Scanner;

public class LeftArea {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String operation = sc.nextLine();
		
		double[][] numbers = new double[12][12];
		
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers[i].length; j++) {
				numbers[i][j] = sc.nextDouble();
				
			}
		}
		
		double sum = 0;
		
		int times = 0;
		
		for(int i = 0; i < numbers.length - 1; i++) {
			if(i < numbers.length/2) {
				for(int j = 0; j < i; j++) {
					sum += numbers[i][j];
					times++;
				}
			}
			else if(i >= numbers.length/2) {
				for(int j = 0; j < numbers.length - (i + 1); j++) {
					sum += numbers[i][j];
					times++;
				}
			}
		}
		
		if(operation.equals("S"))
			System.out.println(String.format("%.1f", sum));
		else if(operation.equals("M"))
			System.out.println(String.format("%.1f", sum/times));
		
		
	}
}
