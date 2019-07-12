package beginner;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int times = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < times; i++) {
			
			int number = Integer.parseInt(sc.nextLine());
			boolean prime = true;
			
			
			for(int j = 2; j <= number/2; j++) {
				
				if(number % j == 0) {
					prime = false;
					break;
				}
				
			}
			
			if(prime)
				System.out.println(String.format("%d eh primo", number));
			else
				System.out.println(String.format("%d nao eh primo", number));
			
			
		}
	}

}
