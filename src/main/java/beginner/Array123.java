package beginner;

import java.util.Scanner;

public class Array123 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		while(sc.hasNext()) {
			size = sc.nextInt();
			
			
			int[][] numbers = new int[size][size];
			
			int x1 = 0;
			int x2 = numbers[0].length - 1;
			
			//diagonal
			for(int i = numbers.length - 1; i >= 0; i--) {
				for(int j = 0; j < numbers.length; j++) {
					if(j != x1 || j != x2)
						numbers[i][j] = 3;
				}
				numbers[i][x1] = 1;
				numbers[i][x2] = 2;
				
				x1++;
				x2--;
			}
			
			
			String output = "";
			
			for(int i = numbers.length - 1; i >= 0; i--) {
				String aux = "";
				for(int j = 0; j < numbers.length; j++) {
					aux += numbers[i][j];
				}
				if(i == 0)
					output += aux;
				else
					output += aux + "\n";
			}
			
			System.out.println(output);
		}
		sc.close();
	}

}
