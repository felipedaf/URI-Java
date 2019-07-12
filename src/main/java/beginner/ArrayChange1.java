package beginner;

import java.util.Scanner;

public class ArrayChange1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] integers = new int[20];
		
		for(int i = 19; i >= 0; i--) {
			int input = sc.nextInt();
			
			integers[i] = input;
			
		}
		
		for(int i = 0; i < 20; i++) {
			System.out.println(String.format("N[%d] = %d", i, integers[i]));
		}
	}

}
