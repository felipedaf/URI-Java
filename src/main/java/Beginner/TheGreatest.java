package Beginner;

import java.util.Scanner;

public class TheGreatest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] values = sc.nextLine().split(" ");
		int A = Integer.valueOf(values[0]);
		int B = Integer.valueOf(values[1]);
		int C = Integer.valueOf(values[2]);
		
		int maiorAB = (A + B + Math.abs(A - B)) / 2;
		int maior = maiorAB > C ? maiorAB : C;
		
		System.out.println(String.format("%d eh o maior", maior));
		
	}

}
