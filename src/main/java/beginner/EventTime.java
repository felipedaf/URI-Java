package beginner;

import java.util.Scanner;

public class EventTime {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int day1 = Integer.parseInt(sc.nextLine().split(" ")[1]);
		String[] time1 = sc.nextLine().split(" : ");
		int day2 = Integer.parseInt(sc.nextLine().split(" ")[1]);
		String[] time2 = sc.nextLine().split(" : ");
		
		int seconds1 = (day1 * 24 * 60 * 60) + (Integer.parseInt(time1[0]) * 60 * 60) + (Integer.parseInt(time1[1]) * 60) + (Integer.parseInt(time1[2]));
		int seconds2 = (day2 * 24 * 60 * 60) + (Integer.parseInt(time2[0]) * 60 * 60) + (Integer.parseInt(time2[1]) * 60) + (Integer.parseInt(time2[2]));
		
		int finalSeconds = seconds2 - seconds1;
		
		System.out.println(String.format("%d dia(s)", (finalSeconds / (3600 * 24))));
		
		finalSeconds = (finalSeconds % (3600 * 24));
		
		System.out.println(String.format("%d hora(s)", finalSeconds / 3600));
		
		finalSeconds = (finalSeconds % 3600);
		
		System.out.println(String.format("%d minuto(s)", finalSeconds / 60));
		
		finalSeconds = (finalSeconds % 60);
		
		System.out.println(String.format("%d segundo(s)", finalSeconds));
		
		
		
	}

}
