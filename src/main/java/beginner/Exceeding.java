package beginner;

import java.util.Scanner;

public class Exceeding {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		int x = sc.nextInt();
		int z = x - 1;
		
		while(z <= x) {
			z = sc.nextInt();
		}
		
		int sum = 0;
		int times = 0;
		
		for(int i = x; sum <= z; i++) {
			sum += i;
			times++;
		}
		
		System.out.println(times);
		
		
		
		
		
	}

}
