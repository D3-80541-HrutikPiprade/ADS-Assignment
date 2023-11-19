package com.sunbeam;

public class CircularQueue {
	private int arr[];
	private int front;
	private int rear;
	private final int SIZE;
	private int count;
	
	public CircularQueue(int size) {
		SIZE = size;
		arr = new int[SIZE];
		front = rear = -1;
		count =0;
	}
	
	public void push(int ele) {
		rear= (rear+1)%SIZE;
		arr[rear]=ele; 
		count++;
	}
	
	public int pop() {
		front = (front+1)%SIZE;
		count--;
		return arr[front];
	}
	
	public int peek() {
		return arr[(front+1)%SIZE];
	}
	
	public boolean isFull() {
		return count==SIZE;
	}
	public boolean isEmpty() {
		return count==0;
	}

}
