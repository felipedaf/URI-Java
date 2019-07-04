package beginner;

import java.util.Scanner;

public class Remaining2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		for(int i = 1; i <= 10000; i++) {
			if(i % number == 2)
				System.out.println(i);
		}
		
		
	}

}
