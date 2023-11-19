package com.sunbeam;

public class Queue {
	private int arr[];
	private int front;
	private int rear;
	private final int SIZE;
	
	public Queue(int size) {
		SIZE = size;
		arr= new int[SIZE];
		front=0;
		rear =0;
	}
	public void push(int ele) {
		arr[rear++]=ele;
	}
	public int pop() {
		return arr[front++];
	}
	public int peek() {
		return arr[front];
	}
	
	public boolean isEmpty() {
		return front ==rear;
	}
	
	public boolean isFull() {
		return rear==SIZE;
	}
	
}
