package beginner;

import java.util.Scanner;

public class AreaOfCircle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double R = sc.nextDouble();
		double A = 3.14159 * R * R;
		System.out.println(String.format("A=%.4f", A));
	}

}
