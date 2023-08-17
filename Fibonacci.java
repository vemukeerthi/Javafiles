package com.kn.forloop;
import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
		int num=13, nextNumber = 0;
        int firstnumber = 0, secondnumber=1;
		Scanner scan = new Scanner(System.in);
		System.out.print("Fibonacci series of numbers = ");
		series(num,firstnumber,secondnumber,nextNumber);
		scan.close();
		        }
	 static void series(int num, int firstnumber, int secondnumber, int nextNumber) {
		// int num=15, nextNumber = 0;
	       // int firstnumber = 0, secondnumber=1;
	        System.out.print(firstnumber + " " + secondnumber +" ");
	        for(int i=3;i<=num;i++) {
	        	nextNumber = firstnumber + secondnumber;
	        	System.out.print(nextNumber+ " ");
	        	firstnumber = secondnumber;
	        	secondnumber = nextNumber;
		// TODO Auto-generated method stub
		
	}

	}
	 }


