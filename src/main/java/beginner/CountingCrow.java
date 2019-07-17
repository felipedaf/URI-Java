package beginner;

import java.util.Scanner;

public class CountingCrow {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int counter = 3;
		int output = 0;
		
		while(counter > 0) {
			String input = sc.nextLine();
			
			if(input.contains("caw")) {
				counter--;
				System.out.println(output);
				output = 0;
			}
			
			String[] binary = input.split("");
			
			for(int i = 0; i < 3; i++) {
				
				if(binary[i].equalsIgnoreCase("*"))
					output += Math.pow(2, 2- i);
			}
		}
	}

}
