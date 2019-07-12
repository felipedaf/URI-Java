package beginner;

import java.util.Scanner;

public class ArrayFill2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] integers = new int[1000];
		
		int jump = sc.nextInt();
		
		for(int i = 0; i < 1000; i += jump) {
			int storeValue = 0;
			for(int j = i; j < i + jump; j++) {
				if(j < 1000) {
					integers[j] = storeValue;
					storeValue++;
				}
				
			}
		}
		
		for(int i = 0; i < integers.length; i++) {
			System.out.println(String.format("N[%d] = %d", i, integers[i]));
		}
	}

}
