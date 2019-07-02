package beginner;

import java.util.Scanner;

public class Multiples {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int smaller = A < B ? A : B;
		
		if((smaller == A && B % A == 0) || (smaller == B && A % B == 0))
			System.out.println("Sao Multiplos");
		else
			System.out.println("Nao sao Multiplos");
			
	}

}
