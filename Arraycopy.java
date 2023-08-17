package com.kn.Arrays;
import java.util.Scanner;
public class Arraycopy {
	  public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
		  System.out.println("Enter Array size = ");
		  int arr [] = new int[scan.nextInt()];
		  //Array initialization
		  for(int i=0;i<arr.length;i++) {
			  System.out.println("Enter elements "+ (i+1)+":");
			  arr[i]=scan.nextInt();
		  }
		  scan.close();
		  int []crr = copyarray(arr);
		  System.out.println("Array intialization ");
		  for(int i=0;i<crr.length;i++) {
			  System.out.print(crr[i]+" ");
		  }  
		 }   
	 static int[] copyarray(int[] arr) {
		 int brr[] = new int[arr.length];
		 for(int i=0;i<arr.length;i++) {
			 System.out.println(arr[i]);
			 brr[i] = arr[i];
		 }
		 return brr;
	 }
}