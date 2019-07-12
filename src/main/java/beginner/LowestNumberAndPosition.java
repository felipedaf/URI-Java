package beginner;

import java.util.Scanner;

public class LowestNumberAndPosition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] numbers = new int[sc.nextInt()];
		int smaller = 0;
		int position = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
			
			if(i == 0)
				smaller = numbers[i];
			else if(smaller > numbers[i]) {
				smaller = numbers[i];
				position = i;
			}
			
			
		}
		
		System.out.println(String.format("Menor valor: %d", smaller));
		System.out.println(String.format("Posicao: %d", position));
	}
}
