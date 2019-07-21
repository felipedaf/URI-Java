package beginner;

import java.util.Scanner;

public class Internship {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			
			int times = Integer.parseInt(sc.nextLine());
			double sum1 = 0;
			double sum2 = 0;
			
			for(int i = 0; i < times; i++) {
				String[] values = sc.nextLine().split(" ");
				
				sum1 += Integer.parseInt(values[0]) * Integer.parseInt(values[1]);
				sum2 += Integer.parseInt(values[1]);
			}
			
			System.out.println(String.format("%.4f", sum1/(sum2 * 100)));
			
			
		}
		
	}

}
