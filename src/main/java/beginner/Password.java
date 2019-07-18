package beginner;

import java.util.Scanner;

public class Password {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int answer = sc.nextInt();
			
			System.out.println(answer - 1);
			
		}
		sc.close();
	}

}
