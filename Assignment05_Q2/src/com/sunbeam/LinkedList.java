package com.sunbeam;

public class LinkedList {
	static class Node{
		private int data;
		private Node next;
		public Node(int value) {
			data = value;
			next = null;
		}
	}
	private Node head;
	private Node tail;
	
	public LinkedList() {
		head=null;
		tail= null;
	}
	
	public boolean isEmpty() {
		return head==null && tail == null;
	}
	
	public void addFirst(int value) {
		Node nn = new Node(value);
		if(isEmpty())
			head = tail = nn;
		else {
			nn.next= head;
			head = nn;
		}	
	}
	
	public void display() {
		if(isEmpty())
			return;
		else {
			System.out.print("List : ");
			Node trav = head;
			while(trav!= null) {
				System.out.print(trav.data+ " ");
				trav = trav.next;
			}
		}
	}
	
	public void addLast(int value) {
		Node nn = new Node(value);
		if(isEmpty())
			head = tail = nn;
		else {
			tail.next= nn;
			tail = nn;
		}	
	}
	
	
	public int delFirst() {
		int r = 0;
		if(isEmpty())
			return r;
		else if(head== tail) {
			r = head.data;
			head = tail = null;
		}
		else {
			r = head.data;
			head = head.next;
			return r;
		}
		return 0;
	}
	
	public void delLast() {
		if(isEmpty())
			return;
		else if(head == tail)
			head = tail = null;
		else {
			Node trav= head;
			while(trav.next.next!=null)
				trav= trav.next;
			trav.next = null;
			tail = trav;
				
		}
	}
	
	public int getHeadData() {
		if(isEmpty())
			return 0;
		return head.data;
	}
	
}
