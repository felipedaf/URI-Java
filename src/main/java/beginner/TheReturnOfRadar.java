package beginner;

import java.util.Scanner;

public class TheReturnOfRadar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int input = sc.nextInt();
			
			if(input == 0)
				break;
			
			for(int i = 0; i < input; i++) {
				int number = sc.nextInt();
				
				if(number % 2 ==0)
					System.out.println((number-1) * 2);
				else
					System.out.println((number * 2) - 1);
			}
		}
	}

}
