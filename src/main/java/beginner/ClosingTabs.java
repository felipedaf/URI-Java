package beginner;

import java.util.Scanner;

public class ClosingTabs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int tabs = Integer.parseInt(input.split(" ")[0]), times = Integer.parseInt(input.split(" ")[1]);
		
		for(int i = 0; i < times; i++) {
			String action = sc.nextLine();
			
			if(action.equalsIgnoreCase("fechou"))
				tabs++;
			else if(action.equalsIgnoreCase("clicou"))
				tabs--;
			
		}
		
		System.out.println(tabs);
	}

}
