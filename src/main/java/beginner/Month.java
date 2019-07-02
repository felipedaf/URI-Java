package beginner;

import java.util.Scanner;

public class Month {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int month = sc.nextInt();
		
		String[] months = new String[12];
		months[0] = "January";
		months[1] = "February";
		months[2] = "March";
		months[3] = "April";
		months[4] = "May";
		months[5] = "June";
		months[6] = "July";
		months[7] = "August";
		months[8] = "September";
		months[9] = "October";
		months[10] = "November";
		months[11] = "December";
		
		
		System.out.println(months[month - 1]);
	}

}
