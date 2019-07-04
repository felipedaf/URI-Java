package beginner;

import java.util.Scanner;

public class FixedPassword {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		final int PASSWORD = 2002;
		
		int input = -1;
		boolean correct = false;
		
		while(!correct) {
			input = sc.nextInt();
			
			if(input == PASSWORD) {
				correct = true;
				System.out.println("Acesso Permitido");
			}
			if(!correct)
				System.out.println("Senha Invalida");
			
		}
		
	}

}
