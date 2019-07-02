package beginner;

import java.util.Scanner;

public class Taxes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double salary = sc.nextDouble();
		
		double tax = 0;
		
		if(salary >= 2000.01) {
			if(salary <= 3000)
				tax += (salary - 2000) * 0.08;
			else
				tax += 1000 * 0.08;
		
			if(salary >= 3000.01) {
				if(salary <= 4500)
					tax += (salary - 3000) * 0.18;
				else
					tax += 1500 * 0.18;
			}
			if(salary > 4500)
				tax += (salary - 4500) * 0.28;
		
			System.out.println(String.format("R$ %.2f", tax));
		}
		else
			System.out.println("Isento");
	}

}
