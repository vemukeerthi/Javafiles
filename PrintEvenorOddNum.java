package com.kn.Arrays;
import java.util.Scanner;
public class PrintEvenorOddNum {
	public PrintEvenorOddNum(int[] arr) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Array size = ");
		int [] arr = new int[scan.nextInt()];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter element" +(i+1));
			arr[i] =scan.nextInt();
		}
		scan.close();
	
		CountEvenorOdd num = new CountEvenorOdd(arr);
		num.checkevenorodd(arr);
		
	}
}

	


