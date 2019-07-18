package beginner;

import java.util.Scanner;

public class SquareRootOf10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int times = sc.nextInt();
		
		double value = 3 + denominator(times);
		
		System.out.println(String.format("%.10f", value));
		
	}
	
	private static double denominator(int times) {
		if(times == 1)
			return 1 / 6.0;
		else if(times == 0)
			return 0;
		
		return 1.0 / (6 + denominator(times - 1));
	}

}
