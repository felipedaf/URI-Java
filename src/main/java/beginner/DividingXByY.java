package beginner;

import java.util.Scanner;

public class DividingXByY {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int times = sc.nextInt();
		
		for(int i = 0 ; i < times ; i++) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			
			if(b == 0)
				System.out.println("divisao impossivel");
			else {
				System.out.println(a / b);
			}
		}
	}

}
