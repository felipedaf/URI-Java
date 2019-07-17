package beginner;

import java.util.Scanner;

public class HoneyReservoir {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double volume, diameter;
		
		while(sc.hasNext()) {
			volume = sc.nextDouble();
			diameter = sc.nextDouble();
			
			double area = 3.14 * (Math.pow((diameter / 2), 2));
			double height = volume / area;
			
			System.out.println(String.format("ALTURA = %.2f", height));
			System.out.println(String.format("AREA = %.2f", area));
		}
		sc.close();
	}

}
