package com.kn.forloop;
import java.util.Scanner;
public class Factors {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int num = scan.nextInt();
		factors(num);
		scan.close();
	}
	 static void factors(int num) {
		 for(int i =1;i<=num;i++)
			if(num%i==0)
			System.out.println(i);
		// TODO Auto-generated method stub
		
	}

}

