package com.sunbeam;

import java.util.Arrays;

public class Program {
	public static void insertionSort(Employee arr[],int N) {
		for(int i =1; i<N ; i++) {
			Employee temp = arr[i];
			int j;
			for(j=i-1; j>=0 &&  arr[j].getSalary()>temp.getSalary() ; j--) {
					if(temp.getSalary()<arr[j].getSalary())
							arr[j+1] = arr[j];
			}
			arr[j+1]= temp;
		}
			
	}
	public static void main(String[] args) {
		Employee arr[]= {
				new Employee(1,"hrutik",50000),
				new Employee(5,"piprade",30000),
				new Employee(3,"abc",70000),
				new Employee(2,"xyz",15000),
				new Employee(4,"java",25000)
		};
		System.out.println("Before sort: ");
		for(Employee e : arr)
			System.out.println(e);
		
		insertionSort(arr,arr.length);
		System.out.println("After sort: ");
		for(Employee e : arr)
			System.out.println(e);
	}

}
