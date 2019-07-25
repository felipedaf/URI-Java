package beginner;

import java.util.Scanner;

public class BarbecueAtYuris {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int times = Integer.parseInt(sc.nextLine());
			String[] meets = new String[times * 2];
			
			for(int i = 0; i < times; i++) {
				String[] input = sc.nextLine().split(" ");
				if(i == 0) {
					meets[i * 2] = input[0];
					meets[(i * 2) + 1] = input[1];
					continue;
				}
				
				int jumpIndex = 1;
				boolean defaultInsert = false;
				
				while(meets[jumpIndex] != null && Integer.parseInt(meets[jumpIndex]) <= Integer.parseInt(input[1])) {
					jumpIndex += 2;
				}
				
				if(meets[jumpIndex] == null)
					defaultInsert = true;
				
				if(defaultInsert) {
					meets[jumpIndex] = input[1];
					meets[jumpIndex - 1] = input[0];
				}
				else {
					for(int j = meets.length - 1; j >= jumpIndex + 2; j -= 2) {
						meets[j] = meets[j - 2];
						meets[j - 1] = meets[j - 3];
					}
					
					meets[jumpIndex] = input[1];
					meets[jumpIndex - 1] = input[0];
				}
			}
			
			for(int i = 0; i < meets.length; i += 2 ) {
				if(i == meets.length - 2)
					System.out.println(meets[i]);
				else
					System.out.print(meets[i] + " ");
			}

		}
		sc.close();
	}

}
