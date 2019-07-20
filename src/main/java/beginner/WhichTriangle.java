package beginner;

import java.util.Scanner;

public class WhichTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sideA = sc.nextInt();
		
		int sideB = sc.nextInt();
		
		int sideC = sc.nextInt();
		
		if((sideA + sideB) > sideC && (sideB + sideC) > sideA && (sideA + sideC) > sideB) {
			if(sideA == sideB && sideB == sideC)
				System.out.println("Valido-Equilatero");
			
			else if(sideA == sideB || sideA == sideC || sideB == sideC)
				System.out.println("Valido-Isoceles");
			
			else
				System.out.println("Valido-Escaleno");
			
			
			if((Math.pow(sideA, 2) - Math.pow(sideB, 2) - Math.pow(sideC, 2)) == 0 || (Math.pow(sideB, 2) - Math.pow(sideA, 2) - Math.pow(sideC, 2)) == 0 || (Math.pow(sideC, 2) - Math.pow(sideB, 2) - Math.pow(sideA, 2)) == 0)
				System.out.println("Retangulo: S");
			else
				System.out.println("Retangulo: N");
					
		}
		else {
			System.out.println("Invalido");
		}
		
	}

}
