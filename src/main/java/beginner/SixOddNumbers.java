package beginner;

import java.util.Scanner;

public class SixOddNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		int cont = 0;
		
		while(cont < 6) {
			if(number % 2 != 0) {
				System.out.println(number);
				cont++;
			}
			number++;
		}

	}

}
