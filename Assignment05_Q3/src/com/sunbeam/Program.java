package com.sunbeam;

public class Program {

	public static void main(String[] args) {
		Deque dq = new Deque();
		dq.popLast();
		dq.pushFirst(10);
		dq.pushLast(20);
		dq.pushLast(30);
		dq.popLast();
		dq.popLast();
	}

}
