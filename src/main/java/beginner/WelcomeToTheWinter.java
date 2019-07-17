package beginner;

import java.util.Scanner;

public class WelcomeToTheWinter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int temp1 = sc.nextInt();
		int temp2 = sc.nextInt();
		int temp3 = sc.nextInt();
		
		int variation1 = temp2 - temp1;
		int variation2 = temp3 - temp2;
		
		if(variation1 < 0) {
			if(variation2 >= 0 || variation2 > variation1)
				System.out.println(":)");
			else
				System.out.println(":(");
			
		}
		
		else if(variation1 > 0) {
			if(variation2 > 0 && variation2 >= variation1)
				System.out.println(":)");
			else
				System.out.println(":(");
			
			
		}
		
		else {
			if(variation1 < variation2)
				System.out.println(":)");
			else
				System.out.println(":(");
			
		}
	}

}
