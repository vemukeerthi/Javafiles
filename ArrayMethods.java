package com.kn.Arrays;

import java.util.Scanner;

public class ArrayMethods {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Array Declaration and Array creation
		System.out.println("Enter Array size = ");
		int[]arr= new int[scan.nextInt()];
		//Array Intialization
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter the data "+ (i+1)+ " = ");
			arr[i]= scan.nextInt();
		}
		///Array Traversing
		method(arr);
scan.close();
	}

	 static void method(int[] arr) {
		 for(int i=0;i<arr.length;i++) {
				System.out.println(arr[i]);
			}
		// TODO Auto-generated method stub
		
	}

}

