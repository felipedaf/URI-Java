package beginner;

import java.util.Scanner;

public class RestOfADivision {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a > b) {
			int c = a;
			a = b;
			b = c;
		}
		
		for(int i = a + 1; i < b; i++) {
			if(i % 5 == 2 || i % 5 == 3)
				System.out.println(i);
		}
	}

}
