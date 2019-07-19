package beginner;

import java.util.Scanner;

public class Event {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int increase;
		long value;
		
		while(true) {
			increase = sc.nextInt();
			value = sc.nextLong();
			
			if(increase == 0 && value == 0)
				break;
			
			System.out.println(increase * value);
			
		}

	}

}