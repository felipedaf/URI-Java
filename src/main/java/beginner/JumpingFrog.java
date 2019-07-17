package beginner;

import java.util.Scanner;

public class JumpingFrog {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int jumpHeight = sc.nextInt();
		
		int times = sc.nextInt();
		
		boolean won = true;
				
		int previous = 0;
		for(int i = 0; i < times; i++) {
			int height = sc.nextInt();
			if(i != 0 && (height - previous > jumpHeight || previous - height > jumpHeight)) {
				won = false;
				break;
			}
			previous = height;
		}
		
		if(won)
			System.out.println("YOU WIN");
		else
			System.out.println("GAME OVER");
	}

}
