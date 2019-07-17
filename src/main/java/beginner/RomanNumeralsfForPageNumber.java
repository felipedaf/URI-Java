package beginner;

import java.util.Scanner;

public class RomanNumeralsfForPageNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		String finalString = "";
		int manipulator = 0;
		
		String[] romanHundreds = {"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
		String[] romanTeens = {"X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
		String[] romanUnits = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
		
		manipulator = number / 100;
		if(manipulator != 0)
			finalString += romanHundreds[manipulator - 1];
		
		number -= manipulator * 100;
		
			manipulator = number / 10;
		
		if(manipulator != 0 )
			finalString += romanTeens[manipulator - 1];
		
		number -= manipulator * 10;
		manipulator = number;
		
		if(manipulator != 0)
			finalString += romanUnits[manipulator - 1];
		
		number -= manipulator;
		
		System.out.println(finalString);
		
		
	}

}
