package com.sunbeam;

import java.util.Scanner;

public class Program {
	public static int searchById(Employee [] arr,int key) {
		for(int i =0; i<arr.length;i++)
		{
			if(key==arr[i].getEmpid())
				return i;
		}
		
		return -1;
	}

	public static int searchByName(Employee [] arr,String key) {
		for(int i =0; i<arr.length;i++)
		{
			if(arr[i].getName().compareTo(key)==0)
				return i;
		}
		
		return -1;
	}
	
	public static int searchBySalary(Employee [] arr,double key) {
		for(int i =0; i<arr.length;i++)
		{
			if(key==arr[i].getSalary())
				return i;
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		Employee arr[]= {
				new Employee(1,"hrutik",50000),
				new Employee(5,"piprade",30000),
				new Employee(3,"abc",70000),
				new Employee(2,"xyz",15000),
				new Employee(4,"java",25000)
		};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id to search : ");
		int id = sc.nextInt();
		int index = searchById(arr, id);
		if(index==-1)
			System.out.println("Id not found!!!");
		else
		{
			System.out.println("Id found at index : "+ index);
			System.out.println(arr[index].toString());
		}
		
		
		System.out.println("Enter the name to search : ");
		String name = sc.next();
		int indx = searchByName(arr, name);
		if(indx==-1)
			System.out.println("name not found!!!");
		else
		{
			System.out.println("name found at index : "+ indx);
			System.out.println(arr[indx].toString());
		}
		
		
		System.out.println("Enter the Salary to search : ");
		double salary = sc.nextDouble();
		int idx = searchBySalary(arr, salary);
		if(idx==-1)
			System.out.println("salary not found!!!");
		else
		{
			System.out.println("salary found at index : "+ idx);
			System.out.println(arr[idx].toString());
		}
		
	}

}
