package beginner;

import java.util.Scanner;

public class Parity {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		int counter = 0;
		
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == '1')
				counter++;
		}
		
		if(counter % 2 == 0)
			System.out.println(input + "0");
		else
			System.out.println(input + "1");
		
	}

}
