package beginner;

import java.util.Scanner;

public class TimeZone {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int time = sc.nextInt();
		
		int travelTime = sc.nextInt();
		
		int arriveTime = sc.nextInt();
		
		int finalTime = (24 + time + travelTime + arriveTime) % 24;
		
		System.out.println(finalTime);
	}

}
