package beginner;

import java.util.Scanner;

public class Triangle2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] input = sc.nextLine().split(" ");
		
		
		int indexA = 0;
		int indexB = indexA + 1;
		int indexC = indexB + 1;
		
		String returnString = "N";
		
		while(indexA < input.length - 2 ) {
			if(possibleTriangle(Integer.parseInt(input[indexA]), Integer.parseInt(input[indexB]), Integer.parseInt(input[indexC]))) {
				returnString = "S";
				break;
			}
			
			if(indexB == input.length - 2 && indexA <= input.length - 3) {
				indexA++;
				indexB = indexA + 1;
				indexC = indexB + 1;
				continue;
			}
			
			if(indexC == input.length - 1 && indexB < input.length - 2) {
				indexB++;
				indexC = indexB + 1;
				continue;
			}
		
			
			
			indexC++;	
		}
		
		System.out.println(returnString);
		
		
	}
	
	public static boolean possibleTriangle(int a, int b, int c) {
		if((a + b) > c && (b + c) > a && (a + c) > b)
			return true;
		
		return false;
	}

}
