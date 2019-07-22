package beginner;

import java.util.Scanner;

public class PizzaBeforeBH {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			String[] input = sc.nextLine().split(" ");
			
			int dates = Integer.parseInt(input[1]);
			int people = Integer.parseInt(input[0]);
			boolean printed = false;
			
			for(int i = 0; i < dates; i++) {
				String[] available = sc.nextLine().split(" ");
				boolean hasZero = false;
				String date = available[0];
				for(int j = 1; j < available.length; j++) {
					if(available[j].equalsIgnoreCase("0")) {
						hasZero = true;
						break;
					}
				}
				
				if(!hasZero && !printed) {
					System.out.println(date);
					printed = true;
				}
			}
			
			if(!printed)
				System.out.println("Pizza antes de FdI");
			
			
		}
	}

}
