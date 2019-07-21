package beginner;

import java.util.Scanner;

public class LeadersImpeachment {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			double votes = sc.nextDouble();
			double positives = 0;
			
			for(int i = 0; i < votes; i++) {
				int vote = sc.nextInt();
				
				if(vote == 1)
					positives++;
			}
			
			if(positives/votes >= 2/3.0)
				System.out.println("impeachment");
			else
				System.out.println("acusacao arquivada");
		}
		sc.close();
	}

}
