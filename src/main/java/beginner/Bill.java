package beginner;

import java.util.Scanner;

public class Bill {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int times = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < times; i++) {
			
			int number = Integer.parseInt(sc.nextLine());
			
			if(number % 2 == 0)
				System.out.println("0");
			else
				System.out.println("1");
			
			
		}
	}

}
