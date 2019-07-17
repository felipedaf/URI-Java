package beginner;

import java.util.Scanner;

public class IdentifyTea {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int teaType = Integer.parseInt(sc.nextLine());
		String[] answers = sc.nextLine().split(" ");
		int sum = 0;
		
		for(int i = 0; i < answers.length; i++) {
			if(Integer.parseInt(answers[i]) == teaType)
				sum++;
		}
		
		System.out.println(sum);
		
	}
}
