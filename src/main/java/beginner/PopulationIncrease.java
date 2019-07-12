package beginner;

import java.util.Scanner;

public class PopulationIncrease {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int times = Integer.parseInt(sc.nextLine());
		
		while(times > 0) {
			int populationA = sc.nextInt();
			
			int populationB = sc.nextInt();
			
			double increaseA = sc.nextDouble();
			
			double increaseB = sc.nextDouble();
			
			int anos = 0;
			
			while(true) {
				populationA += ((int) (populationA * (increaseA/100)));
				populationB += ((int) (populationB * (increaseB/100)));
				
				anos++;
				
				if(populationA > populationB || anos > 100)
					break;
				
			}
			
			if(anos > 100)
				System.out.println("Mais de 1 seculo.");
			else
				System.out.println(String.format("%d anos.", anos));
			
			times--;
		}
	}

}
