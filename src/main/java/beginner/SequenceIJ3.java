package beginner;

public class SequenceIJ3 {
	public static void main(String[] args) {
		
		int i = 1;
		int j = 7;
		
		while(i <= 9) {
			System.out.println(String.format("I=%d J=%d\n"
											+ "I=%d J=%d\n"
											+ "I=%d J=%d", i, j, i, j-1, i, j-2));
			
			i+= 2;
			j+= 2;
		}
		
	}

}
