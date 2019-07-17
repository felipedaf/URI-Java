package beginner;

import java.util.Scanner;

public class EletricalOutlet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		System.out.println((a + b + c + d - 3));
	}
}
