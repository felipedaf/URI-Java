package beginner;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BanknotesAndCoins {

	public static void main(String[] args) {

		//Integer money values
		int[] intMoney = new int[7];
		
		//Fractional money values
		float[] fracMoney = new float[5];
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0");
		
		float totalValue = sc.nextFloat();
		
		if(totalValue / 100 > 0) {
			intMoney[0] = (int) (totalValue / 100);
			totalValue %= 100;
		}
		if(totalValue / 50 > 0) {
			intMoney[1] = (int) (totalValue / 50);
			totalValue %= 50;
		}
		if(totalValue / 20 > 0) {
			intMoney[2] = (int) (totalValue / 20);
			totalValue %= 20;
		}
		if(totalValue / 10 > 0) {
			intMoney[3] = (int) (totalValue / 10);
			totalValue %= 10;
		}
		if(totalValue / 5 > 0) {
			intMoney[4] = (int) (totalValue / 5);
			totalValue %= 5;
		}
		if(totalValue / 2 > 0) {
			intMoney[5] = (int) (totalValue / 2);
			totalValue %= 2;
		}
		if(totalValue / 1 > 0) {
			intMoney[6] = (int) (totalValue / 1);
			totalValue %= 1;
		}
		
		if(totalValue / 0.5f >= 1) {
			fracMoney[0] = (totalValue / 0.5f);
			totalValue %= 0.5;
		}
		if(totalValue / 0.25f >= 1) {
			fracMoney[1] = (totalValue / 0.25f);
			totalValue %= 0.25;
		}
		if(totalValue / 0.1f >= 1) {
			fracMoney[2] = (totalValue / 0.1f);
			totalValue %= 0.1;
		}
		if(totalValue / 0.05f >= 1) {
			fracMoney[3] = (totalValue / 0.05f);
			totalValue %= 0.05;
		}
		if(totalValue / 0.01f >= 1) {
			fracMoney[4] = (totalValue / 0.01f);
			totalValue %= 0.01;
		}
		
		System.out.println(String.format("NOTAS:\n"
				+ "%d nota(s) de R$ 100.00\n"
				+ "%d nota(s) de R$ 50.00\n"
				+ "%d nota(s) de R$ 20.00\n"
				+ "%d nota(s) de R$ 10.00\n"
				+ "%d nota(s) de R$ 5.00\n"
				+ "%d nota(s) de R$ 2.00", intMoney[0], intMoney[1], intMoney[2], intMoney[3], intMoney[4], intMoney[5]));
		
		System.out.println(String.format("MOEDAS:\n"
				+ "%d moeda(s) de R$ 1.00\n"
				+ "%.0f moeda(s) de R$ 0.50\n"
				+ "%.0f moeda(s) de R$ 0.25\n"
				+ "%.0f moeda(s) de R$ 0.10\n"
				+ "%.0f moeda(s) de R$ 0.05\n"
				+ "%.0f moeda(s) de R$ 0.01", intMoney[6], fracMoney[0],fracMoney[1],fracMoney[2],fracMoney[3],fracMoney[4]));
		
	}

}
