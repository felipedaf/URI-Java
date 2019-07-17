package beginner;

import java.util.Scanner;

public class TheChosen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
		
		double biggerGrade = 0;
		int biggerGradeId = 0;
		
		for(int i = 0; i < times; i++) {
			int nextBiggerGradeId = sc.nextInt();
			
			double nextBiggerGrade = sc.nextDouble();
			
			if(biggerGrade < nextBiggerGrade) {
				biggerGrade = nextBiggerGrade;
				biggerGradeId = nextBiggerGradeId;
			}
			
		}
		
		if(biggerGrade >= 8)
			System.out.println(biggerGradeId);
		else
			System.out.println("Minimum note not reached");
		
	}

}
