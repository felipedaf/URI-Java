package beginner;

import java.util.Scanner;

public class Area {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] INPUT = sc.nextLine().split(" ");
		double A = Double.parseDouble(INPUT[0]);
		double B = Double.parseDouble(INPUT[1]);
		double C = Double.parseDouble(INPUT[2]);
		double pi = 3.14159;
		
		double triangleArea = (A * C) / 2;
		double circleArea = pi * C * C;
		double trapeziumArea = (A + B) * C / 2.0;
		double squareArea = B * B;
		double rectangleBArea = A * B;
		
		System.out.println(String.format("TRIANGULO: %.3f\nCIRCULO: %.3f\nTRAPEZIO: %.3f\nQUADRADO: %.3f\nRETANGULO: %.3f", triangleArea, circleArea, trapeziumArea, squareArea, rectangleBArea));
		
		
	}

}
