package beginner;

import java.util.Scanner;

public class TheRacingOfSlugs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int slugs;
		
		while(sc.hasNext()) {
			
			slugs = sc.nextInt();
			
			int faster = 0;
			
			for(int i = 0; i < slugs; i++) {
				
				int speed = sc.nextInt();
				
				if(speed > faster)
					faster = speed;
				
			}
			
			if(faster < 10)
				System.out.println(1);
			else if(faster >= 10 && faster < 20)
				System.out.println(2);
			else if(faster >= 20)
				System.out.println(3);
			
		}
		sc.close();
	}

}
