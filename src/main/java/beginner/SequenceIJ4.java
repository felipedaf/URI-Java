package beginner;

public class SequenceIJ4 {

	public static void main(String[] args) {

		double i = 0;
		double j = 1;
		String output = "";
		
		while(i <= 2) {
			String strI = String.format("%.1f", i);
			String strJ1 = String.format("%.1f", j);
			String strJ2 = "";
			String strJ3 = "";
			
			if(Double.parseDouble(strI) % 1 == 0)
				strI = String.format("%.0f", i);
			else
				strI = String.format("%.1f", i);
			
			if(Double.parseDouble(strJ1) % 1 == 0) {
				strJ1 = String.format("%.0f", j); 
				strJ2 = String.format("%.0f", j+1); 
				strJ3 = String.format("%.0f", j+2); 
			}
			else {
				strJ1 = String.format("%.1f", j); 
				strJ2 = String.format("%.1f", j+1); 
				strJ3 = String.format("%.1f", j+2); 
			
			}
			
			System.out.println(String.format("I=%s J=%s", strI, strJ1));
			System.out.println(String.format("I=%s J=%s", strI, strJ2));
			System.out.println(String.format("I=%s J=%s", strI, strJ3));
			
			i += 0.2;
			j += 0.2;
			
			
		}
		
		
		
	}

}
