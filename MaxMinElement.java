package com.kn.Arrays;
import java.util.Scanner;
public class MaxMinElement {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Array size = ");
		int arr[] = new int[scan.nextInt()];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Element "+(i+1)+":");
			arr[i]=scan.nextInt();
		}
		scan.close();
		int minvalue = arr[0];
		int maxvalue =arr[0];
		minMaxElement(arr,minvalue,maxvalue);
	}
	 static void minMaxElement(int[] arr, int minvalue, int maxvalue) {
		 for(int i:arr) {
		if(i>maxvalue) {
			maxvalue=i;
			System.out.println("Maximum value = "+maxvalue);
			}
		
		else if(i<minvalue){
			minvalue=i;
			System.out.println("Minimum value = "+minvalue);
			
		}
	 }
}
}
