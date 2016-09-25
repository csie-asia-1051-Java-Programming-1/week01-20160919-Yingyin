package ex02;

import java.util.Scanner;

public class week02 {

	public static void main(String[] args) {
			Scanner sca= new Scanner (System.in);
			System.out.println("請輸入公斤");
			double a;
			a= sca.nextDouble();
			double b;
			b=a/0.45359;
			System.out.print("運算后為：" + b + "磅");

	}

}
