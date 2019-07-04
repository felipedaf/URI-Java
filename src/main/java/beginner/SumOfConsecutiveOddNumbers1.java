package beginner;

import java.util.Scanner;

public class SumOfConsecutiveOddNumbers1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int value1 = sc.nextInt();
		
		int value2 = sc.nextInt();
		
		int sum = 0;
		
		if(value1 > value2) {
			for(int i  = value2 + 1; i < value1; i++) {
				if(i % 2 != 0) {
					sum += i;
				}
			}
		}
		else {
			for(int i  = value1 + 1; i < value2; i++) {
				if(i % 2 != 0) {
					sum += i;
				}
			}
		}
		
		System.out.println(sum);
	}

}
