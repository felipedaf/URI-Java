package beginner;

import java.util.Scanner;

public class ArrayFill4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] evens = new int[5];
		int[] odds = new int[5];
		
		int evenIndex = 0;
		int oddIndex = 0;
		
		for(int i = 0; i < 15; i++) {
			 int number = sc.nextInt();
			 
			 
			 
			 
			 if(number % 2 == 0 && evenIndex < 5) {
				 evens[evenIndex] = number;
				 evenIndex++;
				 
			 }
			 else if(number % 2 != 0 && oddIndex < 5) {
				 odds[oddIndex] = number;
				 oddIndex++;
			 }
			 
			 if(evenIndex == 5) {
				 for(int j = 0; j < evenIndex; j++) {
					 System.out.println(String.format("par[%d] = %d", j, evens[j]));
				 }
				 evenIndex = 0;
			 }
			 else if(oddIndex == 5) {
				 for(int j = 0; j < oddIndex; j++) {
					 System.out.println(String.format("impar[%d] = %d", j, odds[j]));
				 }
				 oddIndex = 0;
			 }
			 
		}
		for(int j = 0; j < oddIndex; j++) {
			System.out.println(String.format("impar[%d] = %d", j, odds[j]));
		}
		
		for(int j = 0; j < evenIndex; j++) {
			 System.out.println(String.format("par[%d] = %d", j, evens[j]));
		 }
	}
}
