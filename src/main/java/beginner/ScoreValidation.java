package beginner;

import java.util.Scanner;

public class ScoreValidation {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		double sum = 0;
		int cont = 0;
		while(true && cont < 2) {
			double input = sc.nextDouble();
			
			if(validate(input).equalsIgnoreCase("nota invalida"))
				System.out.println(validate(input));
			else {
				sum += Double.parseDouble(validate(input));
				cont++;
			}
		}
		
		System.out.println(String.format("media = %.2f", sum/2));
	}
	
	private static String validate(double score) {
		if(score >= 0 && score <= 10) {
			return String.valueOf(score);
		}
		
		return "nota invalida";
	}

}
