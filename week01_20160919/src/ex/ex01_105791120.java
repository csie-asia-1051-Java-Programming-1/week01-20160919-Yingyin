package ex;
/*
 * Topic: 請寫一個程式讓使用者輸入「華氏」溫度，輸出「攝氏」溫度 (華氏 = 攝氏*(9/5)+32)
 * Date: 2016/09/19
 * Author: 105791120 杨钰莹
 */
import java.util.Scanner;
public class ex01_105791120 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		double a,b;
		a=scn.nextDouble();
		b=5*(a-50)/9+10;
		System.out.println(b);
		
	}

}
