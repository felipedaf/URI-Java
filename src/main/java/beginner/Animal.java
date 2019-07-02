package beginner;

import java.util.Scanner;

public class Animal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String vertebra = sc.next();
		String type = sc.next();
		String feeding = sc.next();
		
		if(vertebra.equals("vertebrado")) {
			if(type.equals("ave")) {
				
				if(feeding.equals("carnivoro"))
					System.out.println("aguia");
				else if(feeding.equals("onivoro"))
					System.out.println("pomba");
									
			}
			else if(type.equals("mamifero")) {
				
				if(feeding.equals("onivoro"))
					System.out.println("homem");
				else if(feeding.equals("herbivoro"))	
					System.out.println("vaca");
				
			}
		}
		else if(vertebra.equalsIgnoreCase("invertebrado")) {
			if(type.equals("inseto")) {	
				if(feeding.equals("hematofago"))
					System.out.println("pulga");
				else if(feeding.equals("herbivoro"))
					System.out.println("lagarta");
			}
			
			else if(type.equals("anelideo")) {
				if(feeding.equals("hematofago"))
					System.out.println("sanguessuga");
				if(feeding.equals("onivoro"))
					System.out.println("minhoca");
			}
		}
		
		
		
	}

}
