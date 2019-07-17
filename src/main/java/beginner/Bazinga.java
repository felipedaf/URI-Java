package beginner;

import java.util.Scanner;

public class Bazinga {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int times = Integer.parseInt(sc.nextLine());
		
		for(int i = 1; i<= times; i++) {
			String[] caso = sc.nextLine().split(" ");
			
			if(caso[0].equalsIgnoreCase(caso[1])) {
				System.out.println(String.format("Caso #%d: De novo!", i));
			}
			
			else if(caso[0].equalsIgnoreCase("pedra")) {
				if(caso[1].equalsIgnoreCase("tesoura") || caso[1].equalsIgnoreCase("lagarto")) {
					System.out.println(String.format("Caso #%d: Bazinga!", i));
				}
				else
					System.out.println(String.format("Caso #%d: Raj trapaceou!", i));
			}
			
			else if(caso[0].equalsIgnoreCase("papel")) {
				if(caso[1].equalsIgnoreCase("pedra") || caso[1].equalsIgnoreCase("Spock")) {
					System.out.println(String.format("Caso #%d: Bazinga!", i));
				}
				else
					System.out.println(String.format("Caso #%d: Raj trapaceou!", i));;
			}
			
			else if(caso[0].equalsIgnoreCase("tesoura")) {
				if(caso[1].equalsIgnoreCase("papel") || caso[1].equalsIgnoreCase("lagarto")) {
					System.out.println(String.format("Caso #%d: Bazinga!", i));
				}
				else
					System.out.println(String.format("Caso #%d: Raj trapaceou!", i));;
			}
			
			else if(caso[0].equalsIgnoreCase("lagarto")) {
				if(caso[1].equalsIgnoreCase("papel") || caso[1].equalsIgnoreCase("Spock")) {
					System.out.println(String.format("Caso #%d: Bazinga!", i));
				}
				else
					System.out.println(String.format("Caso #%d: Raj trapaceou!", i));
			}
			else if(caso[0].equalsIgnoreCase("Spock")) {
				if(caso[1].equalsIgnoreCase("tesoura") || caso[1].equalsIgnoreCase("pedra")) {
					System.out.println(String.format("Caso #%d: Bazinga!", i));
				}
				else
					System.out.println(String.format("Caso #%d: Raj trapaceou!", i));
			}
			
		}

		
	}

}
