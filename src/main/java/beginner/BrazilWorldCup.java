package beginner;

import java.util.Scanner;

public class BrazilWorldCup {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int complaints;
		while(sc.hasNext()) {
			complaints = sc.nextInt();
			
			if(complaints > 0) {
				System.out.println("vai ter duas!");
			}
			else if(complaints == 0) {
				System.out.println("vai ter copa!"); 
			}
			
		}
		sc.close();
	}

}