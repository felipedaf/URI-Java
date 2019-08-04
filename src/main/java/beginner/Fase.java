package beginner;

import java.util.Scanner;

public class Fase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int competitors = sc.nextInt();
		int classified = sc.nextInt();
		int[] grades = new int[classified];
		int[] placingCounter = new int[classified];
		
		for(int i = 0; i < competitors; i++) {
			int grade = sc.nextInt();
			
			for(int j = 0; j < grades.length; j++) {
				
				if(grade == grades[j]) {
					placingCounter[j]++;
					break;
				}
				
				else if(grade > grades[j]) {
					for(int g = grades.length - 1; g > j; g--) {
						grades[g] = grades[g - 1];
						placingCounter[g] = placingCounter[g - 1];
					}
					grades[j] = grade;
					placingCounter[j] = 1;
					break;
				}
			}
			
			
		}
		
		int finalResult = 0;
		int indexSelect = 0;
		for(int i = 0; i < classified; i++) {
			
			if(i == classified - 1) {
				finalResult += placingCounter[indexSelect];
				break;
			}
			
			if(placingCounter[indexSelect] > 0) {
				finalResult++;
				placingCounter[indexSelect]--;
			}
			
			if(placingCounter[indexSelect] == 0) {
				indexSelect++;
			}
		}
		
		System.out.println(finalResult);
	}

}
