package com.sunbeam;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		CircularQueue cq = new CircularQueue(5);
		Scanner sc = new Scanner(System.in);
		int choice;
		while(true)
		{
			System.out.println("0. EXIT \n1. PUSH \n2. POP \n3. PEEK");
			choice = sc.nextInt();
			switch (choice) {
			case 0:
				System.out.println("Thank you!!");
				System.exit(0);
				
				break;
				
			case 1:
				if(cq.isFull())
					System.out.println("Queue is full !!!");
				else {
					System.out.println("Enter ele:");
					cq.push(sc.nextInt());
				}
				break;
			case 2:
				if(cq.isEmpty())
					System.out.println("Queue is Empty!!");
				else
					System.out.println("Popped ele "+ cq.pop());
				break;
				
			case 3:
				if(cq.isEmpty())
					System.out.println("Queue is Empty!!");
				else
					System.out.println("Peeked ele "+ cq.peek());
				break;
			default:
				System.out.println("Enter valid choice!!!");
				break;
			}
		}

	}

}
