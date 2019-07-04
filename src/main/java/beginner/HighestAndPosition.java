package beginner;

import java.util.Scanner;

public class HighestAndPosition {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int bigger = sc.nextInt();
		int biggerPosition = 1;
		
		
		for(int i = 1; i < 100; i++) {
			int number = sc.nextInt();
			
			if(bigger < number) {
				bigger = number;
				biggerPosition = i + 1;
			}
		}
		
		System.out.println(bigger);
		System.out.println(biggerPosition);
		
		
		
		
		
	}

}
