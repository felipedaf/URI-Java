package beginner;

import java.util.Scanner;

public class Grenais {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		boolean newGrenal = true;
		int inter = 0;
		int gremio = 0;
		int games = 0;
		
		
		
		while(newGrenal) {
			newGrenal = false;
			
			String[] gols = sc.nextLine().split(" ");
			
			if(Integer.parseInt(gols[0]) > Integer.parseInt(gols[1]))
				inter++;
			else if(Integer.parseInt(gols[1]) > Integer.parseInt(gols[0]))
				gremio++;
			
			games++;
			
			System.out.println("Novo grenal (1-sim 2-nao)");
			String answer = sc.nextLine();
			
			if(Integer.parseInt(answer) == 1)
				newGrenal = true;
			
		}
		
		System.out.println(String.format("%d grenais", games));
		System.out.println(String.format("Inter:%d", inter));
		System.out.println(String.format("Gremio:%d", gremio));
		System.out.println(String.format("Empates:%d", (games - inter - gremio)));
		if(inter > gremio)
			System.out.println("Inter venceu mais");
		else if(gremio > inter)
			System.out.println("Gremio venceu mais");
		else
			System.out.println("Não houve vencedor" );
		
	}

}
