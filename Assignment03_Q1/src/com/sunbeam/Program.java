package com.sunbeam;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Stack st = new Stack(5);
		int max=0;
		Scanner sc = new Scanner(System.in);
		while(!st.isFull()) {
			System.out.println("Enter ele to push :");
			int x = sc.nextInt();
			if(x>max)
				max=x;
			st.push(x);
		}
		System.out.println("Max value in stack :"+ max);
	}
}
