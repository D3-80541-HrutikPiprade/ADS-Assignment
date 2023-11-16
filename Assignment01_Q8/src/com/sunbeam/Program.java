package com.sunbeam;

import java.util.Scanner;

public class Program {
	
	public static int findRank(int arr[],int key) {
		int rank =0;
		for(int i =0; i<arr.length;i++) {
			if(arr[i]<=key)
				rank++;
		}
		return rank;
	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 15, 3, 4, 4, 1 };
		System.out.println("Enter the the number to find rank : ");
		int key = new Scanner(System.in).nextInt();
		int rank = findRank(arr, key);
		
		System.out.println("The rank of "+key + " is : "+ rank);

	}

}
