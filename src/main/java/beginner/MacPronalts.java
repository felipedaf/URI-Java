package beginner;

import java.util.Scanner;

public class MacPronalts {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int productQuantity = sc.nextInt();
		
		double sum = 0;
		
		for(int i = 0; i < productQuantity; i++) {
			int productId = sc.nextInt();
			
			if(productId >= 1001 && productId <= 1005)
				sum += ((productId - 1000) + 0.5) * sc.nextInt();
			
		}
		
		System.out.println(String.format("%.2f", sum));
		
	}

}
