package beginner;

import java.util.Scanner;

public class BuildingHouses {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			int width = sc.nextInt();
			
			if(width == 0)
				break;
			
			int length = sc.nextInt();
			
			double percentage = sc.nextInt()/100.0;
			
			int landSide = (int) Math.sqrt((width * length) / percentage);
			
			System.out.println(landSide);
		}
	}

}
