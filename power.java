package com.kn.forloop;
import java.util.Scanner;
public class power {
	public static void main(String[] args) {
		long n,p,r=1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter base = ");
		n=scan.nextLong();
		System.out.println("Enter power = ");
		p=scan.nextLong();
		r= intcalpower(n,p);
		System.out.println(n+"^" +p+"="+r);
		scan.close();
	}
	 static long intcalpower(long n1, long p1)
	 {
		 long r1=1;
		for(int i=1;i<=p1;i++)
			r1*=n1;
		return r1;
	}
}