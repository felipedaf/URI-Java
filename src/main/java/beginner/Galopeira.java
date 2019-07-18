package beginner;

import java.util.Scanner;

public class Galopeira {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int times = Integer.parseInt(sc.nextLine());
		
		while(times > 0) {
			double qnt = 0.09;
			String galopeira = sc.nextLine();
			
			for(int i = 6; i < galopeira.length(); i++) {
				if(galopeira.charAt(i) == 'e')
					qnt += 0.01;
				else
					break;
			}
			
			System.out.println(String.format("%.2f", qnt));
			times--;
		}
	}

}
