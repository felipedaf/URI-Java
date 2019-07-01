package Beginner;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int minutesPerKilometer = 2;
		
		int kilometers = sc.nextInt();
		
		System.out.println(String.format("%d minutos", (minutesPerKilometer * kilometers)));
	}
}
