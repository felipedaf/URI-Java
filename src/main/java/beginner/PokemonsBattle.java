package beginner;

import java.util.Scanner;

public class PokemonsBattle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int times = sc.nextInt();
		
		for(int i = 0; i < times; i++) {
			int bonus = sc.nextInt();
			
			int attackD = sc.nextInt();
			int defenseD = sc.nextInt();
			int levelD = sc.nextInt();
			
			int attackG = sc.nextInt();
			int defenseG = sc.nextInt();
			int levelG = sc.nextInt();
			
			int valueD = levelD % 2 == 0 ? bonus + ((attackD + defenseD) / 2) : ((attackD + defenseD) / 2);
			int valueG = levelG % 2 == 0 ? bonus + ((attackG + defenseG) / 2) : ((attackG + defenseG) / 2);
			
			if(valueD > valueG)
				System.out.println("Dabriel");
			else if(valueG > valueD)
				System.out.println("Guarte");
			else
				System.out.println("Empate");
			
		}
	}

}
