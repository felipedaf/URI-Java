package beginner;

import java.util.Scanner;

public class Interval2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int qnt = sc.nextInt();
		int in = 0;
		
		for(int i = 0; i < qnt; i++) {
			
			int number = sc.nextInt();
			
			if(number >= 10 && number <= 20)
				in++;
			
		}
		
		System.out.println(String.format("%d in\n"
										+	"%d out", in, (qnt - in)));
	}

}
