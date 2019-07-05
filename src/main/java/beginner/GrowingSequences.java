package beginner;

import java.util.Scanner;

public class GrowingSequences {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int sequence = sc.nextInt();
			
			if(sequence == 0)
				break;
			
			String output = "";
			for(int i = 1; i <= sequence; i++) {
				if(i != sequence)
					output += i + " ";
				else
					output += i;
			}
			System.out.println(output);
		}
		
		
	}

}
