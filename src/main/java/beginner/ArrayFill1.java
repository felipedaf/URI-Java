package beginner;

import java.util.Scanner;

public class ArrayFill1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		int[] array = new int[10];
		
		for(int i = 0; i < 10; i++) {
			array[i] = number;
			number *= 2;
			System.out.println(String.format("N[%d] = %d", i, array[i]));
		}
		
		
	}
}
