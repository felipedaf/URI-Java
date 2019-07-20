package beginner;

import java.util.Scanner;

public class Volleyball {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int times = Integer.parseInt(sc.nextLine());
		double servicesPercentage = 0;
		double attacksPercentage = 0;
		double blocksPercentage = 0;
		double services = 0;
		double blocks = 0;
		double attacks = 0;
		
		for(int i = 0; i < times; i++) {
			String nome = sc.nextLine();
			
			String[] input = sc.nextLine().split(" ");
			
			servicesPercentage += Double.parseDouble(input[0]);
			
			blocksPercentage += Double.parseDouble(input[1]);
			
			attacksPercentage += Double.parseDouble(input[2]);
			
			input = sc.nextLine().split(" ");
			
			services += Double.parseDouble(input[0]);
			
			blocks += Double.parseDouble(input[1]);
			
			attacks += Double.parseDouble(input[2]);
						
		}
		
		servicesPercentage = (services / servicesPercentage) * 100;
		blocksPercentage = (blocks / blocksPercentage) * 100;
		attacksPercentage = (attacks / attacksPercentage) * 100;
		
		System.out.println(String.format("Pontos de Saque: %.2f %%.", servicesPercentage));
		System.out.println(String.format("Pontos de Bloqueio: %.2f %%.", blocksPercentage));
		System.out.println(String.format("Pontos de Ataque: %.2f %%.", attacksPercentage));
	}

}
