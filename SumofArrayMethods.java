package com.kn.Arrays;

import java.util.Scanner;

public class SumofArrayMethods {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the arr size = ");
		int arr[] = new int[scan.nextInt()];
		//System.out.println("Enter the brr size = ");
		int brr[] = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Elements in arr"+ (i+1) + " : ");
			arr[i]=scan.nextInt();
			for(int j=0;j<brr.length;j++) {
				System.out.println("Elements in brr" +(j+1) + " : ");
				brr[j]=scan.nextInt();
			}
		}
		 SumofArrays(arr,brr);
scan.close();
	}
	 static void SumofArrays(int[] arr, int[] brr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<brr.length;j++) {
			int crr =arr[i] + brr[j];
				System.out.println(crr);
			}
		}
		
		
	}
}

