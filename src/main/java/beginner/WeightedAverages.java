package beginner;

import java.util.Scanner;

public class WeightedAverages {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int testCases = sc.nextInt();
		
		for(int i = 0; i < testCases; i++) {
			
			double a = sc.nextDouble() * 2;
			double b = sc.nextDouble() * 3;
			double c = sc.nextDouble() * 5;
			
			System.out.println(String.format("%.1f", (a + b + c)/ 10));
			
		}
	}

}
