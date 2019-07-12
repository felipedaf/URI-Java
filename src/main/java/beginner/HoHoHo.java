package beginner;

import java.util.Scanner;

public class HoHoHo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int times = sc.nextInt();
		
		if(times >= 0 && times <= 1000000) {
			String output = "";
			
			for(int i = 0; i < times; i++) {
				if(i == times - 1)
					System.out.println("Ho!");
				else
					System.out.print("Ho ");
			}
			
		}
	}

}
