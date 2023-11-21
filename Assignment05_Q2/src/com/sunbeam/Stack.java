package com.sunbeam;

public class Stack {
	private LinkedList list;
	public Stack() {
		list = new LinkedList();
	}
	public void push(int value) {
		list.addFirst(value);
	}
	
	public int pop() {
		return list.delFirst();
	}
	
	public int peek() {
		return list.getHeadData();
	}
}
