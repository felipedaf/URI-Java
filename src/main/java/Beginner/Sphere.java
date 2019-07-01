package Beginner;

import java.util.Scanner;

public class Sphere {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		
		double radius = sc.nextDouble();
		
		double VOLUME = (4.0/3) * pi * Math.pow(radius, 3);
		System.out.println(String.format("VOLUME = %.3f", VOLUME));
	}

}
