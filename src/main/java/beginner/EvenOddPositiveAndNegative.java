package beginner;

import java.util.Scanner;

public class EvenOddPositiveAndNegative {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		int even = 0;
		int positives = 0;
		int negatives = 0;
		
		for(int i = 0; i < 5; i++) {
			int number = sc.nextInt();
			
			if(number % 2 == 0)
				even++;
			
			if(number > 0)
				positives++;
			else if(number < 0)
				negatives++;
		}
		
		System.out.println(String.format("%d valor(es) par(es)\n"
										+ "%d valor(es) impar(es)\n"
										+ "%d valor(es) positivo(s)\n"
										+ "%d valor(es) negativo(s)", even, (5 - even), positives, negatives));
		
		
	}

}
