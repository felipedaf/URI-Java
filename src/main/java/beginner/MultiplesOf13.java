package beginner;

import java.util.Scanner;

public class MultiplesOf13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a > b) {
			int c = a;
			a = b;
			b = c;
		}
		
		int sum = 0;
		
		for(int i = a; i <= b; i++) {
			
			if(i % 13 != 0)
				sum += i;
		}
		
		System.out.println(sum);
	}

}
