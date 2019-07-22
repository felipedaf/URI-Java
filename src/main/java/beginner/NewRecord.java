package beginner;

import java.util.Scanner;

public class NewRecord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int trainings = sc.nextInt();
			
			boolean first = true;
			double record = 0;
			
			for(int i = 0; i < trainings; i++) {
				int trainingDuration = sc.nextInt();
				int kilometersRan = sc.nextInt();
				
				if(first) {
					record = kilometersRan/ (trainingDuration + 0.0);
					first = false;
					System.out.println(i + 1);
				}
				
				if(kilometersRan / (trainingDuration + 0.0) > record) {
					System.out.println(i + 1);
					record = kilometersRan / (trainingDuration + 0.0);
				}
			}
			
		}
		
		sc.close();
	}
	

}
