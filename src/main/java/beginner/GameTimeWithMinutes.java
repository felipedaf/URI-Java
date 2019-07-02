package beginner;

import java.util.Scanner;

public class GameTimeWithMinutes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int hours1 = sc.nextInt();
		int minutes1 = sc.nextInt();
		int hours2 = sc.nextInt();
		int minutes2 = sc.nextInt();
		
		int startMinutes = (hours1 * 60) + minutes1;
		int endMinutes = (hours2 * 60) + minutes2;
		
		int gameTimeInMinutes = ((24 * 60) - startMinutes + endMinutes) % (24 * 60);
		
		int hoursPlayed = gameTimeInMinutes / 60;
		int minutesPlayed = gameTimeInMinutes % 60;
		
		if(hours1 == hours2 && minutes1 == minutes2) {
			hoursPlayed = 24;
		}
		
		System.out.println(String.format("O JOGO DUROU %d HORA(S) E %d MINUTO(S)", hoursPlayed, minutesPlayed));
		
		
	}

}
