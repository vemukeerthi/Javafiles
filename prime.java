package com.kn.forloop;
import java.util.Scanner;
public class prime {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int num = scan.nextInt();
		int count =0;
		Prime(num,count);
		scan.close();
	}
	 static void Prime(int num, int count) {
		 for(int i =2; i<=num/2;i++)
				if(num%i==0)
					count++;
			if(count!=2)
				System.out.println(num + " is  a prime");
			else
				System.out.println(num + " is not a  prime");
		
	}

}
