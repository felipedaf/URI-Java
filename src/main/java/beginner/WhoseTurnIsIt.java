package beginner;

import java.util.Scanner;

public class WhoseTurnIsIt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int times = Integer.parseInt(sc.nextLine());
		
		
		for(int i = 0; i < times; i++) {
			
			String even = "";
			String odd = "";
			
			String[] input = sc.nextLine().split(" ");
			
			if(input[1].equalsIgnoreCase("PAR")) {
				even = input[0];
				odd = input[2];
			}
			else {
				even = input[2];
				odd = input[0];
			}
			
			String[] bet = sc.nextLine().split(" ");
			
			if((Integer.parseInt(bet[0]) + Integer.parseInt(bet[1])) % 2 == 0)
				System.out.println(even);
			else
				System.out.println(odd);
			
			
			
		}
	}

}
