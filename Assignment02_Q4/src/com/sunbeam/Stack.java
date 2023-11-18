package com.sunbeam;

public class Stack {
	private int[] arr;
	private final int SIZE;
	private int top;
	
	public Stack(int size) {
		SIZE = size;
		top = SIZE;
		arr= new int[SIZE];
	}
	
	public void push(int ele) {
		top--;
		arr[top]=ele;
	}
	
	public int pop() {
		return arr[top++];
	}
	
	public int peek() {
		
		return arr[top];
	}
	
	public boolean isEmpty() {
		return top==SIZE;
	}
	
	public boolean isFull() {
		return top == 0;
	}
}
