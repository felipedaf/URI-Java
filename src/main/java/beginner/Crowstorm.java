package beginner;

import java.util.Scanner;

public class Crowstorm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int xf = sc.nextInt();
			int yf = sc.nextInt();
			int xo = sc.nextInt();
			int yo = sc.nextInt();
			int speed = sc.nextInt();
			int castingRatius = sc.nextInt();
			int ultimateRatius = sc.nextInt();
			
			double distanceBetweenPoints = Math.sqrt(Math.pow((xo - xf), 2) + Math.pow((yo - yf), 2));
			double enemyDistance = distanceBetweenPoints + (speed * 1.5);
			
			if(castingRatius + ultimateRatius >= enemyDistance)
				System.out.println("Y");
			else
				System.out.println("N");
			
		}
		sc.close();
	}

}
