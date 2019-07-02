package beginner;

import java.util.Scanner;

public class SalaryIncrease {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double salary = sc.nextDouble();
		
		double moneyEarned = -1;
		
		double inPercentage = 0;
		
		if(salary >= 0 && salary <= 400)
			inPercentage = 0.15;
		
		else if(salary > 400.01 && salary <= 800)
			inPercentage = 0.12;
		
		else if(salary >= 800.01 && salary <= 1200)
			inPercentage = 0.10;
		
		else if(salary >= 1200.01 && salary <= 2000)
			inPercentage = 0.07;
		
		else if(salary > 2000)
			inPercentage = 0.04;
		
		
		
		
		moneyEarned = inPercentage * salary;
		salary = salary + moneyEarned;
		
		
		System.out.println(String.format("Novo salario: %.2f\n"
										+ "Reajuste ganho: %.2f\n"
										+ "Em percentual: %.0f %%", salary, moneyEarned, inPercentage * 100));
	}

}
