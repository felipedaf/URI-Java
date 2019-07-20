package beginner;

import java.util.Scanner;

public class JogoDoOperador {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int casesNum = Integer.parseInt(sc.nextLine().trim());
			
			String[] cases = new String[casesNum];
			
			for(int i = 0; i < casesNum; i++) {
				cases[i] = sc.nextLine().trim();
				
			}
			
			String[] nameThatArentCorrect = new String[casesNum];
			int contRight = 0;
			
			for(int i = 0; i < casesNum; i++) {
				String[] answer = sc.nextLine().split(" ");
				int index = Integer.parseInt(answer[1]) - 1;
				
				int firstNumber = Integer.parseInt(cases[index].split(" ")[0]);
				int secondNumber = Integer.parseInt(cases[index].split(" ")[1].split("=")[0]);
				int result = Integer.parseInt(cases[index].split(" ")[1].split("=")[1]);
				boolean possible = false;
				
				if(firstNumber + secondNumber == result || firstNumber - secondNumber == result || firstNumber * secondNumber == result)
					possible = true;
				
				if(!possible && answer[2].equals("I")) {
					contRight++;
					continue;
				}
				
				else if(possible) {
					if(firstNumber + secondNumber == result && answer[2].equalsIgnoreCase("+")) {
						contRight++;
						continue;
					}
					
					else if(firstNumber - secondNumber == result && answer[2].equalsIgnoreCase("-")) {
						contRight++;
						continue;
					}
					
					else if(firstNumber * secondNumber == result && answer[2].equalsIgnoreCase("*")) {
						contRight++;
						continue;
					}
					
				}
				
				nameThatArentCorrect[i] = answer[0];	
			}
			
			for(int i = 0; i < nameThatArentCorrect.length - 1; i++) {
				if(nameThatArentCorrect[i] == null)
					continue;
				for(int j = i + 1; j < nameThatArentCorrect.length; j++) {
					if(nameThatArentCorrect[j] == null)
						continue;
					
					if(nameThatArentCorrect[j].compareTo(nameThatArentCorrect[i]) < 0) {
						String swap = nameThatArentCorrect[j];
						nameThatArentCorrect[j] = nameThatArentCorrect[i];
						nameThatArentCorrect[i] = swap;
					}
				}
			}
			
			if(contRight == 0)
				System.out.println("None Shall Pass!");
			else if(contRight == casesNum)
				System.out.println("You Shall All Pass!");
			else if(contRight < casesNum) {
				int cont = 0;
				for(int i = 0; i < casesNum; i++) {
					if(nameThatArentCorrect[i] == null)
						continue;
					if(cont == (casesNum - contRight) - 1)
						System.out.println(nameThatArentCorrect[i]);
					else
						System.out.print(nameThatArentCorrect[i] + " ");
					cont++;
				}
			}
			
			
		}
		sc.close();
	}

}
