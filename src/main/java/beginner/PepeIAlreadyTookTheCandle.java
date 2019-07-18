package beginner;

import java.util.Scanner;

public class PepeIAlreadyTookTheCandle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int times = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < times; i++) {
			String[] input = sc.nextLine().split(" ");
			String doorStatus = input[2].equalsIgnoreCase("1") ? "abriu" : "fechou";
			System.out.println(String.format("%02d:%02d - A porta %s!", Integer.parseInt(input[0]), Integer.parseInt(input[1]), doorStatus));
			
		}
	}

}
