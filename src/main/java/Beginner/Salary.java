package Beginner;

import java.util.Scanner;

public class Salary {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int employeeNumber = sc.nextInt();
		int hourWorked = sc.nextInt();
		double hourPrice = sc.nextDouble();
		
		System.out.println("NUMBER = " + employeeNumber);
		System.out.println(String.format("SALARY = U$ %.2f", (hourWorked * hourPrice)));
	}

}
