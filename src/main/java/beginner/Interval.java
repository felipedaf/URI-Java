package beginner;

import java.util.Scanner;

public class Interval {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double number = sc.nextDouble();
		
		if(number >= 0 && number <= 100) {
			if(number / 25 <= 1)
				System.out.println("Intervalo [0,25]");
			
			else if(number / 25 > 1 && number / 50 <= 1)
				System.out.println("Intervalo (25,50]");
			
			else if(number / 50 > 1 && number / 75 <= 1)
				System.out.println("Intervalo (50,75]");
			
			else if(number / 75 > 1 && number / 100 <= 1)
				System.out.println("Intervalo (75,100]");
			
		}
		else
			System.out.println("Fora de intervalo");
	}
}
