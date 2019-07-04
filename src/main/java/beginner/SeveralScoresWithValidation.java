package beginner;

import java.util.Scanner;

public class SeveralScoresWithValidation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		while(true) {
			boolean averageDone = false;
			int index = 0;
			double[] scores = new double[2];
			
			while(!averageDone) {
				scores[index] = sc.nextDouble();
				
				if(validate(scores[index]).equalsIgnoreCase("nota invalida")) {
					System.out.println(validate(scores[index]));
					continue;
				}
				if(index == 0) {
					index++;
					continue;
				}
				
				averageDone = true;
				System.out.println(String.format("media = %.2f", (scores[0] + scores[1]) / 2));
				
			}
			boolean validAnswer = false;
			boolean stop = false;
			
			while(!validAnswer) {
				System.out.println("novo calculo (1-sim 2-nao)");
				int answer = sc.nextInt();
				
				if(answer == 1 || answer == 2) {
					validAnswer = true;
					if(answer == 2)
						stop = true;
				}
				
			}
			
			if(stop)
				break;
			
			
		}
		
		
		
	}
	
	public static String validate(double score) {
		if(score <= 10 && score >= 0) {
			return String.valueOf(score);
		}
		
		return "nota invalida";
	}

}
