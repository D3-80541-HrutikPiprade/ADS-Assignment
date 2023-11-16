package com.sunbeam;

public class Program {
	public static int linearSearch(int arr[],int key) {
		int count =0;
		for(int i = 0; i<arr.length ; i++) {
			count++;
			if(arr[i]==key) {
				System.out.println("No. of comparisions in linear search  : "+ count);
				return i;
			}
					
		}
		System.out.println("No. of comparisions linear search : "+ count);
		return -1;
	}
	
	public static int binarySearch(int arr[],int key) {
		int count=0;
		int left =0;
		int right= arr.length-1;
		int mid= (left+right)/2;
		
		while(left<=right) {
			mid= (left+right)/2;
			count++;
		if(key==arr[mid]) {
			System.out.println("No. of comparisions in binary Search : "+ count);
			return mid;
		}
		if(key>arr[mid])
			left =mid+1;
		else 
			right = mid-1;
		}
		System.out.println("No. of comparisions in binary Search : "+ count);
		return -1;
	};
	
	
	public static void main(String[] args) {
		int arr[] = {11,22,33,44,55,66,77,88,99};
		int key = 11;
		System.out.println("By linear search :");
		int index = linearSearch(arr, key);
		if(index==-1)
			System.out.println("key not found!!!");
		else
			System.out.println("key found at index : "+ index);
		
		System.out.println("By binary search : ");
		int indx = binarySearch(arr, key);
		if(indx ==-1)
			System.out.println("key not found !!!");
		else
			System.out.println("key found at index : "+ indx);

	}

}
