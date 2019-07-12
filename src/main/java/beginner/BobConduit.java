package beginner;

import java.util.Scanner;

public class BobConduit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int times = sc.nextInt();
		
		for(int i = 0; i < times; i++) {
			int r1 = sc.nextInt();
			int r2 = sc.nextInt();
			
			System.out.println(r1 + r2);
		}
	}

}
