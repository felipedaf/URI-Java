package beginner;

import java.util.Scanner;

public class PeaksAndValleys {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int landscapeMeasures = sc.nextInt();
		boolean valid = true;
		boolean smaller = false;
		int lastHeight = 0;
		
		for(int i = 0; i < landscapeMeasures; i++) {
			int height = sc.nextInt();
			if(i > 0) {
				if(i == 1) {
					if(lastHeight > height)
						smaller = true;
					else if(lastHeight < height)
						smaller = false;
					else {
						valid = false;
						break;
					}
				}
				else {
					if(lastHeight > height) {
						if(smaller) {
							valid = false;
							break;
						}else
							smaller = true;
					}
					else if(lastHeight < height) {
						if(!smaller) {
							valid = false;
							break;
						}else
							smaller = false;
					}
					else {
						valid = false;
						break;
					}
				}
			}
			
			lastHeight = height;
		}
		
		if(valid)
			System.out.println("1");
		else
			System.out.println("0");
		
	}

}
