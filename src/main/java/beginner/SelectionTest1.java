package beginner;

import java.util.Scanner;

public class SelectionTest1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] input = sc.nextLine().split(" ");
		
		int A = Integer.parseInt(input[0]);
		int B = Integer.parseInt(input[1]);
		int C = Integer.parseInt(input[2]);
		int D = Integer.parseInt(input[3]);
		
		if((B > C && D > A) && (C + D > A + B) && C > 0 && D > 0 && A > 0) {
			System.out.println("Valores aceitos");
		}
		else
			System.out.println("Valores nao aceitos");
		
		
	}

}
