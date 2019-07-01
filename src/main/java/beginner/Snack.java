package beginner;

import java.util.Scanner;

public class Snack {

	public static void main(String[] args) {

		final double cachorroQuente = 4.0;
		final double xSalada = 4.5;
		final double xBacon = 5.0;
		final double torradaSimples = 2.0;
		final double refrigerante = 1.5;
		
		Scanner sc = new Scanner(System.in);
		
		String[] order = sc.nextLine().split(" ");
		
		double valor = 0;
		
		if(order[0].equals("1"))
			valor = cachorroQuente;
		else if(order[0].equals("2"))
			valor = xSalada;
		else if(order[0].equals("3"))
			valor = xBacon;
		else if(order[0].equals("4"))
			valor = torradaSimples;
		else if(order[0].equals("5"))
			valor = refrigerante;
		
		System.out.println(String.format("Total: R$ %.2f", valor * Integer.parseInt(order[1])));
		
		
	}

}
