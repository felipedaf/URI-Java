package beginner;

import java.util.Scanner;

public class ThePronalanciaPuzzle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String inputNumber = sc.nextLine();
		
		for(int i = inputNumber.length() - 1; i >= 0; i--) {
			System.out.print(inputNumber.charAt(i));
		}
		System.out.println();
		
	}

}
