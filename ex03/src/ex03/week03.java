package ex03;

import java.util.Scanner;

public class week03 {

	public static void main(String[] args) {
		Scanner sca= new Scanner (System.in);
		System.out.println("請輸入a");
		double a;
		a=sca.nextDouble();
		System.out.println("請輸入b");
		double b;
		b=sca.nextDouble();
		double c;
		c=Math.pow(a, b);
		System.out.print("運算后為：" + c);
	}

}
