package beginner;

import java.util.Scanner;

public class LogicalSequence {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double times = sc.nextDouble();
		
		for(double i  = 1; i < times + 1; i++) {
			System.out.println(String.format("%.0f %.0f %.0f", i , Math.pow(i, 2), Math.pow(i, 3)));
			System.out.println(String.format("%.0f %.0f %.0f", i , Math.pow(i, 2) + 1, Math.pow(i, 3) + 1));
		}
		
		
	}

}
