package beginner;

import java.util.Scanner;

public class SumOfConsecutiveOddNumbers3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int cases = sc.nextInt();
		int input1 = 0;
		int sum = 0;
		while(cases > 0) {
			sum = 0;
			input1 = sc.nextInt();
			int input2 = sc.nextInt();
			int odds = 0;
			while(odds < input2) {
				if(input1 % 2 != 0) {
					odds++;
					sum += input1;
				}
				
				input1++;
			}
			System.out.println(sum);
			cases--;
		}
		
		
		
	}

}
