package beginner;

import java.util.Scanner;

public class WalkingInTime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int value1 = sc.nextInt();
		int value2 = sc.nextInt();
		int value3 = sc.nextInt();
		
		if(((value1 + value2 == value3) || (value1 + value3 == value2) || (value2 + value3 == value1) || (value1 == value2) || (value2 == value3) || (value3 == value1)))
			System.out.println("S");
		else
			System.out.println("N");
	}

}
