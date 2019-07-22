package beginner;

import java.util.Scanner;

public class Greyscale {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int times = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < times; i++) {
			String option = sc.nextLine();
			
			String[] inputNumbers = sc.nextLine().split(" ");
			
			int caseNum = i+1;
			
			int output = -1;
			
			if(option.equalsIgnoreCase("min")) {
				int min = Integer.parseInt(inputNumbers[0]);
				
				for(int j = 0; j < 3; j++) {
					if(Integer.parseInt(inputNumbers[j]) < min)
						min = Integer.parseInt(inputNumbers[j]);
				}
				
				output = min;
			}
			
			else if(option.equalsIgnoreCase("max")) {
				int max = Integer.parseInt(inputNumbers[0]);
				
				for(int j = 0; j < 3; j++) {
					if(Integer.parseInt(inputNumbers[j]) > max)
						max = Integer.parseInt(inputNumbers[j]);
				}
				
				output = max;
				
			}
			
			else if(option.equalsIgnoreCase("mean")) {
				int mean = 0;
				
				for(int j = 0; j < 3; j++) {
					mean += Integer.parseInt(inputNumbers[j]);
				}
				
				output = mean/3;
			}
			
			else if(option.equalsIgnoreCase("eye"))
				output = (int) ((Integer.parseInt(inputNumbers[0]) * 0.3) + (Integer.parseInt(inputNumbers[1]) * 0.59) + (Integer.parseInt(inputNumbers[2]) * 0.11));
				
			
			System.out.println(String.format("Caso #%d: %d", caseNum, output));
		}
	}

}
