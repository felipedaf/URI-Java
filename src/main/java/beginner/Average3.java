package beginner;

import java.util.Scanner;

public class Average3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] grades = sc.nextLine().split(" ");
		
		final int weight1 = 2;
		final int weight2 = 3;
		final int weight3 = 4;
		final int weight4 = 1;
		
		float average = ((Float.parseFloat(grades[0]) * weight1) + (Float.parseFloat(grades[1]) * weight2)
								+ (Float.parseFloat(grades[2]) * weight3) + (Float.parseFloat(grades[3]) * weight4))
								/ (weight1 + weight2 + weight3 + weight4);
		
				
		System.out.println(String.format("Media: %.1f", average));
		if(average >= 7)
			System.out.println("Aluno aprovado.");
		
		else if(average < 5)
			System.out.println("Aluno reprovado.");
		
		else if(average >= 5 && average <= 6.9) {
			System.out.println("Aluno em exame.");
			float finalTest = sc.nextFloat();
			System.out.println(String.format("Nota do exame: %.1f", finalTest));
			float finalAverage = (average + finalTest) / 2f;
			if(finalAverage >= 5)
				System.out.println("Aluno aprovado.");
			else
				System.out.println("Aluno reprovado.");
			System.out.println(String.format("Media final: %.1f", finalAverage));
		}
		
		
	}

}
