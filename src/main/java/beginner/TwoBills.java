package beginner;

import java.util.Scanner;

public class TwoBills {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] values = {100, 50, 20, 10, 5, 2};
		
		while(true) {
			int productCost = sc.nextInt();
			int paidValue = sc.nextInt();
			
			if(productCost == 0 && paidValue == 0)
				break;
			
			int change = paidValue - productCost;
			int check = change;
			
			int takeChange = 0;
			for(int i = 0; i < 2; i++) {
				for(int value: values) {
					if(takeChange == 0 && value == change)
						continue;
					
					if(change / value > 0) {
						change -= value;
						takeChange++;
						break;
					}
				}
				
			}
			
			if(change == 0 && check != 0)
				System.out.println("possible");
			else
				System.out.println("impossible");
			
		}
		
	}

}
