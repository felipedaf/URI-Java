package beginner;

import java.util.Scanner;

public class ArrayFill3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double value = sc.nextDouble();
		double[] values = new double[100];
		
		for(int i = 0; i < 100; i++) {
			values[i] = value;
			value /= 2;
		}
		
		for(int i = 0; i < 100; i++) {
			System.out.println(String.format("N[%d] = %.4f", i, values[i]));
		}
		
		
	}

}
