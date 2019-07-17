package beginner;

import java.util.Scanner;

public class ALongLongTimeAgo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long times = sc.nextLong();
		
		for(int i = 0; i < times; i++) {
			long yearsAgo = sc.nextLong();
			
			if(2015 - yearsAgo <= 0)
				System.out.println(String.format("%d A.C.", (2014 - yearsAgo)*-1));
			else
				System.out.println(String.format("%d D.C.", (2015 - yearsAgo)));
		}
		
		
	}

}
