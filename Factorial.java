package com.kn.forloop;
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		long n,num,fact=1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number = ");
		 num=scan.nextInt();
		 n=factorail(num,fact);
		scan.close();
		}
	 static   long factorail(long num, long fact) {
		 for(int i=1;i<=num;i++) {
				fact=fact*i;
			System.out.println("fact = " +fact );
		 }
		return fact;
}
}


