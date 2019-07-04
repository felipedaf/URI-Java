package beginner;

import java.util.Scanner;

public class Experiments {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String testCase = sc.nextLine();
		
		int rabbits = 0;
		int rats = 0;
		int frogs = 0;
		
		
		for(int i = 0; i < Integer.parseInt(testCase); i++) {
			String[] tests = sc.nextLine().split(" ");
			
			if(tests[1].equalsIgnoreCase("C"))
				rabbits += Integer.parseInt(tests[0]);
			else if(tests[1].equalsIgnoreCase("R"))
				rats += Integer.parseInt(tests[0]);
			else if(tests[1].equalsIgnoreCase("S"))
				frogs += Integer.parseInt(tests[0]);
		}
		
		int total = rabbits + rats + frogs;
		
		System.out.println(String.format("Total: %d cobaias", total));
		System.out.println(String.format("Total de coelhos: %d", rabbits));
		System.out.println(String.format("Total de ratos: %d", rats));
		System.out.println(String.format("Total de sapos: %d", frogs));
		System.out.println(String.format("Percentual de coelhos: %.2f %%", ((double) (rabbits * 100)/total)));
		System.out.println(String.format("Percentual de ratos: %.2f %%", ((double) (rats * 100)/total)));
		System.out.println(String.format("Percentual de sapos: %.2f %%", ((double) (frogs* 100)/total)));
	}

}
