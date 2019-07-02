package beginner;

import java.util.Scanner;

public class TriangleTypes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double[] triangleSides = new double[3];
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		triangleSides[0] = a;
		triangleSides[1] = b;
		triangleSides[2] = c;
		
		for(int i = 0; i < triangleSides.length - 1; i++) {
			int bigger = i;
			for(int j = i + 1; j < triangleSides.length; j++) {
				
				if(triangleSides[bigger] < triangleSides[j])
					bigger = j;
			}
			double swap = triangleSides[i];
			triangleSides[i] = triangleSides[bigger];
			triangleSides[bigger] = swap;
			
		}
		
		a = triangleSides[0];
		b = triangleSides[1];
		c = triangleSides[2];
		
		
		if(a >= b + c)
			System.out.println("NAO FORMA TRIANGULO");
		else {
			if((a * a) == (b * b) + (c * c))
				System.out.println("TRIANGULO RETANGULO");
			if((a * a) > (b * b) + (c * c))
				System.out.println("TRIANGULO OBTUSANGULO");
			if((a * a) < (b * b) + (c * c))
				System.out.println("TRIANGULO ACUTANGULO");
			if(a == b && b == c)
				System.out.println("TRIANGULO EQUILATERO");
			if((a == b && b != c) || (a == c && c != b) || (b == c && c != a))
				System.out.println("TRIANGULO ISOSCELES");
		}		
			
	}

}
