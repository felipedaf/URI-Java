package beginner;

import java.util.Scanner;

public class TypeOfFuel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int alcohol = 0;
		int gasoline = 0;
		int diesel = 0;
		
		while(true) {
			int selection = sc.nextInt();
			
			if(selection == 1)
				alcohol++;
			else if(selection == 2)
				gasoline++;
			else if(selection == 3)
				diesel++;
			else if(selection == 4)
				break;
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println(String.format("Alcool: %d", alcohol));
		System.out.println(String.format("Gasolina: %d", gasoline));
		System.out.println(String.format("Diesel: %d", diesel));
		
		
		
	}

}
