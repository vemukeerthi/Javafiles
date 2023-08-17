package com.kn.Arrays;
import java.util.Scanner;
public class sumofnum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Array size = ");
		int []arr = new int [scan.nextInt()];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter element" + (i+1)+ ":");
			arr[i]=scan.nextInt();
		}
		scan.close();
		int sum = findSumofelements(arr);
		System.out.print("Sum of elements in given array: " + sum); 
	}
	 static int findSumofelements(int[] arr) {
		 int sum = 0;  
	        for (int i = 0; i < arr.length; i++) {  
	           sum = sum + arr[i];  
	        }  
		return sum;
	}

}
