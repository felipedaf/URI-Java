package beginner;

import java.math.BigInteger;
import java.util.Scanner;

public class LittleDucks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			BigInteger ducksQnt = new BigInteger(sc.nextLine());
						
			if(ducksQnt.compareTo(new BigInteger("0")) < 0)
				break;
			
			else if(ducksQnt.compareTo(new BigInteger("0")) == 0)
				System.out.println("0");
			else if(ducksQnt.compareTo(new BigInteger("0")) > 0)
				System.out.println(ducksQnt.subtract(new BigInteger("1")).toString());
		}
		
		
		
	}

}
