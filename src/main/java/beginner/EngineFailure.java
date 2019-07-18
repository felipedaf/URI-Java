package beginner;

import java.util.Scanner;

public class EngineFailure {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int measures = sc.nextInt();
		boolean first = true;
		int lastMeasure = 0;
		for(int i = 0; i < measures; i++) {
			int measure = sc.nextInt();
			
			if(i > 0 && first && lastMeasure > measure) {
				first = false;
				System.out.println(i + 1);
			}
				
			lastMeasure = measure;
		}
		
		if(first)
			System.out.println("0");
	}

}
