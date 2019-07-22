package beginner;

import java.util.Scanner;

public class SystemOfADownload {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int times = sc.nextInt();
		
		for(int i = 0; i < times; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			int sum = num1 + num2;
			
			if(sum == 0)
				System.out.println("PROXYCITY");
			
			else if(sum == 1)
				System.out.println("P.Y.N.G.");
			
			else if(sum == 2)
				System.out.println("DNSUEY!");
			
			else if(sum == 3)
				System.out.println("SERVERS");
			
			else if(sum == 4)
				System.out.println("HOST!");
			
			else if(sum == 5)
				System.out.println("CRIPTONIZE");
			
			else if(sum == 6)
				System.out.println("OFFLINE DAY");
			
			else if(sum == 7)
				System.out.println("SALT");
			
			else if(sum == 8)
				System.out.println("ANSWER!");
			
			else if(sum == 9)
				System.out.println("RAR?");
			
			else if(sum == 10)
				System.out.println("WIFI ANTENNAS");
			
		}
	}

}
