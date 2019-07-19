package beginner;

import java.util.Scanner;

public class HotDogs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numerator = sc.nextInt();
		double denominator = sc.nextInt();
		
		double answer = numerator / denominator;
		
		System.out.println(String.format("%.2f", answer));
	}

}
