package beginner;

import java.util.Scanner;

public class SimpleCalculate {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String firstProduct = sc.nextLine();
		String secondProduct = sc.nextLine();
		
		String[] products = new String[2];
		products[0] = firstProduct;
		products[1] = secondProduct;
		
		double value = 0;
		
		for(String product : products) {
			String[] splited = product.split(" ");
			value += Integer.parseInt(splited[1]) * Double.parseDouble(splited[2]);
		}
		
		System.out.println(String.format("VALOR A PAGAR: R$ %.2f", value));
		
		
		
	}

}
