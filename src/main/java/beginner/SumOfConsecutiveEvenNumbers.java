package beginner;

import java.util.Scanner;

public class SumOfConsecutiveEvenNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int input = sc.nextInt();
			
			if(input == 0)
				break;
			int sum = 0;
			int even = 0;
			
			while(even < 5) {
				if(input % 2 == 0) {
					sum+= input;
					even++;
				}
				
				input++;
			}
			
			System.out.println(sum);
		}

	}

}
