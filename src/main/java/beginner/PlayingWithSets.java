package beginner;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PlayingWithSets {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int times = sc.nextInt();
		Set<Integer>[] sets;
		
		for(int t = 0; t < times; t++) {
			int setsQnt = sc.nextInt();
			
			sets = new HashSet[setsQnt];
			
			for(int i = 0; i < setsQnt; i++) {
				sets[i] = new HashSet<Integer>();
				
				int elementsQnt = sc.nextInt();
				
				for(int e = 0; e < elementsQnt; e++) {
					sets[i].add(sc.nextInt());
				}
				
			}
			
			int operations = sc.nextInt();
			
			for(int o = 0; o < operations; o++) {
				int operation = sc.nextInt();
				int set1 = sc.nextInt() - 1;
				int set2 = sc.nextInt() - 1;
				int sum = 0;
				
				if(operation == 1) {
					for(int num: sets[set1]) {
						if(sets[set2].contains(num))
							sum++;
					}
				}
				else if(operation == 2) {
					sum += sets[set2].size();
					for(int num: sets[set1]) {
						if(!sets[set2].contains(num))
							sum++;
					}
				}
				System.out.println(sum);
			}
		}
		
		
	}

}
