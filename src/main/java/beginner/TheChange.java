package beginner;

import java.util.Scanner;

public class TheChange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int input = sc.nextInt();
			input = input % 360;
			
			if(input >= 0 && input < 90)
				System.out.println("Bom Dia!!");
			else if(input >= 90 && input < 180)
				System.out.println("Boa Tarde!!");
			else if(input >= 180 && input < 270)
				System.out.println("Boa Noite!!");
			else if(input >= 270)
				System.out.println("De Madrugada!!");
				
		}
		
	}

}
