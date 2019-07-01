package Beginner;

import java.util.Scanner;

public class Consumption {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		
		double Y = sc.nextDouble();
		
		double kilometersPerLiters = X/Y;
		
		System.out.println(String.format("%.3f km/l", kilometersPerLiters));
	}

}
