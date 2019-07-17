package beginner;

import java.util.Scanner;

public class OurDaysAreNeverComingBack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String text = "LIFE IS NOT A PROBLEM TO BE SOLVED";
		
		System.out.println(text.substring(0, Integer.parseInt(sc.nextLine())));
	}

}
