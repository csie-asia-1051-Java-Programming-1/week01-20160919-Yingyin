package week01;

import java.util.Scanner;

public class week01 {

	public static void main(String[] args) {
	
		Scanner sca = new Scanner(System.in);
	    System.out.println("請輸入n");
	    int n;
	    n=sca.nextInt();
	    double b;
	    b=Math.log(n)/Math.log(2);
	    if((b-(int)b)>0)
	    {
	    b=(int) b+1;
	    }
	    System.out.print("運算后為："  + b);
	}

}
