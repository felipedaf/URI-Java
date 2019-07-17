package beginner;

import java.util.Scanner;

public class PedrinhosChristmas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input;

		int natal = getTotalDays(25, 12);
		
		while(sc.hasNext()) {
			input = sc.nextLine().split(" ");
			
			int dias = getTotalDays(Integer.parseInt(input[1]), Integer.parseInt(input[0])) - natal;
			if(dias < 0) {
				if(dias == -1)
					System.out.println("E vespera de natal!");
				else
					System.out.println(String.format("Faltam %d dias para o natal!", -dias));
			}
			else if(dias == 0)
				System.out.println("E natal!");
			else
				System.out.println("Ja passou!");
			
		}
	}
	
	public static int getTotalDays(int day, int month) {
		int[] monthDays = new int[12];
		monthDays[1] = 31;
		monthDays[2] = 29;
		monthDays[3] = 31;
		monthDays[4] = 30;
		monthDays[5] = 31;
		monthDays[6] = 30;
		monthDays[7] = 31;
		monthDays[8] = 31;
		monthDays[9] = 30;
		monthDays[10] = 31;
		monthDays[11] = 30;
		monthDays[0] = 0;
		
		int totalDays = 0;
		
		for(int s = 0; s < month; s++)
			totalDays += monthDays[s];
		
		return totalDays + day;
	}

}
