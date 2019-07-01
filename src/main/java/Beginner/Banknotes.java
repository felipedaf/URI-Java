package beginner;

import java.util.Scanner;

public class Banknotes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] moneyValues = new int[7];
		
		int totalValue = sc.nextInt();
		int initialValue = totalValue;
		
		
		int qntCash = 0;
		
		if(totalValue / 100 > 0) {
			qntCash = totalValue / 100;
			moneyValues[0] = qntCash;
			totalValue -= qntCash * 100;
			
		}
		if(totalValue / 50 > 0) {
			qntCash = totalValue / 50;
			moneyValues[1] = qntCash;
			totalValue -= qntCash * 50;
			
		}
		if(totalValue / 20 > 0) {
			qntCash = totalValue / 20;
			moneyValues[2] = qntCash;
			totalValue -= qntCash * 20;
			
		}
		if(totalValue / 10 > 0) {
			qntCash = totalValue / 10;
			moneyValues[3] = qntCash;
			totalValue -= qntCash * 10;
			
		}
		if(totalValue / 5 > 0) {
			qntCash = totalValue / 5;
			moneyValues[4] = qntCash;
			totalValue -= qntCash * 5;
			
		}
		if(totalValue / 2 > 0) {
			qntCash = totalValue / 2;
			moneyValues[5] = qntCash;
			totalValue -= qntCash * 2;
			
		}
		if(totalValue / 1 > 0) {
			qntCash = totalValue / 1;
			moneyValues[6] = qntCash;
			totalValue -= qntCash * 1;
			
		}
		
		System.out.println(String.format("%d\n"
				+ "%d nota(s) de R$ 100,00\n"
				+ "%d nota(s) de R$ 50,00\n"
				+ "%d nota(s) de R$ 20,00\n"
				+ "%d nota(s) de R$ 10,00\n"
				+ "%d nota(s) de R$ 5,00\n"
				+ "%d nota(s) de R$ 2,00\n"
				+ "%d nota(s) de R$ 1,00", 
				initialValue, moneyValues[0], moneyValues[1], moneyValues[2], moneyValues[3], moneyValues[4], moneyValues[5], moneyValues[6]));
	}

}
