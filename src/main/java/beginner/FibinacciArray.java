package beginner;

import java.util.Scanner;

public class FibinacciArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int times = sc.nextInt();
		
		for(int i = 0; i < times; i++) {
			int term = sc.nextInt();
			
			System.out.printf("Fib(%d) = %d\n", term, fib(term));
		}
	}
	
	public static long fib(int term) {
		long first = 0;
		long second = 1;
		
		int times = term;
		
		long sum = 0;
		
		for(int i = 1; i < times; i++) {
			sum = first + second;
			first = second;
			second = sum;
		}
		
		if(term == 1)
			sum = 1;
		
		return sum;
	}
}
