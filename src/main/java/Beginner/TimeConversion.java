package Beginner;

import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int timeInSeconds = sc.nextInt();
		
		int hours = 0;
		int minutes = 0;
		int seconds = 0;
		
		if(timeInSeconds / 3600 > 0 ) {
			hours = timeInSeconds / 3600;
			timeInSeconds -= 3600 * hours;
		}
		if(timeInSeconds / 60 > 0) {
			minutes = timeInSeconds / 60;
			timeInSeconds -= 60 * minutes;
		}
		
		System.out.println(String.format("%d:%d:%d", hours, minutes, timeInSeconds));
		
	}

}
