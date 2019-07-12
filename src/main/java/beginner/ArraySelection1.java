package beginner;

import java.util.Scanner;

public class ArraySelection1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[] integers = new double[100];
		
		for(int i = 0; i < 100; i++) {
			double input = sc.nextDouble();
			
			integers[i] = input;
			
			if(input <= 10) {
				System.out.println(String.format("A[%d] = %.1f",i, integers[i]));
			}
		}
	}

}
