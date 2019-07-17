package beginner;

import java.util.Scanner;

public class SundayMorning {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		do {
			String[] hour = sc.nextLine().split(":");
			
			int totalMinutes = (Integer.parseInt(hour[0]) * 60) + Integer.parseInt(hour[1]) + 60;
			
			
			if(totalMinutes <= 8 * 60)
				System.out.println("Atraso maximo: 0");
			else
				System.out.println(String.format("Atraso maximo: %d", totalMinutes - (8 * 60)));
				
			
		}while(sc.hasNext());
		
		
	}
}
