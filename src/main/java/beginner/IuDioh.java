package beginner;

import java.util.Scanner;

public class IuDioh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int attributes = sc.nextInt();
			
			int marcosCardsQnt = sc.nextInt();
			int leonardoCardsQnt = sc.nextInt();
			
			int[][] marcosCards = new int[marcosCardsQnt][attributes];
			int[][] leonardoCards = new int[leonardoCardsQnt][attributes];
			
			for(int i = 0; i < marcosCardsQnt; i++) {
				for(int j = 0; j < attributes; j++) {
					marcosCards[i][j] = sc.nextInt();
				}
			}
			
			for(int i = 0; i < leonardoCardsQnt; i++) {
				for(int j = 0; j < attributes; j++) {
					leonardoCards[i][j] = sc.nextInt();
				}
			}
			
			int selectedMarcosCard = sc.nextInt() - 1;
			int selectedLeonardoCard = sc.nextInt() - 1;
			int attribute = sc.nextInt() - 1;
			
			if(marcosCards[selectedMarcosCard][attribute] > leonardoCards[selectedLeonardoCard][attribute])
				System.out.println("Marcos");
			else if(marcosCards[selectedMarcosCard][attribute] < leonardoCards[selectedLeonardoCard][attribute])
				System.out.println("Leonardo");
			else
				System.out.println("Empate");
			
			
			
		}
		sc.close();
		
	}

}
