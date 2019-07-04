package beginner;

import java.util.Scanner;

public class EvenBetweenFiveNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int quant = 0;
		for(int i = 0; i < 5; i++) {
			int number = sc.nextInt();
			
			if(number % 2 == 0)
				quant++;
		}
		
		System.out.println(String.format("%d valores pares", quant));
	}

}
