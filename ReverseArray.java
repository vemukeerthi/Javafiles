package com.kn.Arrays;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Array declaration
		int[]arr;
		//Array creation
		System.out.println("Enter Array size = ");
		arr = new int[scan.nextInt()];
		//Array initialization
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter the data" + (i+1)+ " = ");
			arr[i]= scan.nextInt();
		}
		//Array BackTraversing
		Traverse(arr);
scan.close();
	}
	 static void Traverse(int[] arr) {
		 for(int i=arr.length-1;i>=0;i--) {
				System.out.print(arr[i]+" ");
			}
	}

}
