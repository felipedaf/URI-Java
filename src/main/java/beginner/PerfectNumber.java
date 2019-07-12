package beginner;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int times = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < times; i++) {
			
			int number = Integer.parseInt(sc.nextLine());
			
			int sum = 0;
			
			for(int j = 1; j < number; j++){
				if(number % j == 0) {
					sum += j;
				}
			}
			
			if(sum == number)
				System.out.println(String.format("%d eh perfeito", number));
			else
				System.out.println(String.format("%d nao eh perfeito", number));
			
			
			
		}
	}

}
