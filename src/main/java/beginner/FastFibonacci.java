package beginner;

import java.util.Scanner;

public class FastFibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(String.format("%.1f", fibonacci(sc.nextInt())));
	}
	
	public static double fibonacci(int n) {
		return (long) ((Math.pow(((1 + Math.sqrt(5)) / 2), n) - Math.pow(((1 - Math.sqrt(5)) / 2), n)) / Math.sqrt(5));
	}

}
