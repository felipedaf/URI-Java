package beginner;

import java.util.Scanner;

public class AgeInDays {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ageInDays = sc.nextInt();
		int years = 0;
		int months = 0;
		
		
		if(ageInDays / 365 > 0) {
			years = ageInDays / 365;
			ageInDays = ageInDays % 365;
		}
		if(ageInDays / 30 > 0) {
			months = ageInDays / 30;
			ageInDays = ageInDays % 30;
		}
		
		System.out.println(String.format("%d ano(s)\n"
				+ "%d mes(es)\n"
				+ "%d dia(s)", years, months, ageInDays));
	}

}
