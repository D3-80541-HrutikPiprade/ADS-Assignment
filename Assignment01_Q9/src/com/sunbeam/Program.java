package com.sunbeam;

import java.util.Arrays;

public class Program {
	
	public static int selectionSort(int arr[]) {
		int count=0;
		for(int i =0; i<arr.length;i++) {
			for(int j=i+1;j<arr.length; j++) {
				count++;
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]= temp;
				}
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		int[] arr = {44, 11, 55, 22, 66, 33};
		System.out.println("Array before sort: "+ Arrays.toString(arr));
		int comp = selectionSort(arr);
		System.out.println("Array after sort: "+ Arrays.toString(arr));
		System.out.println("No. of comparisions : "+ comp);


	}

}
