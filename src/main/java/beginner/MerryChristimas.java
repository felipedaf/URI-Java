package beginner;

import java.util.Scanner;

public class MerryChristimas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int times = sc.nextInt();
		
		String felizNatal = "Feliz nat";
		String aQnt = "";
		
		for(int i = 0; i < times; i++) {
			aQnt += "a";
			
		}
		
		System.out.println(felizNatal + aQnt + "l!");
	}

}
