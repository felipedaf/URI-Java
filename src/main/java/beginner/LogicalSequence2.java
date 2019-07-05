package beginner;

import java.util.Scanner;

public class LogicalSequence2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int perLine = sc.nextInt();
		
		int limit = sc.nextInt();
		
		for(int i = 1; i <= limit; i += perLine) {
			String aux = "";
			for(int j = i; j < i + perLine; j++) {
				if(j <= limit) {
					if(j < i + perLine - 1 && j != limit)
						aux += j + " ";
					else
						aux += j;
				}
			}
			System.out.println(aux);
		}
		
		
	}

}
