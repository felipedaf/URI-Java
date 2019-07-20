package beginner;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CMaisOuMenos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Map<String, Integer> vitaminC = new HashMap<String, Integer>();
		vitaminC.put("sucodelaranja", 120);
		vitaminC.put("morangofresco", 85);
		vitaminC.put("mamao", 85);
		vitaminC.put("goiabavermelha", 70);
		vitaminC.put("manga", 56);
		vitaminC.put("laranja", 50);
		vitaminC.put("brocolis", 34);
		
		while(sc.hasNext()) {
			int qnt = 0;
			
			
			int times = Integer.parseInt(sc.nextLine());
			
			for(int i = 0; i < times; i++) {
				String[] order = sc.nextLine().split(" ");
				String type = "";
				for(int j = 1; j < order.length; j++)
					type += order[j];
				
				qnt += Integer.parseInt(order[0]) * vitaminC.get(type);
			}
			
			if(qnt == 0)
				continue;
			if(qnt > 130)
				System.out.println(String.format("Menos %d mg", qnt - 130));
			else if(qnt < 110)
				System.out.println(String.format("Mais %d mg", 110 - qnt));
			else
				System.out.println(qnt + " mg");
			
		}
		sc.close();
		
	}

}
