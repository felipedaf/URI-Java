package beginner;

import java.util.Scanner;

public class GuilhermeAndHisKites {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long sides = Long.parseLong(sc.nextLine());
		long sum = (sides*(sides - 3))/2;
		
		
		System.out.println(sum);
	}

}
