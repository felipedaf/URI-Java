package beginner;

import java.util.Scanner;

public class DecipheringTheEncryptedCard {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			String[] input = sc.nextLine().trim().split(" ");
			String characters = sc.nextLine();
			String encrypted = sc.nextLine();
			String[] encrypt = new String[Integer.parseInt(input[0]) * 2]; 
			
			for(int i = 0; i < Integer.parseInt(input[0]); i++) {
				int b = i * 2;
				encrypt[b] = encrypted.substring(i, i+1).toLowerCase();
				encrypt[b + 1] = characters.substring(i, i + 1).toLowerCase();
			}
			
			for(int i = 0; i < Integer.parseInt(input[1]); i++) {
				String message = sc.nextLine();
				String rMessage = "";
				
				for(int j = 0; j < message.length(); j++) {
					boolean contains = false;
					boolean upper = false;
					int charIndex = 0;
					String notAlphabetic = ".,;:()!?@#$%¨&*()_+-='1234567890!@#$%|&*() ";
					
					for(int q = 0; q < encrypt.length; q++) {
						if(encrypt[q].equalsIgnoreCase(message.substring(j, j + 1))) {
							contains = true;
							
							if(!notAlphabetic.contains(message.substring(j, j + 1)) && message.substring(j, j + 1).toUpperCase().equals(message.substring(j, j + 1)))
								upper = true;
							
							if(q % 2 == 0)
								charIndex = q + 1;
							else
								charIndex = q - 1;
							break;
						}
					}
					
					if(contains)
						if(upper)
							rMessage += encrypt[charIndex].toUpperCase();
						else
							rMessage += encrypt[charIndex];
					else
						rMessage += message.charAt(j);
				}
				
				System.out.println(rMessage);
				
				if(i == Integer.parseInt(input[1]) - 1)
					System.out.println();
			}
			
			
		}
		
		
	}

}
