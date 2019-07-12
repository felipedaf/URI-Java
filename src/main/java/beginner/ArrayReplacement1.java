package beginner;

import java.util.Scanner;

public class ArrayReplacement1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] integers = new int[10];
		
		for(int i = 0; i < 10; i++) {
			int input = sc.nextInt();
			integers[i] = input > 0 ? input : 1;
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println(String.format("X[%d] = %d", i, integers[i]));
		}
	}

}
