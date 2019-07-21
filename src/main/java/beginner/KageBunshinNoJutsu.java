package beginner;

import java.util.Scanner;

public class KageBunshinNoJutsu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		while(sc.hasNext()) {
			int input = sc.nextInt();
			
			int cont = 0;
			
			int entity = 1;
			
			while(entity != input) {
				entity *= 2;
				cont++;
			}
			
			System.out.println(cont);
			
		}
		sc.close();
	}

}
