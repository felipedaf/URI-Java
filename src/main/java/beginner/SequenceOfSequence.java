package beginner;

import java.util.Scanner;

public class SequenceOfSequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		int casesNum = 1;
		
		while(sc.hasNext()) {
			number = sc.nextInt();
			System.out.print("Caso " + casesNum + ": ");
			
			int pa = ((0 + number) * (number + 1)) / 2;
			String numbers = pa == 0 ? "numero" : "numeros";
			
			System.out.println((pa + 1) + " " + numbers);
			
			for(int i = 0; i <= number; i++) {
				if(i == 0) {
					if(number == 0)
						System.out.println("0\n");
					else
						System.out.print("0 ");;
				}
				else {
					for(int j = 0; j < i; j++) {
						if(j == number - 1) {
							System.out.println(i + "\n");
						}
						else
							System.out.print(i+ " ");
					}
				}
				
			}
			
			casesNum++;
		}
		sc.close();
	}

}
