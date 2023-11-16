package com.sunbeam;

public class Program {
	
	public static int nonRepeatingEle(int arr[])
	{
		int count;
		for(int i =0; i<arr.length;i++) {
			count =0;
			for(int j =0;j<arr.length;j++) {
				if(arr[i]==arr[j])
					count++;
			}
			if(count==1)
				return arr[i];
		}
		return 100;
	}
	
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
		
		int occ= nonRepeatingEle(arr);
		if(occ==100)
			System.out.println("All elements are repeated");
		else
			System.out.println("the first non-repeating element is : "+ occ);
		
	}

}
