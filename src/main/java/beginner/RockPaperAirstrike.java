package beginner;

import java.util.Scanner;

public class RockPaperAirstrike {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int times = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < times; i++) {
			String option1 = sc.nextLine();
			String option2 = sc.nextLine();
			
			if(option1.equalsIgnoreCase("ataque") || option2.equalsIgnoreCase("ataque")) {
				if(option1.equalsIgnoreCase("ataque") && option2.equalsIgnoreCase("ataque"))
					System.out.println("Aniquilacao mutua");
				
				else if(option1.equalsIgnoreCase("pedra") || option2.equalsIgnoreCase("pedra")) {
					String player = !option1.contains("pedra") ? "1" : "2";
					System.out.println(String.format("Jogador %s venceu", player));
				}
					
				else if(option1.equalsIgnoreCase("papel") || option2.equalsIgnoreCase("papel")) {
					String player = !option1.contains("papel") ? "1" : "2";
					System.out.println(String.format("Jogador %s venceu", player));
				}
				
				
			}
			
			else if(option1.equalsIgnoreCase("pedra") || option2.equalsIgnoreCase("pedra")) {
				if(option1.equalsIgnoreCase("pedra") && option2.equalsIgnoreCase("pedra"))
					System.out.println("Sem ganhador");
				
				else if(option1.equalsIgnoreCase("papel") || option2.equalsIgnoreCase("papel")) {
					String player = option1.contains("pedra") ? "1" : "2";
					System.out.println(String.format("Jogador %s venceu", player));
				}
			}
			
			else if(option1.equalsIgnoreCase("papel") && option2.equalsIgnoreCase("papel"))
				System.out.println("Ambos venceram");
			
		}
	}

}
