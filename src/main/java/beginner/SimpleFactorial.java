package beginner;

import java.util.Scanner;

public class SimpleFactorial {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		int output = 1;
		
		for(int i = 1; i <= input; i++) {
			output *= i;
		}
		
		System.out.println(output);
		
		
		
	}

}
