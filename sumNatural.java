package com.kn.forloop;
import java.util.Scanner;
public class sumNatural {
	public static void main(String[] args) {
		int r;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number = ");
		int num =scan.nextInt();
		 r = intCalculatesum(num);
		 System.out.println(num+r);
		 scan.close();
	}
	 static int intCalculatesum(int num) {
		 int sum=0;
		 for(int i=1;i<num;i++)
			 sum+=i;
		return sum;
	}
}