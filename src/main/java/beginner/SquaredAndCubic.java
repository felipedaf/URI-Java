package beginner;

import java.util.Scanner;

public class SquaredAndCubic {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int times = sc.nextInt();
		
		for(int i = 1; i <= times; i++) {
			System.out.println(String.format("%d %.0f %.0f", i, Math.pow(i, 2), Math.pow(i, 3)));
		}
	}
}
