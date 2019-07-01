package beginner;

import java.util.Scanner;

public class FuelSpent {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int hours = sc.nextInt();
		int averageSpeed = sc.nextInt();
		
		System.out.println(String.format("%.3f", (hours * averageSpeed) / 12.0));
	}

}
