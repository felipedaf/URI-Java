package beginner;

import java.util.Scanner;

public class PositivesAndAverage {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int positivesNumbers = 0;
		double sum = 0;
		
		for(int i = 0; i < 6; i++) {
			double number = sc.nextDouble();
			
			if(number > 0) {
				sum += number;
				positivesNumbers++;
			}
			
		}
		
		System.out.println(String.format("%d valores positivos\n"
										+ "%.1f", positivesNumbers, (sum / positivesNumbers)));
		
	}

}
