package beginner;

public class SSequence2 {

	public static void main(String[] args) {

		int down = 1;
		double sum = 0;
		
		for(int up = 1; up <= 39; up+= 2) {
			sum += up / ((double) down);
			down *= 2;
		}
		
		System.out.println(String.format("%.2f", sum));
		
		
	}

}
