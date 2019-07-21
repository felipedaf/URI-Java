package beginner;

import java.util.Scanner;

public class UFPRGaming {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int times = sc.nextInt();
			
			int teamID = sc.nextInt();
			
			int csGames = 0;
			
			for(int i = 0; i < times; i++) {
				int selectedTeam = sc.nextInt();
				
				int game = sc.nextInt();
				
				if(game == 0 && selectedTeam == teamID)
					csGames++;
			}
			
			System.out.println(csGames);
			
		}
		sc.close();
	}

}
