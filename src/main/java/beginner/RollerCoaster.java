package beginner;

import java.util.Scanner;

public class RollerCoaster {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int guestsNum = sc.nextInt();
			int minHeight = sc.nextInt();
			int maxHeight = sc.nextInt();
			
			int cont = 0;
			
			for(int i = 0; i < guestsNum; i++) {
				int input = sc.nextInt();
				
				if(input <= maxHeight && input >= minHeight)
					cont++;
			}
			
			System.out.println(cont);
		}
		sc.close();
		
	}

}
