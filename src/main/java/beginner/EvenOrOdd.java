package beginner;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int times = sc.nextInt();
		
		for(int i = 0; i < times ; i++) {
			int number = sc.nextInt();
			String output = "";
			
			
			if(number == 0) {
				output = "NULL";
			}
			else {
				if(number % 2 == 0)
					output += "EVEN ";
				else
					output += "ODD ";
				
				if(number > 0)
					output += "POSITIVE";
				
				else
					output += "NEGATIVE";
				
			}
			System.out.println(output);
			
		}
	}

}
