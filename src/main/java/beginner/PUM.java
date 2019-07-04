package beginner;

import java.util.Scanner;

public class PUM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int range = sc.nextInt();
		int pum = 1;
		
		for(int i = 0; i < range; i++) {
			System.out.println(String.format("%d %d %d PUM", pum, pum + 1, pum + 2));
			
			pum += 4;
		}
	}

}
