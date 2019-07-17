package beginner;

import java.util.Scanner;

public class TheonAnswer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int people = sc.nextInt();
		int betterPerson = 1;
		int smallerHit  = 0;
		
		for(int i = 0; i < people; i++) {
			int hit = sc.nextInt();
			
			if(i == 0) {
				smallerHit = hit;
			}
			
			if(hit < smallerHit) {
				betterPerson = i + 1;
				smallerHit = hit;
			}
			
		}
		
		System.out.println(betterPerson);
	}

}
