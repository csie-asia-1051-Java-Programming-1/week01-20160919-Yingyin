package week02;

import java.util.Random;
import java.util.Scanner;

public class week02 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		Random ran = new Random();
		System.out.println("請輸入n");
		int n;
		n=sca.nextInt();
		int a;
		for(int i=0;i<6;i++)
		{
			a=ran.nextInt(n)+1;
			System.out.print(a+ "" );
			
		}
	}

}
