package beginner;

import java.util.Scanner;

public class SequenceOfNumbersAndSum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a <= 0 || b <= 0)
				break;
			
			if(a > b) {
				int c = a;
				a = b;
				b = c;
			}
			
			String output = "";
			int sum = 0;
			
			for(int i = a; i <= b; i++) {
				sum += i;
				output += i + " ";
			}
			
			System.out.println(String.format("%sSum=%d", output, sum));
		}
		
		
		
	}

}
