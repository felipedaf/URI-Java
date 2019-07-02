package beginner;

import java.util.Scanner;

public class PositiveNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int positives = 0;
		
		
		for(int i = 0; i < 6; i++) {
			double number = sc.nextDouble();
			if(number > 0)
				positives++;
			
		}
		
		System.out.println(String.format("%d valores positivos", positives));
		

	}

}
