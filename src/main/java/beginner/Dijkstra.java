package beginner;

import java.util.HashSet;
import java.util.Scanner;

public class Dijkstra {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<String> strings = new HashSet<String>();
		int qnt = 0;
		
		while(sc.hasNext()) {
			String input = sc.nextLine();
			if(!strings.contains(input)) {
				strings.add(input);
				qnt++;
			}
		}
		sc.close();
		
		System.out.println(qnt);
		
	}

}
