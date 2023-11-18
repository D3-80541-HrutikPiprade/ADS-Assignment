package com.sunbeam;

import java.util.Scanner;

public class Program {
	public static int priority(char c) {
		switch (c) {
		case '$': return 10;
		case '/': return 9;
		case '*': return 9;
		case '%': return 9;
		case '+': return 8;
		case '-': return 8;
		
		}
		return 0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the operator:");
		char c = sc.next().charAt(0);
		
		System.out.println("Priority : "+ priority(c));
		
	}

}
