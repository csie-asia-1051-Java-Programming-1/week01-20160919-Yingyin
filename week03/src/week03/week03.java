package week03;

import java.util.Scanner;

public class week03 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
	    double a,b = 0;
	    a=sca.nextDouble();
	    a=Math.round(a);
	    for(int i=0;i<5;i++)
	    {
	    	b=sca.nextDouble();
	    	b=Math.round(b);
	    	if(a>b)
	    	{
	    		a=b;
	    	}
	    }
	    System.out.print(b +"為最小值");
	
	}

}
