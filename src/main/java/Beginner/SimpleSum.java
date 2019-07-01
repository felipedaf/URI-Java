package Beginner;

import java.util.Scanner;

public class SimpleSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int SOMA = A + B;
		System.out.println(String.format("SOMA = %d", SOMA));
	}

}
