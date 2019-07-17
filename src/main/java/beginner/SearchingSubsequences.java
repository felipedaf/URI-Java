package beginner;

import java.util.Scanner;

public class SearchingSubsequences {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int caseNumber = 0;
		
		while(sc.hasNext()) {
			caseNumber++;
			String subsequence = sc.nextLine();
			String totalString = sc.nextLine();
			
			int subsequencesNum = 0;
			int nextStartChar = 0;
			int lastValidSubsequencePosition = 0;
			boolean jump = false;
			
			for(int i = 0; i < totalString.length(); i = jump? nextStartChar : ++i) {
				boolean isValid = true;
				jump = false;
				
				if(totalString.charAt(i) == subsequence.charAt(0) && totalString.length() - i >= subsequence.length()) {
					int correspondent = i;
					boolean firstJump = true;
					
					for(int j = 0; j < subsequence.length(); j++) {
						if(totalString.charAt(correspondent) != subsequence.charAt(j)) {
							isValid = false;
							break;
						}
						
						if(totalString.charAt(correspondent) == subsequence.charAt(0) && firstJump && correspondent != i) {
							nextStartChar = correspondent;
							jump = true;
							firstJump = false;
						}
						
						correspondent++;
						
						
					}
					
					if(isValid) {
						subsequencesNum++;
						lastValidSubsequencePosition = i;
					}
					
				}
				
			}
			
			System.out.println(String.format("Caso #%d:", caseNumber));
			if(subsequencesNum > 0) {
				System.out.println(String.format("Qtd.Subsequencias: %d", subsequencesNum));
				System.out.println(String.format("Pos: %d\n", lastValidSubsequencePosition + 1));
			}
			else
				System.out.println("Nao existe subsequencia\n");
			
			
			
		}
		
		sc.close();
		
	}

}
