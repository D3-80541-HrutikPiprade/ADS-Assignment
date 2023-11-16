package com.sunbeam;

import java.util.Scanner;

public class Program {
	
	public static int linearSearch(int arr[],int key) {
		for(int i = arr.length-1;i>=0;i--)
		{
			if(arr[i]==key)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = {11,22,55,33,99,77,55,33};
		System.out.println("Enter key to search for last occurance :");
		int key= new Scanner(System.in).nextInt();
		int index = linearSearch(arr, key);
		if(index==-1)
			System.out.println("key not found !!!");
		else
			System.out.println("key found at index "+ index);

	}

}
