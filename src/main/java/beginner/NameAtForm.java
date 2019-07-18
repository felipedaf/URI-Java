package beginner;

import java.util.Scanner;

public class NameAtForm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		if(input.length() <= 80)
			System.out.println("YES");
		else
			System.out.println("NO");
	}

}
