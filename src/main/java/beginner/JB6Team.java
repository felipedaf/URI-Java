package beginner;

import java.util.Scanner;

public class JB6Team {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		while(sc.hasNext()) {
			String[] input = sc.nextLine().split(" ");
			
			int indexOfTheWinner = -1;
			
			for(int i = 0; i < 3; i++) {
				String selectedOption = input[i];
				String nextPlayerOption1 = input[(i + 1) % 3];
				String nextPlayerOption2 = input[(i + 2) % 3];
				
				if(selectedOption.equalsIgnoreCase("pedra") && nextPlayerOption1.equalsIgnoreCase("tesoura") && nextPlayerOption2.equalsIgnoreCase("tesoura")) {
					indexOfTheWinner = i;
					break;
				}
				
				else if(selectedOption.equalsIgnoreCase("papel") && nextPlayerOption1.equalsIgnoreCase("pedra") && nextPlayerOption2.equalsIgnoreCase("pedra")) {
					indexOfTheWinner = i;
					break;
				}
				else if(selectedOption.equalsIgnoreCase("tesoura") && nextPlayerOption1.equalsIgnoreCase("papel") && nextPlayerOption2.equalsIgnoreCase("papel")) {
					indexOfTheWinner = i;
					break;
				}
			}
			
			if(indexOfTheWinner == 0)
				System.out.println("Os atributos dos monstros vao ser inteligencia, sabedoria...");
			else if(indexOfTheWinner == 1)
				System.out.println("Iron Maiden's gonna get you, no matter how far!");
			else if(indexOfTheWinner == 2)
				System.out.println("Urano perdeu algo muito precioso...");
			else if(indexOfTheWinner == -1)
				System.out.println("Putz vei, o Leo ta demorando muito pra jogar...");
				
		}
		sc.close();
		
		
	}

}
