package beginner;

import java.util.Scanner;

public class CoordinatesOfAPoint {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String[] points = sc.nextLine().split(" ");
		
		double x = Double.parseDouble(points[0]);
		double y = Double.parseDouble(points[1]);
		
		String output = "";
		if(x == 0 && y == 0)
			output = "Origem";
		
		else if(x == 0)
			output = "Eixo Y";
		
		else if(y == 0)
			output = "Eixo X";
		
		else if(x > 0 && y > 0)
			output = "Q1";
		else if(x < 0 && y > 0)
			output = "Q2";
		else if(x < 0 && y < 0)
			output = "Q3";
		else if(x > 0 && y < 0)
			output = "Q4";
		
		System.out.println(output);
	}

}
