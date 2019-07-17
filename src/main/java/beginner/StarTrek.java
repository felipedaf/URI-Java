package beginner;

import java.util.Scanner;

public class StarTrek {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int times = sc.nextInt();
		long[] stars = new long[times];
		
		for(int i = 0; i < times; i++) {
			stars[i] = sc.nextInt();
		}
		
		int i = 0;
		int max = 0;
		
		while(i >= 0 && i < times && stars[i] != 0) {
			if(i > max)
				max = i;
			if(stars[i] % 2 != 0) {
				stars[i]--;
				i++;
			}
			else {
				stars[i]--;
				i--;
			}
			
		}
		
		max++;
		
		long starNumber = 0;
		
		for(int j = 0; j < stars.length; j++) {
			starNumber += stars[j];
		}
		
		System.out.println(String.format("%d %d", max, starNumber));
	}

}
