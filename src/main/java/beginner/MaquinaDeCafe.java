package beginner;

import java.util.Scanner;

public class MaquinaDeCafe {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
			
		int result = (c * 4) + (b * 2);
		
		if((a * 2) + (c * 2) < result)
			result = (a * 2) + (c * 2);
		if((a * 4) + (b * 2) < result)
			result = (a * 4) + (b * 2);
		
		System.out.println(result);
	}

}
