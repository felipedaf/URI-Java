package beginner;

import java.util.Scanner;

public class OddEvenOrCheating {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int isEven = sc.nextInt();
		
		int winner, player1Numb = sc.nextInt(), player2Numb = sc.nextInt();
		
		int player1Cheating = sc.nextInt();
		
		int player2Accuses = sc.nextInt();
		
		
		if(isEven == 1)
			winner = (player1Numb + player2Numb) % 2 == 0? 1 : 2;
		else
			winner = (player1Numb + player2Numb) % 2 == 0? 2 : 1;
		
		if(player1Cheating == 1) {
			winner = 1;
			if(player2Accuses == 1)
				winner = winner == 2 ? 1 : 2;
		}
		
		
		
		System.out.println(String.format("Jogador %d ganha!", winner));
		
	}

}
