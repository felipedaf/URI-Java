package beginner;

import java.util.Scanner;

public class SalaryWithBonus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name = sc.nextLine();
		
		double fixedSalary = sc.nextDouble();
		double commission = sc.nextDouble() * 0.15;
		
		System.out.println(String.format("TOTAL = R$ %.2f", (fixedSalary + commission)));
	}

}
