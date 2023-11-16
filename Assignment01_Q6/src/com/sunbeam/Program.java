package com.sunbeam;

import java.util.Scanner;

public class Program {
	public static int linearSearchForNthOcc(int arr[],int key,int n)
	{
		int count=0;
		for(int i =0; i< arr.length; i++) {
			if(arr[i]==key) {
				count++;
				if(n==count)
					return i;
			}
		}
		return -1;
		
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,2,1,5,7,3,9,5,7,3,2,2,1,2};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the key to find : ");
		int key = sc.nextInt();
		System.out.println("Enter the occurance to find : ");
		int n = sc.nextInt();
		
		int index = linearSearchForNthOcc(arr, key, n);
		if(index==-1)
			System.out.println("key not found for "+ n+ "th occurance");
		else
			System.out.println("key found for "+ n +"th occurance at index : "+index);
	}

}
