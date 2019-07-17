package beginner;

import java.util.Scanner;

public class ScientificNotation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		double number = Double.parseDouble(input);
		String returnString = "";
		
		int times = 0;
		
		boolean hasInteger = false;
		
		if(number >= 1 || number <= -1) {
			hasInteger = true;
			while(number / 10 >= 1 || number / 10 <= -1) {
				number /= 10;
				times++;
			}
			
			
			
		}
		else {
			while((number * 10 < 10 && number > 0) ||(number < 0 && number * 10 > -10)) {
				number *= 10;
				times++;
			}
		}
		
		if(number == 0)
			hasInteger = true;
		
		returnString += input.contains("-") ? "" : "+";
		
		
		returnString += hasInteger? String.format("%.4fE+%02d", number, times) : String.format("%.4fE-%02d", number, times);
		
		System.out.println(returnString);
	}

}
