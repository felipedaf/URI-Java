package beginner;

import java.util.Scanner;

public class GameTime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		int time = (24 - start + end) % 24;
		
		if(time == 0)
			time = 24;
		
		System.out.println(String.format("O JOGO DUROU %d HORA(S)", time));

	}

}
