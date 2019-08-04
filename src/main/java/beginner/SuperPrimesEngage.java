package beginner;

import java.util.Scanner;

public class SuperPrimesEngage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int number = sc.nextInt();
			
			
			if(isPrime(number)) {
				boolean superPrime = true;
				String stringNumber = String.valueOf(number);
				
				for(int i = 0; i < stringNumber.length(); i++) {
					if(!isPrime(Integer.parseInt(stringNumber.substring(i, i + 1)))){
						superPrime = false;
						break;
					}
				}
				
				if(superPrime)
					System.out.println("Super");
				else
					System.out.println("Primo");
				
			}
			else
				System.out.println("Nada");
			
			
		}
		sc.close();
	}
	
	public static boolean isPrime(int number) {
		if(number == 0 || number == 1)
			return false;
		
		for(int i = 2; i <= number/2; i++) {
			if(number % i == 0) {
				return false;
			}
			
		}
		return true;
	}

}
