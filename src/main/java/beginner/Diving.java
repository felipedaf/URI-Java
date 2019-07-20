package beginner;

import java.util.Scanner;

public class Diving {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int times = Integer.parseInt(sc.nextLine());
		
		
		for(int i = 0; i < times; i++) {
			boolean first = true;
			double smaller = 0, bigger = 0;
			
			String nome = sc.nextLine();
			
			double degree = Double.parseDouble(sc.nextLine());
			double sum = 0;
			
			String[] numbers = sc.nextLine().split(" ");
			for(String numb: numbers) {
				if(first) {
					smaller = Double.parseDouble(numb);
					bigger = Double.parseDouble(numb);
					first = false;
				}
				
				if(Double.parseDouble(numb) > bigger)
					bigger = Double.parseDouble(numb);
				
				if(Double.parseDouble(numb) < smaller)
					smaller = Double.parseDouble(numb);
				
				sum += Double.parseDouble(numb);
				
			}
			
			System.out.println(String.format("%s %.2f", nome, (sum - (smaller + bigger)) * degree));
			
		}
	}

}
