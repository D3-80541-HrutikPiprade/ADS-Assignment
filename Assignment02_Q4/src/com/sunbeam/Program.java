package com.sunbeam;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Stack st = new Stack(4);
		Scanner sc = new Scanner(System.in);
		
		int choice;
		
		do{
			System.out.println("\n0. Exit \n1. Push \n2. Pop \n3. Peek ");
			System.out.println("Enter your choice:");
			choice = sc.nextInt();
			switch (choice) {
			case 0:
				System.out.println("Thank you!!!");
				break;
			case 1:
				if(st.isFull())
					System.out.println("Stack is full!!!");
				else {
					System.out.println("Enter ele to push : ");
					st.push(sc.nextInt());
				}		
				break;
			case 2:
				if(st.isEmpty())
					System.out.println("Stack is Empty...Noting to pop!!");
				else {
					System.out.println("Popped Element : "+ st.pop());
				}
				break;
			case 3:
				if(st.isEmpty())
					System.out.println("Stack is Empty...Noting to peek!!");
				else {
					System.out.println("Peeked Element : "+ st.peek());
				}
				break;
			default:
				System.out.println("Enter valid input!!!");
				break;
			}
		}while(choice!=0);

	}

}
