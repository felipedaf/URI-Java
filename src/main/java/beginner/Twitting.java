package beginner;

import java.util.Scanner;

public class Twitting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		if(input.length() <= 140)
			System.out.println("TWEET");
		else
			System.out.println("MUTE");
	}

}
