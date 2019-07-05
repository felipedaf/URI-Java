package beginner;

import java.util.Scanner;

public class Ages {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		int counter = 0;
		int sum = 0;
		
		while(true) {
			int input = sc.nextInt();
			
			if(input < 0)
				break;
			
			counter++;
			sum += input;
			
		}
		double dsum = sum;
		System.out.println(String.format("%.2f", dsum/counter));
		
		
	}

}
