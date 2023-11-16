package com.sunbeam;

import java.util.Scanner;

public class Program {
	
	public static int binarySearch(int arr[], int key) {
		int left=0;
		int right =arr.length-1;
		while(left<=right)
		{
			int mid =(left+right)/2;
			if(key==arr[mid])
				return mid;
			if(key<arr[mid])
				left= mid+1;
			else
				right= mid-1;
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[] = {99,88,77,66,55,44,33,22,11};
		System.out.println("Enter the key : ");
		int key = new Scanner(System.in).nextInt();
		int index= binarySearch(arr, key);
		if(index ==-1)
			System.out.println("key not found !!!");
		else
			System.out.println("key found at index : "+index);
		
	}

}
