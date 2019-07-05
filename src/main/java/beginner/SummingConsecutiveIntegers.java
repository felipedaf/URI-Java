package beginner;

import java.util.Scanner;

public class SummingConsecutiveIntegers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int passed = 0;
		int a = sc.nextInt();
		int n = -1;
		
		while(passed < 1) {
			n = sc.nextInt();
			if(n > 0)
				passed++;
		}
		
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			sum += a+i;
		}
		
		System.out.println(sum);
		
		
		
		
	}

}
