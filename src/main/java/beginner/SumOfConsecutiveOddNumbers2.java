package beginner;

import java.util.Scanner;

public class SumOfConsecutiveOddNumbers2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testCases = sc.nextInt();
		
		for(int i = 0; i < testCases; i++) {
			int sum = 0;
			
			int smaller = sc.nextInt();
			
			int second = sc.nextInt();
			
			if(smaller > second) {
				int swap = smaller;
				smaller = second;
				second = swap;
			}
				
			
			
			for(int j = smaller + 1; j < second; j++) {
				if(j % 2 != 0)
					sum += j;
			}
			System.out.println(sum);
		}
		
	}
	

}
