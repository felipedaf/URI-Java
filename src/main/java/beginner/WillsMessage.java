package beginner;

import java.util.Scanner;

public class WillsMessage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			String order = sc.nextLine();
			
			int numberQnt = Integer.parseInt(sc.nextLine());
			
			String[] caracteres = sc.nextLine().split(" ");
			
			String returnString = "";
			
			for(String caractere: caracteres) {
				returnString += order.charAt(Integer.parseInt(caractere) - 1);
			}
			
			System.out.println(returnString);
		}
		sc.close();
	}

}
