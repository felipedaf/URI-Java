package beginner;

import java.util.Scanner;

public class TheMotionPicture {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double percentageA = sc.nextDouble();
		double percentageB = sc.nextDouble();
		
		double increase = ((percentageB / percentageA) * 100) - 100;
		System.out.println(String.format("%.2f%%", increase));
	}

}
