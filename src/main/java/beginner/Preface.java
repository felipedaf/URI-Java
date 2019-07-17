package beginner;

import java.util.Scanner;

public class Preface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int b = sc.nextInt();
		
		int q = 0;
		
		int r = 0;
		
		int f = 0;
		
		int e = 0;
		
		q = a/b;
		r = a%b;
		
		if(a<0)
	    {
	        e=b;
	        if(b<0) e=b*-1;
	        for(r=0; r<e; r++)
	        {
	            f=a-r;
	            if(f%b==0) break;
	        }
	        q=f/b;
	    }
	    else
	    {
	        q=a/b;
	        r=a%b;
	    }
		
		System.out.println(String.format("%d %d", q, r));
	}

}
