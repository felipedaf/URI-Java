package beginner;

import java.util.Scanner;

public class EasyFibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int place = sc.nextInt();
		
		String output = "";
		
		for(int i = 0; i < place; i++) {
			if(i != place - 1)
				output += fibonacci(i) + " ";
			else
				output += fibonacci(i);
		}
		System.out.println(output);
	}
	
	private static int fibonacci(int place) {
		if(place == 0)
			return place;
		else if(place == 1)
			return place;
		
		return fibonacci(place - 1) + fibonacci(place - 2);
	}

}
