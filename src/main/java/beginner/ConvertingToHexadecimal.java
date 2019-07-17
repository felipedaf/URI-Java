package beginner;

import java.util.Scanner;

public class ConvertingToHexadecimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number = Integer.parseInt(sc.nextLine());
		
		String[] hexadecimal = new String[9];
		int bit = 8;
		boolean ignore = true;
		
		while(number > 0 || bit >= 0) {
			
			if(number / (Math.pow(16, (bit))) >= 1 || !ignore){
				hexadecimal[8 - bit] = String.valueOf(number /(int) (Math.pow(16, (bit)))) ;
				number = (int) (number % (Math.pow(16,  bit)));
				ignore = false;
			}
			bit--;
				
		}
		
		String[] notation = {"A", "B", "C", "D", "E", "F"};
		String[] numbersToModify = {"10", "11", "12", "13", "14", "15"};
		String returnString = "";
		
		for(int i = 0; i < 9; i++) {
			if(hexadecimal[i] != null) {
				boolean contains = false;
				int index = 0;
				for(int j = 0; j < numbersToModify.length; j++) {
					if(hexadecimal[i].equalsIgnoreCase(numbersToModify[j])) {
						contains = true;
						returnString += String.format("%s", notation[Integer.parseInt(numbersToModify[j]) - 10]);
					}
				}
				if(!contains)
					returnString += hexadecimal[i];
			}
		}
		
		System.out.println(returnString);
		
	}

}
