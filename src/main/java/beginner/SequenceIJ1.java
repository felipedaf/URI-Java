package beginner;


public class SequenceIJ1 {
	public static void main(String[] args) {
		
		int i = 1;
		int j = 60;
		
		while(j >= 0) {
			System.out.println(String.format("I=%d J=%d", i, j));
			i += 3;
			j -= 5;
		}
		
		
	}

}
