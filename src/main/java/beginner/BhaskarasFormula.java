package beginner;

import java.util.Scanner;

public class BhaskarasFormula {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] input = sc.nextLine().split(" ");
		
		double A = Double.parseDouble(input[0]);
		double B = Double.parseDouble(input[1]);
		double C = Double.parseDouble(input[2]);
		
		double delta = (B * B) - (4.0 * A * C);
		double root1 = (-B + Math.sqrt(delta))/ (2.0 * A);
		double root2 = (-B - Math.sqrt(delta))/ (2.0 * A);
		
		if(A != 0 && delta >= 0)
			System.out.println(String.format("R1 = %.5f\n"
					+ "R2 = %.5f", root1, root2));
		else
			System.out.println("Impossivel calcular");
	}

}
