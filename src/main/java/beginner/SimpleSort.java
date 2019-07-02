package beginner;

import java.util.Scanner;

public class SimpleSort {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		String[] values = input.split(" ");
		String[] copyValues = input.split(" ");
		
		
		for(int i = 0; i < values.length - 1; i++) {
			int smaller = i;
			for(int j = i + 1; j < values.length; j++) {
				
				if(Double.parseDouble(values[smaller]) > Double.parseDouble(values[j])) {
					smaller = j;
				}
			}
			String swap = values[i];
			values[i] = values[smaller];
			values[smaller] = swap;
			
		}
		
		for(int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
		System.out.print("\n");
		for(int i = 0; i < copyValues.length; i++) {
			System.out.println(copyValues[i]);
		}
	}

}
