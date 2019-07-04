package beginner;

import java.util.Scanner;

public class EvenSquare {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		for(int i = 1; i <= number; i++) {
			if(i % 2 == 0)
				System.out.println(String.format("%d^2 = %.0f", i, Math.pow(i, 2)));
		}
		
	}

}
