package beginner;

public class SSequence {

	public static void main(String[] args) {

		double sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			sum += 1/((double) i);
		}
		
		System.out.println(String.format("%.2f", sum));
		
		
	}

}
