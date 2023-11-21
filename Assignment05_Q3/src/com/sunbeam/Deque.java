package com.sunbeam;

public class Deque {
	private DDLinkedList dl;
	public Deque() {
		dl = new DDLinkedList();
	}
	
	
	public boolean isEmpty() {
		return dl.isEmpty();
	}
	
	public void pushFirst(int value) {
		dl.addFirst(value);	
	}
	
	public void pushLast(int value) {
		dl.addLast(value);
	}
	
	public void popLast() {
		if(isEmpty())
			return;
		else
			dl.deleteLast();	
	}
}
