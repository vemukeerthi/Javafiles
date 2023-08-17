package com.kn.Arrays;

import java.util.Scanner;
public class EvenArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Array declaration
		int arr[];
		//Array creation
		System.out.println("Enter the array size = ");
		arr =new int[scan.nextInt()];
		//Array initialization
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter the elements "+(i+1) + " = ");
			arr[i]=scan.nextInt();
		}
		//Array traversing
		EvenAarray(arr);
		scan.close();
	}
	//Method to print even numbers
	 static void EvenAarray(int[] arr) {
		 for(int i=0;i<arr.length;i++) {
				if(arr[i]%2==0)
					System.out.println("Even numbers = "+arr[i]);
				}
	      }
	}


