package beginner;

import java.util.Scanner;

public class Mjölnir {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int times = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < times; i++) {
			String name = sc.nextLine().split(" ")[0];
			
			if(name.equals("Thor"))
				System.out.println("Y");
			else
				System.out.println("N");
			
			
		}
		
	}

}
