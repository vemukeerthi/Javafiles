package com.kn.Arrays;

import java.util.Scanner;

public class OddArray1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Array declaration
		int arr[];
		//Array creation
		System.out.println("Enter arraay size = ");
		arr =new int[scan.nextInt()];
		//Array initialization
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the elements "+(i+1)+ " = ");
			arr[i]= scan.nextInt();
		}
		OddArray(arr);
		scan.close();
	}

	 static void OddArray(int[] arr) {
		//Array traversing
			for(int i=0;i<arr.length;i++) {
				if(arr[i]%2!=0)
					System.out.println("Odd numbers = " + arr[i]);
			}
	}

}
