package beginner;

import java.util.Scanner;

public class TheLastAnalogimon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		while(sc.hasNext()) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			int[] pokemonLoc = new int[2];
			int[] playerLoc = new int[2];
			
			for(int i = 0; i < y; i++) {
				for(int j = 0; j < x; j++) {
					int number = sc.nextInt();
					if(number == 1) {
						playerLoc[0] = i + 1;
						playerLoc[1] = j + 1;
					}
					
					else if(number == 2) {
						pokemonLoc[0] = i + 1;
						pokemonLoc[1] = j + 1;
					}
				}
			}
			
			System.out.println(Math.abs(playerLoc[0] - pokemonLoc[0]) + Math.abs(playerLoc[1] - pokemonLoc[1]));
		}
		sc.close();
		
		
	}

}