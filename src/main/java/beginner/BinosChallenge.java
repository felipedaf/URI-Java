package beginner;

import java.util.Scanner;

public class BinosChallenge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int times = sc.nextInt();
		
		int[] multiples = new int[4];
		
		for(int i = 0; i < times ; i++) {
			int num = sc.nextInt();
			
			for(int m = 2; m <= 5; m++) {
				if(num % m == 0)
					multiples[m - 2]++;
			}
		}
		
		for(int m = 0; m <= 3; m++) {
			System.out.println(String.format("%d Multiplo(s) de %d", multiples[m], m+2));
		}
		
	}

}
