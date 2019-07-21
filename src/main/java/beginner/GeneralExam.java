package beginner;

import java.util.Scanner;

public class GeneralExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int gradesQnt = sc.nextInt();
			int outputQnt = sc.nextInt();
			
			int[] grades = new int[gradesQnt];
			
			for(int i = 0; i < gradesQnt; i++) {
				grades[i] = sc.nextInt();
			}
			
			for(int i = 0; i < grades.length - 1; i++) {
				for(int j = i + 1; j < grades.length; j++) {
					if(grades[j] > grades[i]) {
						int swap = grades[j];
						grades[j] = grades[i];
						grades[i] = swap;
					}
				}
			}
			
			for(int i = 0; i < outputQnt; i++) {
				System.out.println(grades[sc.nextInt() - 1]);
			}
			
		}
		sc.close();
		
	}

}
