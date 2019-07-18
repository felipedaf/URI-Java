package beginner;

import java.util.Scanner;

public class SquareRootOf2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(String.format("%.10f", 1 + squareOfRoot2(sc.nextInt())));
		
	}
	
	public static double squareOfRoot2(int n) {
		if(n == 1)
			return (1 / 2.0);
		else if(n == 0)
			return 0;
		
		
		return (1/(2.0 + squareOfRoot2(n - 1)));
	}

}
