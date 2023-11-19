package com.sunbeam;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Queue qu = new Queue(5);
		Scanner sc = new Scanner(System.in);
		int choice;
		
		while(true) {
			System.out.println("0. Exit \n1. Push \n2. Pop \n3. Peek");
			System.out.println("Enter your choice: ");
			choice= sc.nextInt();
			switch (choice) {
			case 0:
				System.out.println("Thank you!!");
				System.exit(0);
				break;
			case 1:
				if(qu.isFull())
					System.out.println("Queue is full!!!");
				else {
					System.out.println("Enter ele:");
					int ele = sc.nextInt();
					qu.push(ele);
				}
				break;
			case 2:
				if(qu.isEmpty()) 
					System.out.println("Queue is empty!!");
				else 
					System.out.println("Popped ele : "+ qu.pop());
				break;
				
			case 3:
				if(qu.isEmpty()) 
					System.out.println("Queue is empty!!");
				else 
					System.out.println("Peeked ele : "+ qu.peek());
				break;
			default:
				System.out.println("Enter valid input!!");
				break;
			}
		}

	}

}
