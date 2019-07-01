package Beginner;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] line1 = sc.nextLine().split(" ");
		String[] line2 = sc.nextLine().split(" ");
		
		double deltaX = (Double.parseDouble(line2[0]) - Double.parseDouble(line1[0])) * (Double.parseDouble(line2[0]) - Double.parseDouble(line1[0]));
		double deltaY = (Double.parseDouble(line2[1]) - Double.parseDouble(line1[1])) * (Double.parseDouble(line2[1]) - Double.parseDouble(line1[1]));
		
		double distance = Math.sqrt(deltaX + deltaY);
		
		System.out.println(String.format("%.4f", distance));
		
	}
}
