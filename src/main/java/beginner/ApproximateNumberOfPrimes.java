package beginner;

import java.util.Scanner;

public class ApproximateNumberOfPrimes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int naturalNumber = sc.nextInt();
		
		double minimum = naturalNumber / Math.log(naturalNumber);
		
		double maximum = minimum * 1.25506;
		
		System.out.println(String.format("%.1f %.1f", minimum, maximum));
		
		
	}

}
	